package com.test.rest.demo.service;

import com.test.rest.demo.entity.Test;
import com.test.rest.demo.exception.NotFoundException;
import com.test.rest.demo.repository.TestRepository;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.Optional;

@Service
public class TestServiceIMPL implements TestService {

    private final TestRepository testRepository;

    public TestServiceIMPL(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Test findById(Long id) {
        Optional<Test> testOptional = testRepository.findById(id);

        if(!testOptional.isPresent())
        {
            throw new NotFoundException("...");
        }

        return testOptional.get();
    }

    @Override
    public Test saveTest(Test test) {
        return testRepository.save(test);
    }
}
