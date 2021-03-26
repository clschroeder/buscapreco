package com.clschroeder.buscapreco.repositories;

import com.clschroeder.buscapreco.domain.User;
import com.clschroeder.buscapreco.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);

}
