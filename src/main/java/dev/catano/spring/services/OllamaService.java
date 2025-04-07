package dev.catano.spring.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OllamaService implements AIService {
	
	private final ChatClient chatClient;

    public OllamaService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }	

	@Override
	public String getResponse(String prompt) {
		String response = this.chatClient.prompt()
				.user(prompt)
	            .call()
	            .content();
		System.out.println("\nPROMPT: " + prompt + "\nRESPUESTA: " + response);
		return "\nPROMPT: " + prompt + "\nRESPUESTA: " + response;
	}

}
