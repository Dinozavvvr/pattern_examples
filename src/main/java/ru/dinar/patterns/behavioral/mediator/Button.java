package ru.dinar.patterns.behavioral.mediator;

/**
 * created: 07-04-2022 - 13:45
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Button extends Component {

    public Button(Mediator mediator) {
        super(mediator);
    }

    public void click() {
        this.mediator.notify(this, Event.CLICK);
    }

}
