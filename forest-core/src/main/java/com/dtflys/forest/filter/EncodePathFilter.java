package com.dtflys.forest.filter;

import com.dtflys.forest.config.ForestConfiguration;
import com.dtflys.forest.utils.URLEncoder;

import java.nio.charset.StandardCharsets;

public class EncodePathFilter implements Filter {

    @Override
    public Object doFilter(ForestConfiguration configuration, Object data) {
        if (data == null) {
            return null;
        }
        return URLEncoder.PATH.encode(String.valueOf(data), StandardCharsets.UTF_8);
    }
}
