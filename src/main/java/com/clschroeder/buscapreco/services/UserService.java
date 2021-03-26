package com.clschroeder.buscapreco.services;

import com.clschroeder.buscapreco.domain.User;
import com.clschroeder.buscapreco.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
