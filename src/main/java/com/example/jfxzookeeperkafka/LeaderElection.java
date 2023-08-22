package com.example.jfxzookeeperkafka;

import java.io.IOException;
import org.apache.zookeeper.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LeaderElection implements Watcher {


    public static final String Z_ADDRESS = "localhost:2181";
    public static final int TIMEOUT = 4000;
    private final ZooKeeper zookeeper;

    private static final Logger logger = LoggerFactory.getLogger(LeaderElection.class);

    public LeaderElection() throws IOException {
        this.zookeeper = createZookeeper();
        startSession();
        endSession();
    }

    public void startSession(){
        synchronized (zookeeper){
            try {
                zookeeper.wait();
                logger.info("Started the session");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void endSession() {
        synchronized (zookeeper){
            try {
                zookeeper.close();
                logger.info("Ended the session");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ZooKeeper createZookeeper() throws IOException {
        return new ZooKeeper(Z_ADDRESS, TIMEOUT, this);
    }


    @Override
    public void process(WatchedEvent watchedEvent) {
        switch (watchedEvent.getType()){
            case None -> {
                if (watchedEvent.getState() == Event.KeeperState.SyncConnected){
                    logger.info("Established connection to zookeeper");
                } else {
                    zookeeper.notifyAll();
                    logger.info("Disconnected from zookeeper");
                }
            }
        }
    }
}
