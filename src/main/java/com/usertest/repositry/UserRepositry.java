package com.usertest.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usertest.entity.User;

@Repository
public interface UserRepositry extends CrudRepository<User, Integer> {

}
