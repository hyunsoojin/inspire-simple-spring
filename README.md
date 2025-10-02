# Inspire Simple Spring

## Test
```bash
$ java -jar build/libs/inspire-simple-spring-<VERSION>.jar
$ curl http://localhost:8080/hello | jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--    100   115    0   115    0     0  25732      0 --:--:-- --:--:-- --:--:-- 28750
{
  "timestamp": 1759295876291,
  "koreaTime": "2025-10-01T14:17:56.291221704+09:00[Asia/Seoul]",
  "message": "Hello, World!"
}
```

## Build
```bash
$ ./gradlew bootJar
```

## Run
```bash
$ java -jar build/libs/inspire-simple-spring-<VERSION>.jar
```

## Remote Run
```bash
$ scp -i ~/keys/aws-be2025.pem start.sh ubnutu@52.33.36.165:~/app/inspire-simple-spring/

$ ssh -i <KEY.pem> <IP> "cd ~/app/inspire-simple-spring;./start.sh"
```

## Remote stop
```bash
$ scp -i ~/keys/aws-be2025.pem stop.sh ubnutu@52.33.36.165:~/app/inspire-simple-spring/

$ ssh -i <KEY.pem> <IP> "cd ~/app/inspire-simple-spring;./stop.sh"
```

## Dockerizing
- https://spring.io/guides/gs/spring-boot-docker
- openJDK 17

## 빌드
```bash
$ ./gradlew clean bootJar
$ docker build -t jhs7251/inspire-simple-spring:0.3.0 .
$ docker images | grep inspire-simple-spring
jhs7251/inspire-simple-spring   0.3.0       265247c35ce6   3 minutes ago   560MB
$ docker push jhs7251/inspire-simple-spring:0.3.0
$ docker stats
```
# Docker Run
```bash
$ sudo docker run -d --name inspire-simple-spring -p 8080:8080 jhs7251/inspire-simple-spring:0.3.0
```



