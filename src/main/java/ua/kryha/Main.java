package ua.kryha;
import ua.kryha.controller.Controller;
import ua.kryha.view.View;


public class Main {
      public static void main(String[] args) {
            View view = new View();
            Controller controller = new Controller(view);
            controller.start();
      }





}
