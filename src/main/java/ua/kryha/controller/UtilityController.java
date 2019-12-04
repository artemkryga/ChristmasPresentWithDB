package ua.kryha.controller;

import ua.kryha.model.Sweetness;
import ua.kryha.model.db.SweetnessJDBC;
import java.util.List;

public class UtilityController {
    String dbUrl = "jdbc:postgresql://localhost:5433/sweetness";
    String user = "postgres";
    String password = "654";
    SweetnessJDBC sweetnessJDBC;

    public void initDB() {
        sweetnessJDBC = new SweetnessJDBC(dbUrl, user, password );
    }

    public List<Sweetness> getAllFromDB() {
       return sweetnessJDBC.getAllFromDB();
    }

}
