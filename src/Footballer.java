import attributes.Country;
import attributes.League;
import interfeces.SoccerPlayer;

public class Footballer implements SoccerPlayer {
    private String nickName;
    private int points;
    private League league;
    private Country country;

    public Footballer(String nickName, int points, League league, Country country) {
        this.nickName = nickName;
        this.points = points;
        this.league = league;
        this.country = country;
    }

    public static int compare(int x, int y) {
        return (x > y) ? -1 : ((x == y) ? 0 : 1);
    }

    @Override
    public String getNickName() {
        return nickName;
    }

    @Override
    public Integer getPoints() {
        return points;
    }

    @Override
    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public League getLeague() {
        return league;
    }

    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public int compareTo(SoccerPlayer otherPlayer) {
        return compare(this.getPoints(), otherPlayer.getPoints());
    }
}
