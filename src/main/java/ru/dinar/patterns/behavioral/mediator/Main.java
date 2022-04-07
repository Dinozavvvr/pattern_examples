package ru.dinar.patterns.behavioral.mediator;

/**
 * created: 07-04-2022 - 13:24
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        Checkbox checkbox = new Checkbox(dialog);
        Button submitButton = new Button(dialog);
        Form form = new Form();
        FormService formService = new FormService();
        dialog.onRememberCheckbox(checkbox);
        dialog.onSubmit(submitButton);
        dialog.setForm(form);
        dialog.setService(formService);

        form.setLogin("dinar_shagaliev");
        form.setPassword("password228");

        System.out.println("REMEMBER ME: OFF");
        submitButton.click();

        System.out.println("REMEMBER ME: ON");
        checkbox.check();
        submitButton.click();
    }

}
