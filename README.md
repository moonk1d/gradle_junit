# gradle_junit

This test automation framework contains setup for the following frameworks:

* UI Part: Gradle -> jUnit5 -> Logback -> Selenide -> Allure2 -> CI Jenkins 
* API Part: Gradle -> jUnit5 -> Logback -> RestAssured -> Allure2 -> CI Jenkins

## Default prerequisites:

1. Installed JDK 11
   1. Created environment variable JAVA_HOME with path to JDK and added to PATH variable.
1. Installed Gradle 6 
   1. Created environment variable GRADLE_HOME with path to Gradle and added to PATH variable.
1. Installed Git  
   1. Created environment variable GIT_HOME with path to Git and added to PATH variable.
1. Installed Allure CLI  
   1. Created environment variable ALLURE_HOME with path to Allure CLI and added to PATH variable.

## Jenkins

### Plugins to install

1. Git plugin
1. Allure Jenkins Plugin
1. Gradle Plugin
1. OkHttp Plugin

### Global Tool Configuration

1. Setup JDK
1. Setup Git
1. Setup Gradle
1. Setup Allure

### Steps to setup job

1. Create freestyle project
1. Setup project repository in Source Code Management
1. Build -> Invoke Gradle Script, select gradle and gradle task to execute.
1. Add Post-build Actions -> Allure Report, setup path to allure-results dir
1. Add Post-build Actions -> Publish JUnit test result report, setup path to Test report XMLs

## To run tests

### To run unit tests:

```shell
gradlew clean test --tests unit.* -i
```

### To run API tests:

```shell
gradlew clean test --tests api.* -i
```

#### The environment variable can be passed to the test run

```shell
gradlew clean test --tests api.* -i -Denv=prod
```

### To run UI tests:

```shell
gradlew clean test --tests ui.* -i
```

#### The environment variable can be passed to the test run

```shell
gradlew clean test --tests ui.* -i -Denv=prod
```