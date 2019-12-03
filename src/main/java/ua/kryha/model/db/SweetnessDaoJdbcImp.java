package ua.kryha.model.db;

import ua.kryha.model.*;


import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SweetnessDaoJdbcImp implements SweetnesDao {
    private final String SQL_SELECT_ALL = "SELECT * FROM fix_user";

    private Connection connection;

    public SweetnessDaoJdbcImp(DataSource dataSource) {
        try {
            this.connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }


    public List<Sweetness> findAll() {
        try {
            SwetnessFactory swetnessFactory = new SwetnessFactory();
            List<Sweetness> sweetnesses = new ArrayList<Sweetness>();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL);
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                Sweetness sweetness = swetnessFactory.getSweetness(){
                };

                sweetnesses.add(sweetness);
            }
            return sweetnesses;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
