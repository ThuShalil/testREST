package com.test.rest.demo.service;

import com.test.rest.demo.entity.Test;

public interface TestService {
    Test findById(Long id);
    Test saveTest(Test test);
}
