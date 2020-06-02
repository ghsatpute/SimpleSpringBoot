package com.ghsatpute.springboot.repositories;

import com.ghsatpute.springboot.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
