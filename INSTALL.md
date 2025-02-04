# Installing Kafka on MacOS using Homebrew

```bash
brew install kafka
brew install zookeeper

# Check Kafka version
kafka-topics --version
## This will launch Kafka on port 9092
brew services start kafka

# This will launch Kafka on port 8080 (you need to change this port)
brew services start zookeeper
```

- Binaries and scripts will be in `/usr/local/bin`
- Kafka configurations will be in `/usr/local/etc/kafka`
- Zookeeper configuration will be in `/usr/local/etc/zookeeper`
- `log.dirs` config (the location for Kafka data) will be set to `/usr/local/var/lib/kafka-logs`

## Kafka Commands

### Create Topic

```bash
kafka-topics --bootstrap-server localhost:9092 --topic first_topic --create --partitions 3 --replication-factor 1
```

### Create Producer

```bash
kafka-console-producer --bootstrap-server localhost:9092 --topic first_topic
```

### Create Consumer

```bash
kafka-console-consumer --bootstrap-server localhost:9092 --topic first_topic
```
