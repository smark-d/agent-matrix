package com.inspur.agent.chat;

import com.inspur.agent.message.ChatRequest;
import com.inspur.agent.message.ChatResponse;
import com.inspur.agent.message.Message;

import java.util.List;

/**
 * The large language model (LLM)'s Chat interface.
 * <p>
 *     This interface is used to represent a chat.
 *     All chats must implement this interface.
 * </p>
 */
public interface Chat {
    /**
     * Sends a message to the chat.
     * @param chatRequest the message to send
     * @return the message that was sent
     */
    ChatResponse chat(ChatRequest chatRequest);

    /**
     * Build ChatRequest from messages.
     * @param messages the chat history messages
     * @return the ChatRequest that was built
     */
    ChatRequest buildChatRequest(List<Message> messages);

    /**
     * Embedding text to vector.
     * @param text the text to embedding
     * @return the vector that was built
     */
    List<Float> embedding(String text);
}
