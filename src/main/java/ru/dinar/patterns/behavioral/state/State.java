package ru.dinar.patterns.behavioral.state;

/**
 * created: 07-04-2022 - 15:50
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public abstract class State {

    protected Spotify spotify;

    public State(Spotify spotify) {
        this.spotify = spotify;
    }

    public abstract void onBuyPremium();

    public abstract void onRenew();

}
