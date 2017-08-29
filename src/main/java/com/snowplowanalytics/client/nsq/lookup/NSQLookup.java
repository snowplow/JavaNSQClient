package com.snowplowanalytics.client.nsq.lookup;

import com.snowplowanalytics.client.nsq.ServerAddress;

import java.util.Set;

public interface NSQLookup {
    Set<ServerAddress> lookup(String topic);

    void addLookupAddress(String addr, int port);
}
