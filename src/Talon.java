import java.time.LocalTime;

public class Talon implements Comparable<Talon>{
    private String str;
    private LocalTime time;

    public Talon() {
    }

    public Talon(String str, LocalTime time) {
        this.str = str;
        this.time = time;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return STR."""


                        \{str}



                                Bishkek \{time}
        _______________________________________

                """;
    }

    @Override
    public int compareTo(Talon o) {
        return this.getStr().compareTo(o.getStr());
    }
}
