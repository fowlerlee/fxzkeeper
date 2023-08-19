package com.example.jfxzookeeperkafka;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

public class FXWatcher implements Watcher {
    ZooKeeper z;
    public FXWatcher() throws IOException {
         z = createZookeeper();
    }

   public ZooKeeper createZookeeper() throws IOException {
        return new ZooKeeper("localhost:2181", 3000, this);
    }

    @Override
    public void process(WatchedEvent watchedEvent) {

    }
}
