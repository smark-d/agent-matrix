package com.inspur.agent.agent;

public interface Action {
    /**
     * do the action.
     * @param text the text to do action, normally the text is the prompt's keyword
     * @return the result of the action, normally the result is the llm's result, or with some other information
     */
    String doAction(String text);
}
