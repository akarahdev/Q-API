package dev.akarah.events.components;

import dev.akarah.component.ComponentMaster;

public class EventComponents implements ComponentMaster<EventData, EventComponents> {
    public static MainEntityComponent ENTITY = new MainEntityComponent();
    public static CancellableComponent CANCELLABLE = new CancellableComponent();
    public static AttackerComponent ATTACKER = new AttackerComponent();
    public static VictimComponent VICTIM = new VictimComponent();
    public static LocationComponent LOCATION = new LocationComponent();
}
