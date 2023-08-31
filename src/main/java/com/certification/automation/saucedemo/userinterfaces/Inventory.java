package com.certification.automation.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Inventory {
    public static final Target TITLE = Target.
            the("Show title")
            .locatedBy("//*[@class=\"title\"]");
}
