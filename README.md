# Skeleton project for TDD and BDD workshops

This is a simple Java and Maven-based skeleton project used in TDD and BDD workshops. It uses:
- Java 11 or higher
- JUnit 5
- Mockito 5
- Cucumber 7

The project uses standard maven file structure conventions:
- src/main/java
- src/main/resources
- src/test/java
- src/test/resources

Here are the primary files:
- pom.xml - maven POM used to retrieve dependencies and build the project
- other/build.gradle - a (not always up-to-date) Gradle build file for those who would prefer to use Gradle instead of Maven
- src/test/java/training/tdd/unit/JUnitSetupTest.java - a JUnit 5 unit test that confirms all dependencies are loaded and working
- src/test/resources/features/selfCheckout.feature - Cucumber feature file with a single scenario
- src/test/java/features/SelfCheckoutSteps.java - Cucumber step definition file with empty steps for the above scenario
- src/test/java/features/CucumberAT.java - Cucumber test runner file
- src/test/resources/junit-platform.properties - JUnit 5 properties are set here. Primarily used for Cucumber test runner properties

To get started:

1. Build the project:

- mvn clean install (or, gradle clean build)

should run without errors.

2. The project should load properly in your IDE
- check dependencies to make sure there are no errors
- verify "Cucumber for Java" IntelliJ plugin is installed and working:
  - selfCheckout.feature should have syntax highlighting
  - navigation from feature file to step definition works - i.e., ctl-space to navigate from any Given/When/Then step to the associate step definition method
  - running Cucumber from the IDE works - i.e., run Cucumber tests directly from selfCheckout.feature