# gradle_junit

This is test automation framework for the following set of tools/frameworks:

Build system: Gradle 6 Test runner: jUnit5 Test reports: Allure 2 CI: Jenkins

## Default prerequisites:

1. Installed JDK 11 1.1 Created environment variable JAVA_HOME with path to JDK and added to PATH
   variable.
2. Installed Gradle 6 2.1 Created environment variable GRADLE_HOME with path to Gradle and added to
   PATH variable.
3. Installed Git  
   3.1 Created environment variable GIT_HOME with path to Git and added to PATH variable.
4. Installed Allure CLI  
   4.1 Created environment variable ALLURE_HOME with path to Allure CLI and added to PATH variable.

## Jenkins

### Plugins to install

1. Git plugin
2. Allure Jenkins Plugin
3. Gradle Plugin
4. OkHttp Plugin

### Global Tool Configuration

1. Setup JDK
2. Setup Git
3. Setup Gradle
4. Setup Allure

### Steps to setup job

1. Create freestyle project
2. Setup project repository in Source Code Management
3. Build -> Invoke Gradle Script, select gradle and gradle task to execute.
4. Add Post-build Actions -> Allure Report, setup path to allure-results dir

## To run tests

### To run unit tests:

```shell
gradlew clean test --tests unit.* -i
```

### To run unit tests:

```shell
gradlew clean test --tests unit.* -i
```

### To run integration tests:

```shell
gradlew clean test --tests integration.* -i
```

### To run UI tests:

```shell
gradlew clean test --tests ui.* -i
```

#### The environment variable can be passed to the test run

```shell
gradlew clean test --tests ui.* -i -Denv=prod
```