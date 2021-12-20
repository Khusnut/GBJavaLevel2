package Homework8;

import Homework8.IUserInterface;
import Homework8.UserInterface;

public class Application {
    public static void main(String[] args) {

        IUserInterface ui = new UserInterface();

        ui.showMenu();


    }
}
