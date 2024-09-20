package dev.akarah.datatypes.attributes;

public enum Attribute {
    ARMOR,
    ARMOR_TOUGHNESS,
    ATTACK_DAMAGE,
    ATTACK_KNOCKBACK,
    ATTACK_SPEED,
    FLYING_SPEED,
    FOLLOW_RANGE,
    KNOCKBACK_RESISTANCE,
    LUCK,
    MAX_ABSORPTION,
    MAX_HEALTH,
    MOVEMENT_SPEED,
    SCALE,
    STEP_HEIGHT,
    JUMP_STRENGTH,
    BLOCK_INTERACTION_RANGE,
    ENTITY_INTERACTION_RANGE,
    SPAWN_REINFORCEMENTS,
    BLOCK_BREAK_SPEED,
    GRAVITY,
    SAFE_FALL_DISTANCE,
    FALL_DAMAGE_MULTIPLIER,
    BURNING_TIME,
    EXPLOSION_KNOCKBACK_RESISTANCE,
    MINING_EFFICIENCY,
    MOVEMENT_EFFICIENCY,
    OXYGEN_BONUS,
    SNEAKING_SPEED,
    SUBMERGED_MINING_SPEED,
    SWEEPING_DAMAGE_RATIO,
    TEMPT_RANGE,
    WATER_MOVEMENT_EFFEICIENCY;

    public static void printAttributes() {
        for(var value : Attribute.values()) {
            System.out.println(
                "public static SimpleAttribute {name} = new SimpleAttribute(Attribute.{name});"
                    .replace("{name}", value.name())
            );
        }
    }
}
