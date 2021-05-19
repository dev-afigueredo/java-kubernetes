package com.afigueredo.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.afigueredo.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

