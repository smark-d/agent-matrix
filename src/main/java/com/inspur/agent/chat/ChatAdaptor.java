package com.inspur.agent.chat;

import com.inspur.agent.message.ChatRequest;
import com.inspur.agent.message.ChatResponse;
import com.inspur.agent.message.Message;

import java.util.LinkedList;
import java.util.List;

public class ChatAdaptor {
    private final Chat chat;
    private final List<Message> messages;

    public ChatAdaptor(Chat chat) {
        this.chat = chat;
        this.messages = new LinkedList<>();
    }

    /**
     * Sends a message to the chat. and get the response.
     *  <p>
     *      1. add the message to the chat history.
     *      2. build the ChatRequest from the chat history.
     *      3. send the ChatRequest to the chat.
     *      4. add the response to the chat history.
     *  </p>
     * @param message the message to send to the chat
     * @return the response from the chat
     */
    public ChatResponse chat(Message message) {
        messages.add(message);
        ChatRequest chatRequest = chat.buildChatRequest(messages);
        ChatResponse response = chat.chat(chatRequest);
        messages.add(message.fromChatResponse(response));
        return response;
    }
}
