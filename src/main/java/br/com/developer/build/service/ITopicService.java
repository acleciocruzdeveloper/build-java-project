package br.com.developer.build.service;


import br.com.developer.build.domain.dto.DataDTO;
import br.com.developer.build.domain.dto.TopicDTO;

import java.util.List;

public interface ITopicService {

    List<DataDTO> allTopics();

    DataDTO createTopic(TopicDTO topicDTO);
}
