package com.swey.test.service.impl;

import com.swey.test.service.AIService;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.chat.request.ChatRequest;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import org.springframework.stereotype.Service;

@Service
public class AIServiceImpl implements AIService {
    AIServiceImpl(){

    }
    @Override
    public String getResponse() {
        ChatLanguageModel gemini = GoogleAiGeminiChatModel.builder()
                .apiKey("AIzaSyCk5cr579ys9Hu0AeEhPWFbrkDMMhXRCHY")
                .modelName("gemini-1.5-flash").build();
        ChatResponse chatResponse = gemini.chat(ChatRequest.builder()
                .messages(UserMessage.from(
                        "How many R's are there in the word 'strawberry'?"))
                .build());

        return chatResponse.aiMessage().text();
    }
}
