public class OpenSupportEmail {

    public static boolean openSupportEmail(org.openqa.selenium.WebDriver driver) throws Exception {
        driver.manage().window().maximize();
        driver.get("https://delivait.com/");

        org.openqa.selenium.WebElement supportLink = driver.findElement(
            org.openqa.selenium.By.xpath("(//a[@href='mailto:ej@delivait.com' and normalize-space()='Support'])[1]")
        );
        supportLink.click();

        org.openqa.selenium.WebElement emailSupport = driver.findElement(
            org.openqa.selenium.By.xpath("(//a[@class='contact-btn-item' and normalize-space()='Email Support'])[1]")
        );
        String mailtoHref = emailSupport.getAttribute("href");
        String expectedHref = "mailto:stephen@delivait.com";
        boolean match = expectedHref.equalsIgnoreCase(mailtoHref);

        System.out.println(); // Adds a blank line above
        System.out.println("Expected: " + expectedHref);
        System.out.println("Actual:   " + mailtoHref);
        System.out.println("Match?    " + match);
        System.out.println(); // Adds a blank line below

        if (match) {
            emailSupport.click();  // This will open the mail client once
            Thread.sleep(5000); // Wait for the client to open
        }

        return match;
    }
}

