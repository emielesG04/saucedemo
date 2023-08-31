package com.certification.automation.saucedemo.questions;

import com.certification.automation.saucedemo.userinterfaces.Inventory;
import com.certification.automation.saucedemo.userinterfaces.LoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoginIncorrect implements Question<String>  {

        @Override
        public String answeredBy(Actor actor) {
            actor.attemptsTo(WaitUntil.the((LoginUserInterface.LOGIN_ERROR_MESSAGE),
                    WebElementStateMatchers.isVisible()));
            return Text.of(LoginUserInterface.LOGIN_ERROR_MESSAGE).viewedBy(actor).asString();
        }

        public static LoginIncorrect messages(){

            return new LoginIncorrect();
        }
}
