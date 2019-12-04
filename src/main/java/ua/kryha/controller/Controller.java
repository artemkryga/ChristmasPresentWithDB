package ua.kryha.controller;

import ua.kryha.model.Sweetness;

public class Controller {
    public static void main(String[] args) {
        UtilityController utilityController = new UtilityController();

        utilityController.initDB();
        for (Sweetness sweetness : utilityController.getAllFromDB()) {
            System.out.println(sweetness);
        }

    }
}
