package com.wu.ipcservice;

import android.os.RemoteException;
import android.util.Log;

/**
 * 作者:吴奎庆
 * <p>
 * 时间:7/29/23
 * <p>
 * 用途:
 */


public class ShareDataBinder extends IShareDataInterface.Stub {

    IShareDataListener callback;

    @Override
    public void sendShareData(int key, String values) throws RemoteException {
        Log.e("IPCService:", "收到了客户端的消息:" + values);
        if (callback != null)
            callback.notifyShareData(key, values);
    }

    @Override
    public String getShareData(int key) throws RemoteException {
        return "返回服务了服务层数据";
    }

    @Override
    public void registerCallback(int id, IShareDataListener callback) throws RemoteException {
        this.callback = callback;
    }

    @Override
    public void unregisterCallback(IShareDataListener callback) throws RemoteException {
        callback = null;
    }

    @Override
    public void sendShareDataInfo(ShareDataInfo info) throws RemoteException {
        Log.e("IPCService:", "收到了客户端的ShareDataInfo消息:" + info.toString());
    }
}
