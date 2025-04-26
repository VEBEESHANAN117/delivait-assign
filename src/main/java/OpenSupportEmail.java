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

        System.out.println("Expected: " + expectedHref);
        System.out.println("Actual:   " + mailtoHref);
        System.out.println("Match?    " + match);

        if (match) {
            emailSupport.click();
            if (java.awt.Desktop.isDesktopSupported()) {
                java.awt.Desktop.getDesktop().mail(new java.net.URI(mailtoHref));
            }
            Thread.sleep(5000);
        }

        return match;
    }
}
