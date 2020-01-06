package com.test.rest.demo.bootstrap;

import com.test.rest.demo.entity.Test;
import com.test.rest.demo.repository.TestRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class TestBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final TestRepository testRepository;

    public TestBootstrap(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        testRepository.save(new Test("aaaa","vvvvv",14));
        testRepository.save(new Test("bbbb","ccccc",64));

    }
}
