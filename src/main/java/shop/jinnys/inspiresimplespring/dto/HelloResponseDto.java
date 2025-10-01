package shop.jinnys.inspiresimplespring.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Builder
public class HelloResponseDto {
    private Long timestamp;
    private String koreaTime;
    private String message;
}
