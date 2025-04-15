package com.swey.test.ai;

import dev.langchain4j.service.SystemMessage;

public interface Assistant {
    @SystemMessage("You are a Financial Analyzer. Analyze my finance.")
    String chat(String userMessage);
}
