package br.com.developer.build.config;

import br.com.developer.build.domain.DataEntity;
import br.com.developer.build.domain.TopicsEntity;
import br.com.developer.build.domain.dto.DataDTO;
import br.com.developer.build.domain.dto.TopicDTO;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(DataDTO.class, DataEntity.class)
                .addMappings(mapper -> mapper.skip(DataEntity::setId));
        modelMapper.typeMap(TopicDTO.class, TopicsEntity.class)
                .addMappings(mapper -> mapper.skip(TopicsEntity::setId));
        return modelMapper;
    }
}
