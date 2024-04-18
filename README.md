## **Cucumber_Selenium_Automated_Tests** 🥒💻

| **SUMMARY** |
| --- |
| **Welcome to my Java-Selenium automated tests project developed using the Behavior-Driven Development pattern with assistance from the Cucumber framework.** |

## Technologies ⛏ 
* ___Maven___ - Build tools used for managing project dependencies and configuration for the project.
* ___JAVA___ - main Language
* ___WebDriver___ - Selenium web framework that permits to execute tests on Chrome browser
* ___IntelliJ IDEA Community Edition:___ - Integrated Development Environment (IDE) used for writing tests.

## Requirements 🔌
    Java version "21.0.2.0  - installed and configurated
  
    Chrome Version 123.0.6312.58

    Gherkin plug-in - Test description language used in Cucumber.

    Cucumber for Java plug-in - Adds support for Cucumber testing tools with step definitions written in Java.

    ❗❗ Changing the path to the local Webdriver in the code is required to enable test execution. ❗❗

               The rest of the frameworks and tools will be built from dependencies in pom.xml. 


## Tests execution - The first test  

**Test Description:** [First_Task_Login.feature](https://github.com/maciej-siciarski/maciej-siciarski/blob/main/Attachements/First_Task_Steps.png)

**Objective:** The objective of this test is to verify the successful execution of the login functionality and subsequent address creation on the specified platform.

<details>
<summary>Complete Test Step Description: </summary><br>


**Logging in**: The test will log in using the credentials of the designated user.

**Navigating to Addresses**: Upon successful login, the test will navigate to the Addresses section by clicking on the respective tile.

**Creating a New Address:** Once on the Addresses page, the test will initiate the creation of a new address by clicking on the "+ Create new address" button.

**Completing the New Address Form:** The test will fill out the New Address form with the data provided in the Examples table within the Gherkin feature file. This data includes: alias, address, city, zip/postal code, country, and phone number.

**Validating the Added Address:** Upon successful submission of the form, the test will verify the correctness of the added address data. This validation will be performed using [assertions](https://github.com/maciej-siciarski/maciej-siciarski/blob/main/Attachements/Assertions%20JUnit.png) from the JUnit library.

**Expected Outcome:** The expected outcome of this test is the successful execution of all steps outlined above, culminating in the creation of a new address with accurately inputted data.

</details>


https://github.com/maciej-siciarski/Cucumber_Selenium_Automated_Tests/assets/147531793/9f179638-7817-4b83-9890-f763baa606aa



