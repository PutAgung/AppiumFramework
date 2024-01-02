
# Appium-Java Automation Framework

This is a simple Appium-Java automation framework for mobile testing, incorporating Gherkin syntax for behavior-driven development (BDD) and Slack integration for reporting.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Project Structure](#project-structure)
- [Configuration](#configuration)
- [Running Tests](#running-tests)
- [Reporting](#reporting)
- [Customization](#customization)


## Prerequisites
Before using this framework, ensure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Apache Maven
- Appium Server
- Mobile device emulator or physical device

## Setup
1. Clone this repository to your local machine:
```bash
git clone https://github.com/PutAgung/AppiumFramework.git
```
2. Navigate to the project directory:
```bash
cd appium-java-framework
```

3. Install dependencies using Maven:
```bash
mvn clean install
```

## Project Structure

```bash
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── automation
    │           ├── AppiumBase.java
    │           └── SlackReporting.java
    └── test
        └── java
            ├── step_definitions
            │   └── StepDefinitions.java
            ├── runners
            │   └── TestRunner.java
            └── features
                └── MyFeature.feature

```

This structure is represented in a hierarchical way, where:

- `src` is the source directory containing both main and test subdirectories.
- `main` contains Java source code organized in the `automation` package.
- `test` contains Java source code for test-related components, such as step definitions, runners, and feature files.
- `pom.xml` is the Maven configuration file.
- `README.md` is the Markdown file providing documentation for the project.


## Configuration
1. Open the **AppiumBase.java** file in the automation package.
2. Update the Appium capabilities as per your application requirements.

## Running Tests
Execute the test suite using the following Maven command:
```bash
mvn test
```
To run specific scenarios or features, use the --tags option:
```bash
mvn test -Dcucumber.options="--tags @smoke"
```
## Reporting
Test results are reported to a Slack channel. Ensure you have a Slack webhook URL and update it in the **SlackReporting.java** file.

## Customization
Customize the framework to fit your application and testing needs:

- Add additional capabilities or configurations in **AppiumBase.java**.
- Extend or modify step definitions in **StepDefinitions.java**.
- Customize reporting or integrate with other reporting tools.
