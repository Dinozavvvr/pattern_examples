package ru.dinar.patterns.behavioral.mediator;

/**
 * created: 07-04-2022 - 13:47
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Checkbox extends Component {

    public Checkbox(Mediator mediator) {
        super(mediator);
    }

    public void check() {
        this.mediator.notify(this, Event.CHECK);
    }

}
