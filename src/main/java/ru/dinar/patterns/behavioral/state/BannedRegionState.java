package ru.dinar.patterns.behavioral.state;

/**
 * created: 07-04-2022 - 15:52
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class BannedRegionState extends State {

    public BannedRegionState(Spotify spotify) {
        super(spotify);
    }

    @Override
    public void onBuyPremium() {
        System.out.println(spotify.getUser().getName() + "! Приносим свои глубочайшие извинения, сейчас недоступно в вашем регионе");
    }

    @Override
    public void onRenew() {
        System.out.println(spotify.getUser().getName() + "! Приносим свои глубочайшие извинения, сейчас недоступно в вашем регионе");
    }

}
