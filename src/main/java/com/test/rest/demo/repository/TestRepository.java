package com.test.rest.demo.repository;

import com.test.rest.demo.entity.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TestRepository extends CrudRepository<Test,Long> {
    Optional<Test> findById(Long id);
}
