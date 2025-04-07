package dev.catano.spring.controllers;

import dev.catano.spring.services.AIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ollama")
public class OllamaController {

    private final AIService aiService;

    public OllamaController(AIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/chat")
    public String getResponse(@RequestParam(defaultValue = "Dime una broma de Chuck Norris") String prompt) {
        return aiService.getResponse(prompt);
    }

}
