import attributes.Country;
import attributes.League;
import interfeces.SoccerPlayer;

import java.util.Random;
import java.util.TreeSet;

public class AppForTesting {
    private static Random random = new Random();
    private static String[] firstName = {"Алексей ", "Сергей ", "Александр ", "Михаил ", "Денис ", "Петр ", "Павел ",
            "Иван ", "Дмитрий ", "Николай ", "Олег ", "Святогор ", "Эдуард ", "Степан "};
    private static String[] secondName = {"Петров ", "Иванов ", "Степочкин ", "Рюрикович ", "Долгорукий ", "Романов ",
            "Морковкин ", "Макидонский ", "Рыжов ", "Крестиков ", "Громов ", "Гришин ", "Зайцев "};
    private static String[] middleName = {"Алексеевич", "Сергеевич", "Александрович", "Михаилович", "Денисович",
            "Петрович", "Павлович", "Иванович", "Дмитриевич", "Николаевич", "Олегович", "Святогорович", "Олегович"};


    public static void main(String[] args) {
        FootballManager manager = new FootballManager();

        for (int i = 0; i < 20; i++) {
            manager.addPlayer(getRandomPlayer());
        }

        for (Country country : Country.values()) {
            System.out.println(country);
            playersToConsole(manager.getPlayersLeague(country));
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        for (League league : League.values()) {
            System.out.println(league);
            playersToConsole(manager.getPlayersLeague(league));
        }
    }

    public static Footballer getRandomPlayer() {
        String nickName;
        int points;
        League league;
        Country country;
        int randomNum;

        nickName = getRandomNickName();
        points = random.nextInt(100);
        randomNum = random.nextInt(League.values().length);
        league = League.values()[randomNum];
        randomNum = random.nextInt(Country.values().length);
        country = Country.values()[randomNum];

        return new Footballer(nickName, points, league, country);
    }

    private static String getRandomNickName() {
        String name = secondName[random.nextInt(secondName.length)];
        name += firstName[random.nextInt(firstName.length)];
        name += middleName[random.nextInt(middleName.length)];
        return name;
    }

    public static void playersToConsole(TreeSet<SoccerPlayer> listPlayers) {
        for (SoccerPlayer player : listPlayers) {
            System.out.println(String.format("%d  -  %s", player.getPoints(), player.getNickName()));
        }
        System.out.println("=========================================");
    }
}

