package br.com.developer.build.utils;

import br.com.developer.build.domain.DataEntity;
import br.com.developer.build.domain.TopicsEntity;
import br.com.developer.build.domain.dto.DataDTO;
import br.com.developer.build.domain.dto.TopicDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
@RequiredArgsConstructor
public class DataMapper {

    public DataEntity toDataEntity(TopicDTO topicDTO) {
        TopicsEntity topicsEntity = toTopicsEntity(topicDTO);
        return DataEntity.builder()
                .data(Collections.singletonList(topicsEntity))
                .build();
    }

    public DataDTO toDataDTO(DataEntity dataEntity) {
        return DataDTO.builder()
                .data(dataEntity.getData().stream()
                        .map(this::toTopicsDTO)
                        .toList())
                .build();
    }

    private TopicsEntity toTopicsEntity(TopicDTO topicsDTO) {
        return TopicsEntity.builder()
                .id(topicsDTO.getId())
                .topic(topicsDTO.getTopic())
                .build();
    }

    private TopicDTO toTopicsDTO(TopicsEntity topicsEntity) {
        return TopicDTO.builder()
                .id(topicsEntity.getId())
                .topic(topicsEntity.getTopic())
                .build();
    }
}