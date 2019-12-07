package ua.kryha.model.db;

public interface ConstantsDB {
    String SELECT_ALL = "SELECT * FROM sweetness";
    String FIELD_TYPE = "type";
    String FIELD_NAME = "name";
    String FIELD_WEIGHT = "weight";
    String FIELD_SUGARCONTENT = "sugarContent";
    String DB_URL = "jdbc:postgresql://localhost:5433/sweetness";
    String DB_USER = "postgres";
    String DB_PASSWORD = "654";
}
