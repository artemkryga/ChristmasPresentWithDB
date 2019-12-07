package ua.kryha.controller;

import ua.kryha.model.entity.ChristmasPresent;
import ua.kryha.view.View;
import static ua.kryha.view.TextConstants.*;


public class Controller {
       View view;

    public Controller(View view) {
        this.view = view;
    }

    public void start(){

        UtilityController utilityController = new UtilityController();
        utilityController.initDB();
        ChristmasPresent christmasPresent = new ChristmasPresent(utilityController.getAllFromDB());
        view.printMessage(HELLO);
        view.printMessageArr(SPACE);
        view.printArr(christmasPresent.getSweetnesses());
        view.printMessageArr(SPACE);
        view.printMessage(WELL_PRESENT);
        view.printMessageArr(SPACE);
        view.printArr(christmasPresent.sortSweets());
        view.printMessage(SORT);
        view.printMessageArr(SPACE);
        view.printArr(christmasPresent.getSugarRange(11 , 20));


    }






}
