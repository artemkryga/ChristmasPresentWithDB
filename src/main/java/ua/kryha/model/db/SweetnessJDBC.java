package ua.kryha.model.db;

import ua.kryha.model.Sweetness;
import ua.kryha.model.SweetnessType;
import ua.kryha.model.SwetnessFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SweetnessJDBC {

    private final String SQL_SELECT_ALL = "SELECT * FROM sweetness";
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
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL);
            while (resultSet.next()) {
                SweetnessType type = SweetnessType.valueOf(resultSet.getString("type"));
                String name = resultSet.getString("name");
                int weight = resultSet.getInt("weight");
                int sugarContent = resultSet.getInt("sugarContent");

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
