package com.swey.test.service.impl;

import com.swey.test.ai.Assistant;
import com.swey.test.service.AIService;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.chat.request.ChatRequest;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.stereotype.Service;

@Service
public class AIServiceImpl implements AIService {
    AIServiceImpl(){

    }
    @Override
    public String getResponse(String prompt) {
        ChatLanguageModel gemini = GoogleAiGeminiChatModel.builder()
                .apiKey(System.getenv("GOOGLE_API_KEY"))
                .modelName("gemini-1.5-flash").build();
        Assistant aiServices = AiServices.builder(Assistant.class).chatLanguageModel(gemini).build();
        ChatResponse chatResponse = gemini.chat(ChatRequest.builder()
                .messages(UserMessage.from(prompt))
                .build());

        return chatResponse.aiMessage().text();
    }
}
