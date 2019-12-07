package ua.kryha.model.db;

import ua.kryha.model.entity.Sweetness;
import ua.kryha.model.initEntity.SweetnessType;
import ua.kryha.model.initEntity.SwetnessFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SweetnessJDBC {


    private Connection connection;

    public SweetnessJDBC(String dbUrl , String name , String password) {
        try {
          this.connection = DriverManager.getConnection(dbUrl , name , password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Sweetness> getAllFromDB() {
        try {
            SwetnessFactory swetnessFactory = new SwetnessFactory();
            List<Sweetness> sweets = new ArrayList<Sweetness>();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(ConstantsDB.SELECT_ALL);
            while (resultSet.next()) {
                SweetnessType type = SweetnessType.valueOf(resultSet.getString(ConstantsDB.FIELD_TYPE));
                String name = resultSet.getString(ConstantsDB.FIELD_NAME);
                int weight = resultSet.getInt(ConstantsDB.FIELD_WEIGHT);
                int sugarContent = resultSet.getInt(ConstantsDB.FIELD_SUGARCONTENT);

                Sweetness sweetness = swetnessFactory.getSweetness(type, name, weight, sugarContent);

                sweets.add(sweetness);
            }
            return sweets;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
