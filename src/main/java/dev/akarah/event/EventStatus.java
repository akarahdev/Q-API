package dev.akarah.event;

public enum EventStatus {
    /**
     * Represents a cancellation of the event.
     */
    CANCELLED,
    /**
     * Represents the event should proceed as normal.
     * This also lets other plugins be able to cancel the event however.
     */
    NORMAL
}
