package com.dtflys.forest.solon.test.client2;

import com.dtflys.forest.annotation.*;
import com.dtflys.forest.http.ForestRequest;
import com.dtflys.forest.solon.test.logging.TestLogHandler;
import com.dtflys.forest.solon.test.logging.TestLogHandler2;

/**
 * @author gongjun[jun.gong@thebeastshop.com]
 * @since 2018-09-25 18:30
 */
@ForestClient
@LogHandler(TestLogHandler2.class)
@LogEnabled(logResponseStatus = true)
@BaseRequest(baseURL = "#{my-site.base-url}")
public interface GiteeClient {

    @Request(
            url = "/dt_flys/#{test.path}",
            timeout = 80000,
            sslProtocol = "SSL"
    )
    @LogHandler(TestLogHandler.class)
    @LogEnabled(logResponseStatus = true, logResponseContent = true)
    ForestRequest<String> index();

    @Request(
            url = "/dt_flys",
            timeout = 80000,
            keyStore = "keystore1"
    )
    ForestRequest<String> index2();


    @Request(
            url = "https://baidu.com/",
            timeout = 80000,
            keyStore = "keystore1"
    )
    String index3();


}
