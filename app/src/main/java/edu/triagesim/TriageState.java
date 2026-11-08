package edu.triagesim;

public enum TriageState {
    REVIVAL(1),
    EMERGENCY(2),
    URGENT(3),
    PRIORITY(4),
    NON_URGENT(5);

    private final int priority;

    private TriageState(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return this.priority;
    }
}
