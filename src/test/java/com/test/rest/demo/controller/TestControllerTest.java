package com.test.rest.demo.controller;

import com.test.rest.demo.service.TestService;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static io.restassured.module.webtestclient.RestAssuredWebTestClient.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
class TestControllerTest {

    @Autowired
    private TestService testService;
    @Autowired
    private TestController controller;

    @Before
    void setUp() {

    }

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    void test() {
        given()
                .standaloneSetup(controller)
                .param("id","1")
                .when().get("/test")
                .then().statusCode(200)
                .body("id",equalTo(1))
                .body("content", equalTo("aaaa"));
    }
}