package ru.dinar.patterns.behavioral.state;

/**
 * created: 07-04-2022 - 15:46
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Spotify {

    private State state;

    private User user;

    public Spotify() {
        this.state = new CommonState(this);
    }

    public void login(User user) {
        this.user = user;
        if (user.getCountry() == User.Country.RUSSIA) {
            state = new BannedRegionState(this);
        } else {
            state = new CommonState(this);
        }
    }

    public void buyPremium() {
        state.onBuyPremium();
    }

    public void renew() {
        state.onRenew();
    }

    public User getUser() {
        return user;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
