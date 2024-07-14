package br.com.developer.build.utils;

import br.com.developer.build.domain.DataEntity;
import br.com.developer.build.domain.TopicsEntity;
import br.com.developer.build.domain.dto.DataDTO;
import br.com.developer.build.domain.dto.TopicDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataMapper {

    private final ModelMapper modelMapper;

    public DataEntity toDataEntity(TopicDTO topicDTO) {
        return modelMapper.map(topicDTO, DataEntity.class);
    }

    public DataDTO toDataDTO(DataEntity dataEntity) {
        return modelMapper.map(dataEntity, DataDTO.class);
    }

    public TopicsEntity toTopicsEntity(TopicDTO topicsDTO) {
        return modelMapper.map(topicsDTO, TopicsEntity.class);
    }

    public TopicDTO toTopicsDTO(TopicsEntity topicsEntity) {
        return modelMapper.map(topicsEntity, TopicDTO.class);
    }
}