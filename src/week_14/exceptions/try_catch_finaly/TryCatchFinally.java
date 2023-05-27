package src.week_14.exceptions.try_catch_finaly;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("App is started");
        } catch (Exception e) {
            System.out.println("We have a problem");
        }finally {
            System.out.println("App is closed");
        }
    }
}
