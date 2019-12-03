package ua.kryha.model.db;

import ua.kryha.model.Sweetness;

import java.util.List;

public interface SweetnesDao extends CrudDao<Sweetness>{
    List<Sweetness> findAll() ;
}
