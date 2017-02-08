package org.action;

/**
 * Created by cxd on 2016/11/22.
 */
public interface FetcherCallback {
    void OnData(Data data) throws Exception;
    void onError(Throwable cause);
}
