package com.certification.automation.saucedemo.tasks;

import com.certification.automation.saucedemo.models.DataLogin;
import com.certification.automation.saucedemo.userinterfaces.LoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterLoginData implements Task {

    private DataLogin dataLogin;

    public EnterLoginData(DataLogin dataLogin) {

        this.dataLogin = dataLogin;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(dataLogin.getPassword()).into(LoginUserInterface.USERNAME));
        actor.attemptsTo(Enter.theValue(dataLogin.getPassword()).into(LoginUserInterface.PASSWORD));
        actor.attemptsTo(Click.on(LoginUserInterface.LOGIN_BUTTON));
    }
    public static EnterLoginData withData(DataLogin dataLogin){

        return new EnterLoginData(dataLogin);
    }
}
