## JavaNSQClient

A netty-based Java8 client for [NSQ](https://nsq.io) heavily forked of
[brainlag/JavaNSQClient](https://github.com/brainlag/JavaNSQClient).

## Artifact

### Maven

```xml
<dependency>
  <groupId>com.snowplowanalytics</groupId>
  <artifactId>nsq-java-client</artifactId>
  <version>1.2.0</version>
</dependency>
```


### SBT

```scala
"com.snowplowanalytics" % "nsq-java-client" % "1.2.0"
```

## Consumer

Example usage:

```
NSQLookup lookup = new DefaultNSQLookup();
lookup.addLookupAddress("localhost", 4161);
NSQConsumer consumer = new NSQConsumer(lookup, "speedtest", "dustin", (message) -> {
        System.out.println("received: " + message);
        //now mark the message as finished.
        message.finished();

        //or you could requeue it, which indicates a failure and puts it back on the queue.
        //message.requeue();
});

consumer.start();
```

## Producer

Example usage:

```
NSQProducer producer = new NSQProducer().addAddress("localhost", 4150).start();
producer.produce("TestTopic", ("this is a message").getBytes());
```

## Backoff

By default Backoff does not kick in and a consumer will eat all your memory
and CPU. To enable Backoff you have to set your own thread pool executer with:

```
consumer.setExecutor(...);
```
