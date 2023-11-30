package com.pedrocavalero.jugvale2023.mvctest;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

}