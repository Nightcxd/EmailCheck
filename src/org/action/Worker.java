package org.action;
/**
 * Created by cxd on 2016/11/22.
 */
public class Worker {
    public void doWork(){
        Fetcher fetcher=new MyFetcher(new Data(1,0));
        fetcher.fetchData(new FetcherCallback() {
            @Override
            public void OnData(Data data) throws Exception {
                System.out.println("Data receive:"+data);
            }

            @Override
            public void onError(Throwable cause) {
                System.out.println("An error acure:"+cause.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        Worker worker=new Worker();
        worker.doWork();
    }
}
