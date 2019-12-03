package ua.kryha;

import ua.kryha.model.Sweetness;
import ua.kryha.model.SweetnessType;
import ua.kryha.model.SwetnessFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

      public class Main {
    private static final String SQL_SELECT_ALL = "SELECT * FROM sweetness";
        static String dbUrl = "jdbc:postgresql://localhost:5433/sweetness";
        static String user = "postgres";
        static String password = "654";
         static Connection connection;
          public static void main(String[] args) throws SQLException {
              List<Sweetness> sweetnesses;
              connection = DriverManager.getConnection(dbUrl , user , password);
              sweetnesses = findAll();

              for (Sweetness s : sweetnesses) {
                  System.out.println(s);
              }

          }




    public static List<Sweetness> findAll() {
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

}
