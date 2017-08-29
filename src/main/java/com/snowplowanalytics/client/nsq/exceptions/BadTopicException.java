package com.snowplowanalytics.client.nsq.exceptions;

public class BadTopicException extends NSQException {

	public BadTopicException(String message) {
		super(message);
	}
}
