package lesson10.tmp;

public enum Direction {
    NORTH ("север"),
    SOUTH("север", "south");

    private String ruName;
    private String engName;

    Direction(String ruName) {
        this.ruName = ruName;
    }

    Direction(String ruName, String engName) {
        this.ruName = ruName;
        this.engName = engName;
    }
}
