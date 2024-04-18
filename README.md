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


## Tests execution - The first test ✅

**Test Description:** [First_Task_Login.feature](https://github.com/maciej-siciarski/maciej-siciarski/blob/main/Attachements/First_Task_Steps.png)

**Objective:** The objective of this test is to verify the successful execution of the login functionality and subsequent address creation on the specified platform.

<details>
<summary>Complete Test Step Description: </summary><br>


**Logging in**: The test will log in using the credentials of the designated user.

**Navigating to Addresses**: Upon successful login, the test will navigate to the Addresses section by clicking on the respective tile.

**Creating a New Address:** Once on the Addresses page, the test will initiate the creation of a new address by clicking on the "+ Create new address" button.

**Completing the New Address Form:** The test will fill out the New Address form with the data provided in the Examples table within the Gherkin feature file. This data includes: alias, address, city, zip/postal code, country, and phone number.

**Validating the Added Address:** Upon successful submission of the form, the test will verify the correctness of the added address data. This validation will be performed using [assertions](https://github.com/maciej-siciarski/maciej-siciarski/blob/main/Attachements/Assertions%20JUnit.png) from the JUnit library.

</details>

**Expected Outcome:** The expected outcome of this test is the successful execution of all steps outlined above, culminating in the creation of a new address with accurately inputted data.

https://github.com/maciej-siciarski/Cucumber_Selenium_Automated_Tests/assets/147531793/9f179638-7817-4b83-9890-f763baa606aa


## Tests execution - The second test ✅

**Test Description**: [Second_Task.feature](https://github.com/maciej-siciarski/maciej-siciarski/blob/main/Attachements/Second_Task%20steps.png)

**Objective:** The objective of this test script is to execute a series of actions simulating the purchase process for a specific user, focusing on the Hummingbird Printed Sweater item. The script verifies the application's functionality related to selecting product options, quantity, checkout process, and payment method.

<details>
<summary>Complete Test Step Description: </summary><br>

**User Login:** The script initiates by authenticating the same user as in Task 1.

**Selecting Product:** The user navigates to the product page for the Hummingbird Printed Sweater.

**Choosing Size:** The user selects the size of the sweater.

**Selecting Quantity:** The user specifies the quantity of the sweater.

**Adding to Cart:** The selected quantity of the sweater is added to the user's shopping cart.

**Proceeding to Checkout:** The user proceeds to the checkout option.

**Address Confirmation:** The user confirms the address for delivery.

**Selecting Pickup Method:** The user selects the PrestaShop "pick up in store" option for order delivery.

**Choosing Payment Method:** The user opts for the "Pay by Check" payment method.

**Placing Order:** The user clicks on the "order with an obligation to pay" button to confirm the purchase.

**Taking Order Confirmation Screenshot:** The script captures a screenshot displaying the order confirmation along with the total amount.

**Validation of Order Confirmation:** Lastly, the script validates the order confirmation using [assertions](https://github.com/maciej-siciarski/maciej-siciarski/blob/main/Attachements/Task%202%20Assertions.png) similar to those applied in the previous test.

</details>

**Expected Outcome:** The anticipated result is the successful execution of all the described steps, culminating in the completion of the purchase process and the generation of an order confirmation screenshot with the relevant details.


https://github.com/maciej-siciarski/Cucumber_Selenium_Automated_Tests/assets/147531793/4842e1d1-bc63-4428-9845-41796549dce9
