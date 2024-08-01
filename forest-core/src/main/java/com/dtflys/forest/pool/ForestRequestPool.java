package com.dtflys.forest.pool;

import com.dtflys.forest.http.ForestRequest;

/**
 * Forest请求池/连接池接口
 *
 * @author gongjun [dt_flys@hotmail.com]
 * @since 1.5.22
 */
public interface ForestRequestPool {

    int DEFAULT_POOL_SIZE = 128;

    int DEFAULT_POOL_SIZE_PER_ROUTE = 128;

    int DEFAULT_QUEUE_SIZE = 32;

    void awaitRequest(final ForestRequest request);

    void finish(final ForestRequest request);

    Integer getRunningPoolSize();

    Integer getMaxPoolSize();

    Integer getMaxPoolSizePerRoute();

    Integer getMaxQueueSize();

    Integer getQueueSize();

}
