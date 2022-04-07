package ru.dinar.patterns.behavioral.state;

/**
 * created: 07-04-2022 - 15:54
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class CommonState extends State {

    public CommonState(Spotify spotify) {
        super(spotify);
    }

    @Override
    public void onBuyPremium() {
        System.out.println(spotify.getUser().getName() + ", Поздравляем! Вы приобрели премиум подписку");
    }

    @Override
    public void onRenew() {
        System.out.println(spotify.getUser().getName() + ", Поздравляем! Вы успешно обновили премиум подписку");
    }

}
