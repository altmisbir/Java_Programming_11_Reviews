package src.week_15.polymorphism.drivers;

public class RemoteWebDriver implements WebDriver,JavaScriptExecuter,TakeScreenshot{

    @Override
    public void executerScript() {
        System.out.println("executing javascript in " +getClass().getSimpleName());
    }

    @Override
    public void fineElement() {
        System.out.println("We will  find element in " + getClass().getSimpleName());
    }

    @Override
    public void fineElements() {
        System.out.println("We will  find elements in " + getClass().getSimpleName());
    }

    @Override
    public void takeScreenshot() {
        System.out.println("taking screenshot in " + getClass().getSimpleName());
    }

    @Override
    public void get(String url) {
        System.out.println("I will go to that " +url+ " in " +getClass().getSimpleName() );
    }

    @Override
    public void close() {
        System.out.println("I will close the " +getClass().getSimpleName() );
    }
}
