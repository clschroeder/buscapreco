package com.clschroeder.buscapreco.repositories;

import com.clschroeder.buscapreco.domain.Category;
import com.clschroeder.buscapreco.exceptions.EtBadRequestException;
import com.clschroeder.buscapreco.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);

}
