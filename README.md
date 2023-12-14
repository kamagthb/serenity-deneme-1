
This project demonstrates UI test automation, includes scenarios for testing the features of the Net Affinity My Facebook Accounts web application.

This framework showcases the implementation of UI testing using JAVA, Selenium and TestNG.

Prerequisites
- JAVA
- Maven
- An IDE (IntelliJ, Eclipse…)

Installation
Download the zip file/extract and open in IDE

Project tools;
- Build management tool -> Maven
- Language -> Java
- Assertion tool -> TestNG
- Model -> Page Object Model
- Report -> Extent report base64

Features;
- Automated UI tests for the web page.

- **Test Scenarios** contains test steps about (insert-edit-delete) account functionalities
- **Singleton Design Pattern**, in order to use the same WebDriver instance during the test session

- **BrowserUtils** contains ready  methods for utilization

- **Page Object Model (POM),** Page class contains corresponding page elements and actions
- 
  - **Pages;** 
   - AccountsPage
   - AddAccountPage
   - DashboardPage
  
- **BaseTest&Stepİnit**, contains Before methods to set up the WebDriver and instantiate the  objects/After  methods for clean up actions.

- **Steps** for test methods using corresponding page elements.
    - LoginSteps
    - DashboardPageSteps
    - AccountsPageSteps
    - AddAccountPageSteps
  
**ExtentReports** to create meta-data of the report
**Listener** customize  logging and reporting
**Runner.xml** runs the tests

Execute the following command to run the tests:
mvn -test



