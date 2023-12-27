package com.inspur.agent.message;

import java.util.List;

public class ChatRequest {
    /**
     * The large language model (LLM)'s Chat messages, which is a list of chat history.
     */
    private List<Message> messages;
    /**
     * The large language model (LLM)'s Chat temperature.
     * Some models may not support this parameter.
     */
    private float temperature;
    /**
     * The large language model (LLM)'s Chat top_p.
     * Some models may not support this parameter.
     */
    private float top_p;
    /**
     * The large language model (LLM)'s Chat max token.
     * Some models may not support this parameter.
     */
    private int max_tokens;
    private int max_history;
    /**
     * is sse stream response
     */
    private boolean stream;
    /**
     * The large language model , like gpt2, gpt3, turing, turing-c
     */
    private String model;

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getTop_p() {
        return top_p;
    }

    public void setTop_p(float top_p) {
        this.top_p = top_p;
    }

    public int getMax_tokens() {
        return max_tokens;
    }

    public void setMax_tokens(int max_tokens) {
        this.max_tokens = max_tokens;
    }

    public int getMax_history() {
        return max_history;
    }

    public void setMax_history(int max_history) {
        this.max_history = max_history;
    }

    public boolean isStream() {
        return stream;
    }

    public void setStream(boolean stream) {
        this.stream = stream;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
