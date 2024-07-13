package br.com.developer.build.controller;

import br.com.developer.build.domain.dto.DataDTO;
import br.com.developer.build.domain.dto.TopicDTO;
import br.com.developer.build.service.ITopicService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/topics")
@RequiredArgsConstructor
public class TopicsController {

    private final ITopicService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<DataDTO> createTopic(@Valid @RequestBody TopicDTO data) {
        try {
            return ResponseEntity.ok().body(service.createTopic(data));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
