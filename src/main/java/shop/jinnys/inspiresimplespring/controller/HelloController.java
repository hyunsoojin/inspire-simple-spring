package shop.jinnys.inspiresimplespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.jinnys.inspiresimplespring.dto.HelloResponseDto;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class HelloController {
    @GetMapping("hello")
    public HelloResponseDto hello(){
        String koreaTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString();
        Long timestamp = System.currentTimeMillis();
        String message = "Hello, World!";

        return HelloResponseDto.builder()
                .koreaTime(koreaTime)
                .timestamp(timestamp)
                .message(message)
                .build();
    }
}
