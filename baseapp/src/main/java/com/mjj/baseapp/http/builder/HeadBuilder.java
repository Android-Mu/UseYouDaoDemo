package com.mjj.baseapp.http.builder;

import com.mjj.baseapp.http.OkHttpUtils;
import com.mjj.baseapp.http.request.RequestCall;
import com.mjj.baseapp.http.request.OtherRequest;

/**
 * Created by zhy on 16/3/2.
 */
public class HeadBuilder extends GetBuilder {

    @Override
    public RequestCall build() {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers, id).build();
    }
}
