package com.snowplowanalytics.client.nsq.callbacks;

import com.snowplowanalytics.client.nsq.exceptions.NSQException;

@FunctionalInterface
public interface NSQErrorCallback {

    void error(NSQException x);
}
