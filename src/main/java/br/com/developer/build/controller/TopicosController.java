package br.com.developer.build.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/topicos")
public class TopicosController {

    private static final Logger log = LoggerFactory.getLogger(TopicosController.class);

    @GetMapping
    public ResponseEntity<String> getHello() {
        log.info("testando aplicacao");
        return ResponseEntity.ok().body("Testando pipeline de integracao");
    }
}