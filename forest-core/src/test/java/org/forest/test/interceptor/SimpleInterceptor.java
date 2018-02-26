package org.forest.test.interceptor;

import org.forest.exceptions.ForestRuntimeException;
import org.forest.http.ForestRequest;
import org.forest.http.ForestResponse;
import org.forest.interceptor.Interceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gongjun[jun.gong@thebeastshop.com]
 * @since 2017-05-15 17:01
 */
public class SimpleInterceptor implements Interceptor<String> {

    private final static Logger log = LoggerFactory.getLogger(SimpleInterceptor.class);

    @Override
    public boolean beforeExecute(ForestRequest request) {
        log.info("invoke Simple beforeExecute");
        return true;
    }

    @Override
    public void onSuccess(String data, ForestRequest request, ForestResponse response) {
        log.info("invoke Simple onSuccess");
        response.setResult("XX: " + data);
    }

    @Override
    public void onError(ForestRuntimeException ex, ForestRequest request, ForestResponse response) {

    }

    @Override
    public void afterExecute(ForestRequest request, ForestResponse response) {
        log.info("invoke Simple afterExecute");
    }
}