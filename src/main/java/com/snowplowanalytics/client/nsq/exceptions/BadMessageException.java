package com.snowplowanalytics.client.nsq.exceptions;

public class BadMessageException extends NSQException {

	public BadMessageException(String message) {
		super(message);
	}
}
