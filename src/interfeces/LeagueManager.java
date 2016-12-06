package interfeces;

import attributes.Country;
import attributes.League;

import java.util.TreeSet;

public interface LeagueManager {
    public void addPlayer(SoccerPlayer player);

    public void removePlayer(SoccerPlayer player);

    public SoccerPlayer getPlayer(String name);

    public TreeSet<SoccerPlayer> getAllPlayers();

    public TreeSet<SoccerPlayer> getPlayersLeague(League league);

    public TreeSet<SoccerPlayer> getPlayersLeague(Country country);

    public void addPoints(String name, int points);
}
