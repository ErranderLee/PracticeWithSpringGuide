package com.example.MysqlConnectionAndAccessingData;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
