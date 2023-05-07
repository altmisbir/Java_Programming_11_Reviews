package src.week_12.inheritance.season;

public class Fall extends Season{
    public Fall( double highAvgTemp, double lowAvgTemp) {
        super("Fall", highAvgTemp, lowAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Read a Book in Fall");
    }
}
