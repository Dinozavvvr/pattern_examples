package ru.dinar.patterns.behavioral.mediator;

/**
 * created: 07-04-2022 - 13:49
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Dialog implements Mediator {

    private Button submit;

    private Checkbox rememberMe;

    private Form form;

    private FormService service;

    public Button getSubmit() {
        return submit;
    }

    public void onSubmit(Button submit) {
        this.submit = submit;
    }

    public Checkbox getRememberMe() {
        return rememberMe;
    }

    public void onRememberCheckbox(Checkbox rememberMe) {
        this.rememberMe = rememberMe;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public FormService getService() {
        return service;
    }

    public void setService(FormService service) {
        this.service = service;
    }

    @Override
    public void notify(Component sender, Event event) {
        if (sender == rememberMe && event == Event.CHECK) {
            form.setRememberMe(!form.isRememberMe());
        } else if (sender == submit && event == Event.CLICK) {
            service.submit(form);
        } else {
            throw new UnsupportedOperationException();
        }
    }

}
