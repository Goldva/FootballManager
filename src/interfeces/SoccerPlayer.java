package interfeces;

import attributes.Country;
import attributes.League;

public interface SoccerPlayer extends Comparable<SoccerPlayer> {
    String getNickName();

    Integer getPoints();

    void setPoints(int points);

    League getLeague();

    Country getCountry();
}
