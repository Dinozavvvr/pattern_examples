package ru.dinar.patterns.structural.brige;

/**
 * created: 05-04-2022 - 18:56
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        TV tv = new TV();
        PC pc = new PC();

        // we use RemoteControl and AdvancedRemoteControl with injecting Devices
        // instead of using RemoteTV RemotePC RemotePhone and
        // AdvancedRemoteTV AdvancedRemotePC AdvancedRemotePhone
        RemoteControl remoteControl = new RemoteControl(tv);

        System.out.println(tv.isEnabled());
        remoteControl.togglePower();
        System.out.println(tv.isEnabled());

        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(pc);
        System.out.println(advancedRemoteControl.getChargeValue());
    }

}
