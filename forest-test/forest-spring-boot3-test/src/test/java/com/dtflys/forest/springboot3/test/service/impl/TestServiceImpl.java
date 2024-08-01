package com.dtflys.forest.springboot3.test.service.impl;

import com.dtflys.forest.http.ForestResponse;
import com.dtflys.forest.springboot3.test.client0.BeastshopClient;
import com.dtflys.forest.springboot3.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author gongjun[dt_flys@hotmail.com]
 * @since 2021-03-23 23:04
 */
@Component
public class TestServiceImpl implements TestService {

    @Autowired
    private BeastshopClient beastshopClient;

    public TestServiceImpl() {
        System.out.println("创建 TestService");
    }

    @Override
    public ForestResponse<String> shops() {
        return beastshopClient.shops();
    }

    public String testRetry() {
        return beastshopClient.testRetry();
    }
}
