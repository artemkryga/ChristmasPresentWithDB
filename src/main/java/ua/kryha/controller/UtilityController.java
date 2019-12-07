package ua.kryha.controller;
import ua.kryha.model.db.ConstantsDB;
import ua.kryha.model.entity.Sweetness;
import ua.kryha.model.db.SweetnessJDBC;


import java.util.List;

public class UtilityController {

    SweetnessJDBC sweetnessJDBC;


    public void initDB() {
        sweetnessJDBC = new SweetnessJDBC(ConstantsDB.DB_URL , ConstantsDB.DB_USER , ConstantsDB.DB_PASSWORD);
    }

    public List<Sweetness> getAllFromDB() {
       return sweetnessJDBC.getAllFromDB();
    }



}
