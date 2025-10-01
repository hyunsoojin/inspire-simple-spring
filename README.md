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

