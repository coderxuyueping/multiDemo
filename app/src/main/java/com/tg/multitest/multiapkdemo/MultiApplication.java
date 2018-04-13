package com.tg.multitest.multiapkdemo;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

/**
 * Created by xyp on 2018/4/13.
 */

public class MultiApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //最后一个参数是推送业务的secret
        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, "");
    }
}
