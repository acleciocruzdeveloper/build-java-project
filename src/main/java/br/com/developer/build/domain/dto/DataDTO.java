package br.com.developer.build.domain.dto;

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
public class DataDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -6882694438524771870L;

    private TopicDTO data;
}
