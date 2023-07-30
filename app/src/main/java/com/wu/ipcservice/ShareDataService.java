package com.wu.ipcservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

/**
 * 作者:吴奎庆
 * <p>
 * 时间:7/29/23
 * <p>
 * 用途:
 */


public class ShareDataService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new ShareDataBinder();
    }
}
