package br.com.developer.build.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 4085878599160308889L;

    private Long id;

    @NotNull(message = "message cannot be null")
    @NotBlank(message = "message cannot be empty")
    private String message;

    private String topic;
}
