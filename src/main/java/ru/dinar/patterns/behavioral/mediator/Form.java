package ru.dinar.patterns.behavioral.mediator;

/**
 * created: 07-04-2022 - 13:50
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Form {

    private String login;

    private String password;

    private boolean rememberMe;

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
