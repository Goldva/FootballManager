import attributes.Country;
import attributes.League;
import interfeces.LeagueManager;
import interfeces.SoccerPlayer;

import java.util.Comparator;
import java.util.TreeSet;

public class FootballManager implements LeagueManager {
    private TreeSet<SoccerPlayer> players;


    public FootballManager() {
        this.players = new TreeSet<SoccerPlayer>(new Sort());
    }

    @Override
    public void addPlayer(SoccerPlayer player) {
        this.players.add(player);
    }

    @Override
    public void removePlayer(SoccerPlayer player) {
        this.players.remove(player);
    }

    @Override
    public SoccerPlayer getPlayer(String name) {
        String playerName = "";
        for (SoccerPlayer player : this.players) {
            playerName = player.getNickName();
            if (playerName.equals(name))
                return player;
        }
        return null;
    }

    @Override
    public TreeSet<SoccerPlayer> getAllPlayers() {
        return this.players;
    }

    @Override
    public TreeSet<SoccerPlayer> getPlayersLeague(League league) {
        TreeSet<SoccerPlayer> leaguePlayers = new TreeSet<SoccerPlayer>();
        for (SoccerPlayer player : this.players) {
            if (player.getLeague() == league)
                leaguePlayers.add(player);
        }
        return leaguePlayers;
    }

    @Override
    public TreeSet<SoccerPlayer> getPlayersLeague(Country country) {
        TreeSet<SoccerPlayer> leaguePlayers = new TreeSet<SoccerPlayer>();
        for (SoccerPlayer player : this.players) {
            if (player.getCountry() == country)
                leaguePlayers.add(player);
        }
        return leaguePlayers;
    }

    @Override
    public void addPoints(String name, int points) {
        String playerName = "";
        for (SoccerPlayer player : this.players) {
            playerName = player.getNickName();
            if (playerName.equals(name)) {
                player.setPoints(points);
                return;
            }
        }
    }

    class Sort implements Comparator<SoccerPlayer> {
        @Override
        public int compare(SoccerPlayer player1, SoccerPlayer player2) {
            return player2.compareTo(player1);
        }

    }
}
