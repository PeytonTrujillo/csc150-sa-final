package init;

import controllers.MainController;
import views.Console;

public class Main {
    public static void main(String[] args) {
			new MainController(new Console()).run();
    }
}
