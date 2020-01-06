package com.test.rest.demo.controller;

import com.test.rest.demo.entity.Test;
import com.test.rest.demo.repository.TestRepository;
import com.test.rest.demo.service.TestService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("/test")
    public Test Test(@RequestParam(value="id") Long id)
    {
        return testService.findById(id);
    }
    @PostMapping("/test")
    public Test Test2(@RequestBody Test test)
    {
        return testService.saveTest(test);
    }
}
