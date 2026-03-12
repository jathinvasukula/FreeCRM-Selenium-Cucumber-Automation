# FreeCRM Selenium Cucumber Automation Framework

Automation testing framework for the FreeCRM application using **Selenium WebDriver, Java, Maven, and Cucumber BDD**.
This project demonstrates a **Page Object Model (POM) based automation framework** with reusable utilities and configuration management.

---

## Project Overview

This framework automates core functionalities of the FreeCRM application such as login and CRM modules.
It follows industry-standard automation practices like **BDD (Behavior Driven Development)** and **Page Object Model**.

The framework is designed to be **scalable, maintainable, and reusable** for automation testing.

---

## Tech Stack

* Java
* Selenium WebDriver
* Cucumber BDD
* Maven
* Page Object Model (POM)
* JUnit/Test Runner

---

## Framework Architecture

The project follows a layered automation framework structure:

```
FreeCRM-Selenium-Cucumber-Automation
│
├── src/main/java
│   ├── pages
│   │   ├── LoginPage.java
│   │   ├── Contacts.java
│   │   ├── Deals.java
│   │   ├── Companies.java
│   │   ├── Cases.java
│   │   └── Tasks.java
│   │
│   └── util
│       ├── DriverFactory.java
│       ├── ConfigReader.java
│       ├── ActionUtility.java
│       └── ExcelUtility.java
│
├── src/test/java
│   ├── stepdefinitions
│   │   └── FreeCRM.java
│   │
│   └── tests
│       └── TestRunner.java
│
├── src/test/resources
│   ├── features
│   │   └── FreeCRM.feature
│   │
│   └── Testdata
│       └── config.properties
│
├── Testreports
│   └── hrmsLogin-reports.html
│
└── pom.xml
```

---

## Features Automated

The following modules are automated in this project:

* Login functionality
* Contacts module
* Deals module
* Companies module
* Cases module
* Tasks module

---

## Key Framework Components

### Page Object Model

Each web page is represented as a separate class containing page elements and actions.

### Driver Factory

Handles WebDriver initialization and browser configuration.

### Configuration Reader

Reads environment configuration such as browser type and URLs from `config.properties`.

### Utility Classes

Reusable helper methods for actions, waits, and test data management.

---

## BDD Implementation

This framework uses **Cucumber BDD**.

Feature files are written in **Gherkin language**.

Example:

```
Feature: FreeCRM Login

Scenario: Login with valid credentials
Given user is on login page
When user enters valid username and password
Then user should be logged into the application
```

---

## How to Run the Project

1. Clone the repository

```
git clone https://github.com/jathinvasukula/FreeCRM-Selenium-Cucumber-Automation.git
```

2. Import the project as a **Maven project**

3. Install dependencies

```
mvn clean install
```

4. Run the test

Execute the **TestRunner.java** file.

---

## Reports

After execution, HTML test reports are generated inside:

```
Testreports/
```

---

## Author

Jathin V
Automation Test Engineer (Learning Phase)

---

## Future Improvements

* Cross-browser testing
* CI/CD integration
* Docker execution
* Parallel test execution
* Allure reports
