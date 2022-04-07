package ru.dinar.patterns.behavioral.mediator;

/**
 * created: 07-04-2022 - 13:58
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class FormService {

    public void submit(Form form) {
        System.out.println("Submitting form");
        System.out.println("Login: " + form.getLogin());
        System.out.println("Password: " + form.getPassword());
        System.out.println("RemeberFlag: " + form.isRememberMe());
    }

}
