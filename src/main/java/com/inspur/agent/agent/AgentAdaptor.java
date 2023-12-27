package com.inspur.agent.agent;

import java.util.List;

public abstract class AgentAdaptor implements Agent {
    private List<Action> actions;

    /**
     * get the next action to do.
     * @return the next action
     */
    Action nextAction() {
        if (actions.isEmpty()) {
            return null;
        }
        return actions.remove(0);
    }
}
