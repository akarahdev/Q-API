package dev.akarah.objective;

import dev.akarah.datatypes.server.Identifier;

public abstract class Objective {
    Identifier<Objective> name;

    public abstract Identifier<Objective> name();
    public abstract Objective name(Identifier<Objective> name);

    public abstract String displayName();
    public abstract Objective displayName(String displayName);

    public abstract Objective setScore(String scoreName, int value);
    public abstract int getScore(String scoreName);

    public abstract ObjectiveSlot slot();
    public abstract Objective slot(ObjectiveSlot slot);
}
