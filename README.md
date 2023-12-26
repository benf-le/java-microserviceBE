# microservice app
run program
1. download axonserver: link download: https://download.axoniq.io/axonserver/axonserver-enterprise-2023.1.2-bin.zip
2. run axon(cmd)(port: 8024): D:\AxonServer-2023.1.2 -> cmd -> run: java -jar axonserver.jar 
3. run class DiscoverserverApplication
4. run h2_drive
5. run file pom.xml & run class BookserviceApplication, port 9001
6. run file pom.xml & run class EmployeeserviceApplication, port 9002
7. run file pom.xml & run class ApigatewayApplication, port 9000
8. download kafka: https://archive.apache.org/dist/kafka/3.2.0/kafka_2.13-3.2.0.tgz
9. - C:\kafka_2.13-3.2.0\bin\windows => turn on cmd in kafka 
   - run cmd => zookeeper-server-start.bat C:\kafka_2.13-3.2.0\config\zookeeper.properties
   - run cmd => kafka-server-start.bat C:\kafka_2.13-3.2.0\config\server.properties
   - (option)run cmd => kafka-topics.bat --create --topic your-name-topic --bootstrap-server localhost:9092
   - (option)run cmd => kafka-topics.bat --list --bootstrap-server localhost:9092
10.  docker run -p 8761:8761 discoveryserver:0.0.1
11.  docker run -p 8761:9000 apigateway:0.0.1
12.  docker run -p 8761:9000 apigateway:0.0.1




Sơ đồ Event Source + CQRS trong Book Service:
Command: Request Model -> Command -> Command Controller -> Aggregrate (Command Handler) -> Event -> Event Handler -> Repository -> Aggregrate (Event Sourcing Handler)

Query: Query -> QueryController -> Projection (# Aggregrate) -> Repository -> Response Model (Return data)
khi mà hàm addBook gửi cái command trong BookCommandController đc gọi thì nó sẽ nhảy qua CommandHandler bên class BookAggregate,