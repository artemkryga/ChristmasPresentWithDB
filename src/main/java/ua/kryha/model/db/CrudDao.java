package ua.kryha.model.db;

import java.util.List;

public interface CrudDao<T> {
    List<T> findAll();
}
