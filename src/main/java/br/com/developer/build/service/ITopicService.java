package br.com.developer.build.service;


import br.com.developer.build.domain.dto.DataDTO;
import br.com.developer.build.domain.dto.TopicDTO;
import jakarta.transaction.Transactional;

import java.util.List;

public interface ITopicService {

    List<DataDTO> allTopics();

    @Transactional
    DataDTO createTopic(TopicDTO topicDTO);
}
