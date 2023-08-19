package com.example.jfxzookeeperkafka;

import org.apache.zookeeper.*;
public class LeaderElection {

    private final ZooKeeper zookeeper;

    public LeaderElection(ZooKeeper z) {
        this.zookeeper = z;
        
    }
}
