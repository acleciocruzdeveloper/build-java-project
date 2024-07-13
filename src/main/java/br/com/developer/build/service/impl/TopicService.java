package br.com.developer.build.service.impl;

import br.com.developer.build.domain.DataEntity;
import br.com.developer.build.domain.TopicsEntity;
import br.com.developer.build.domain.dto.DataDTO;
import br.com.developer.build.domain.dto.TopicDTO;
import br.com.developer.build.repositories.ITopicsRepository;
import br.com.developer.build.service.ITopicService;
import br.com.developer.build.utils.DataMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class TopicService implements ITopicService {

    private final ITopicsRepository repository;
    private final DataMapper dataMapper;

    @Override
    public List<DataDTO> allTopics() {
        return List.of();
    }

    @Override
    public DataDTO createTopic(TopicDTO topicDTO) {
        DataEntity dataEntity = dataMapper.toDataEntity(topicDTO);
        DataEntity entity = repository.save(dataEntity);
        return dataMapper.toDataDTO(entity);
    }
}
