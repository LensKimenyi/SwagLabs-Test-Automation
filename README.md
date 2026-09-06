# SwagLabs Test Automation

## Overview

This project is an automated testing suite for the SwagLabs e-commerce application. It demonstrates end-to-end web testing across key user journeys, including authentication, product interaction, cart management, checkout, navigation, and social media links.

The project uses a structured automation framework and follows the Page Object Model (POM) approach to improve test organization, maintainability, and reusability.

## What Problem Does It Solve?

Manual testing of e-commerce applications can be repetitive and time-consuming, especially when validating critical user journeys repeatedly. This project automates important workflows to help verify that core functionality continues to work reliably after application changes.

## Automated Test Coverage

### Authentication
- Login with valid credentials
- Login with invalid credentials
- Error message validation

### Products
- View product details
- Test product interactions
- Validate multiple products

### Cart Management
- Add products to the cart
- Remove products from the cart
- Validate cart functionality

### Checkout
- Complete checkout workflows
- Enter customer information
- Validate order overview and completion

### Navigation
- Navigate through application pages
- Validate application links
- Test social media navigation

## Tools and Technologies

- Java
- Selenium WebDriver
- JUnit 5
- Maven
- Page Object Model (POM)
- Allure Reporting
- Git and GitHub

## Project Structure

```text
src/test/java/
├── framework/       # Automation framework utilities and configuration
├── pageobjects/     # Page Object Model classes
├── TS_Authentication_JUnit.java
├── TS_Cart_JUnit.java
├── TS_Checkout_JUnit.java
├── TS_Navigation_JUnit.java
└── TS_Product_JUnit.java

## How to Run the Tests

Clone the repository:

git clone <repository-url>
cd Automation-JAV-SwagLabs-Claudine

Run the test suite:

mvn test

## Reporting

The project uses Allure Reporting to provide detailed information about test execution, including test results and execution details.

## My Contribution

I developed and maintained the automated test scenarios, page objects, and test workflows for this project. I also configured the project for portfolio presentation and maintained the test automation implementation.

The underlying automation framework was adapted from training resources and further maintained for use in this project.

## Author

**Claudine Mukakimenyi**

QA Automation Engineer | Quality Engineering | Test Automation

Based in Kigali, Rwanda

[LinkedIn](https://www.linkedin.com/in/claudine-mukakimenyi-4155b61a9/)

