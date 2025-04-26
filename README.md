
TO see the code
src/java/main
-opensupportemailtest
-test1

When u mentioned "i didn’t use no import or header in the class", I was referring to the fact that your original code did not include the necessary imports and class header for it to run properly with TestNG and Selenium.

explanation:
Imports: These are necessary for the Java program to understand and use libraries such as WebDriver, ChromeDriver, and TestNG-related classes.
Class Header: This is the part where you define your class (public class OpenSupportEmailTest). It's essential to include it for your program to run.
Without these, the program wouldn't be able to locate the required classes and would throw errors.


Explanation of the Code:
The code provided is for a Selenium-based automation test written in Java. It is designed to open a website and interact with elements on it. Here's a detailed breakdown:
Method: openSupportEmail:

This method takes an instance of a Selenium WebDriver as a parameter (driver), which is used to control the browser.
Maximizing the Browser Window:
driver.manage().window().maximize();: Maximizes the browser window.

Navigating to the Website:
driver.get("https://delivait.com/");: Navigates to the specified URL (https://delivait.com/).
Finding and Clicking the "Support" Link:
supportLink = driver.findElement(...);: Finds the first <a> tag with the href='mailto:ej@delivait.com' and the text "Support" using XPath.
supportLink.click();: Clicks the support link.

Finding and Verifying the "Email Support" Button:
emailSupport = driver.findElement(...);: Finds the first <a> tag with the class contact-btn-item and the text "Email Support" using XPath.
mailtoHref = emailSupport.getAttribute("href");: Gets the href attribute from the "Email Support" link (which should be a mailto: link).

Matching the Expected Email:
expectedHref = "mailto:stephen@delivait.com";: The expected email is set to mailto:stephen@delivait.com.
boolean match = expectedHref.equalsIgnoreCase(mailtoHref);: It compares the actual mailtoHref with the expected one. If they match, the test passes.

Printing the Results:
The code prints both the expected and actual mailto values, as well as whether they match.

Sending the Email:
If the email links match (if (match)), it clicks the "Email Support" button and opens the default email client using Java's Desktop class.
java.awt.Desktop.getDesktop().mail(new java.net.URI(mailtoHref));: This triggers the default email client to open with the specified email address (mailto: URI).

Waiting Before Completing:
Thread.sleep(5000);: Waits for 5 seconds to allow the email client to open before proceeding.
Returning the Result:
return match;: The method returns true if the email addresses match, indicating that the link worked as expected.





see the code : opensupportemailtest 



