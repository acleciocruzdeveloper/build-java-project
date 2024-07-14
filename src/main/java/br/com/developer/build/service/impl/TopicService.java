package br.com.developer.build.service.impl;

import br.com.developer.build.domain.DataEntity;
import br.com.developer.build.domain.TopicsEntity;
import br.com.developer.build.domain.dto.DataDTO;
import br.com.developer.build.domain.dto.TopicDTO;
import br.com.developer.build.repositories.IDataRepository;
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

    private final IDataRepository repository;
    private final DataMapper dataMapper;

    @Override
    public List<DataDTO> allTopics() {
        return List.of();
    }

    @Override
    public DataDTO createTopic(TopicDTO topicDTO) {
        TopicsEntity topicsEntity = dataMapper.toTopicsEntity(topicDTO);
        DataEntity data = DataEntity.builder().data(topicsEntity).build();
        DataEntity entity = repository.save(data);
        return dataMapper.toDataDTO(entity);
    }
}
