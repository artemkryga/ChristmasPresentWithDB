package ua.kryha.view;

import ua.kryha.model.entity.Sweetness;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    static String MESSAGES_BUNDLE_NAME = "resources_en";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

    public void printMessage(String message) {
        System.out.println(bundle.getString(message));
    }


    public void printMessages(String ... message) {
        for (String s : message) {
            printMessage(s);
        }
    }

    public void printMessageArr(String message) {
        System.out.println(message);
    }
    public void printArr(List<Sweetness> sweetnesses) {
        for (Sweetness s : sweetnesses) {
           printMessageArr(s.toString());
        }
    }



}