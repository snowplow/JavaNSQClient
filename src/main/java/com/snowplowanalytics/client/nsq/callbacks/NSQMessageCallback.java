package com.snowplowanalytics.client.nsq.callbacks;

import com.snowplowanalytics.client.nsq.NSQMessage;

@FunctionalInterface
public interface NSQMessageCallback {

	public void message(NSQMessage message);
}
