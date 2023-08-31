package com.certification.automation.saucedemo.runners;

import com.certification.automation.saucedemo.utils.BeforeSuite;
import com.certification.automation.saucedemo.utils.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(features = "src/test/resources/features/login.feature"
        , glue = "com.certification.automation.saucedemo.stepdefinitions"
        , snippets = SnippetType.CAMELCASE )

public class Login {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException{
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/login.feature");
    }
}
