package com.example.SpringDataMySql.Repositories;

import com.example.SpringDataMySql.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
