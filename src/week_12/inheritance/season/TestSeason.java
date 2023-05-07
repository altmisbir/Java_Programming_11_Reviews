package src.week_12.inheritance.season;

public class TestSeason {
    public static void main(String[] args) {
        Season season = new Season("Season", 24, 35);
        season.activity();

        Summer summer = new Summer(45, 25);
        summer.activity();

        Winter winter = new Winter(20, 1);
        winter.activity();

        Fall fall = new Fall(10, 3);
        System.out.println(fall);
        fall.activity();

        Spring spring = new Spring(26, 4);
        spring.activity();
    }
}
