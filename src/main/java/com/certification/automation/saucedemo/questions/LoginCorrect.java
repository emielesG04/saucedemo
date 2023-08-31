package com.certification.automation.saucedemo.questions;

import com.certification.automation.saucedemo.userinterfaces.Inventory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoginCorrect implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((Inventory.TITLE),
                WebElementStateMatchers.isVisible()));
        return Text.of(Inventory.TITLE).viewedBy(actor).asString();
    }
    public static LoginCorrect messages(){

        return new LoginCorrect();
    }
}
