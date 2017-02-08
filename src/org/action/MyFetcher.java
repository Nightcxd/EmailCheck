package org.action;

/**
 * Created by cxd on 2016/11/22.
 */
public class MyFetcher implements Fetcher {
    final Data data;

    public MyFetcher(Data data) {
        this.data = data;
    }

    @Override
    public void fetchData(FetcherCallback callback) {
        try {
            callback.OnData(data);
        }
        catch (Exception e){
            callback.onError(e);
        }
    }
}
