gradle cucumber -Dfeature=src/test/resources/features/test.feature

// to run features with jUnit5
gradle cucumber -Denv=test -Dargs=src/test/resources/features/test.feature

// to run the class with jUnit4
gradlew clean testCucumber --tests cucumber.test.* -i

gradlew clean testCucumber -Denv=test --tests cucumber.test.* -i