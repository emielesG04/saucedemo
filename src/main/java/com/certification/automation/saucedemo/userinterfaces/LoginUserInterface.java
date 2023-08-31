package com.certification.automation.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUserInterface {
    public static final Target USERNAME = Target.
            the("Type the user")
            .located(By.id("user-name"));
    public static final Target PASSWORD = Target.
            the("Type the password")
            .located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.
            the("Click on the login button")
            .located(By.id("password"));
}
