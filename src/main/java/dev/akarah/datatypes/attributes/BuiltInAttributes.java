package dev.akarah.datatypes.attributes;

import dev.akarah.component.ComponentMaster;

public class BuiltInAttributes implements ComponentMaster<
    AttributeContainer,
    BuiltInAttributes> {
    public static SimpleAttribute ARMOR = new SimpleAttribute(Attribute.ARMOR);
    public static SimpleAttribute ARMOR_TOUGHNESS = new SimpleAttribute(Attribute.ARMOR_TOUGHNESS);
    public static SimpleAttribute ATTACK_DAMAGE = new SimpleAttribute(Attribute.ATTACK_DAMAGE);
    public static SimpleAttribute ATTACK_KNOCKBACK = new SimpleAttribute(Attribute.ATTACK_KNOCKBACK);
    public static SimpleAttribute ATTACK_SPEED = new SimpleAttribute(Attribute.ATTACK_SPEED);
    public static SimpleAttribute FLYING_SPEED = new SimpleAttribute(Attribute.FLYING_SPEED);
    public static SimpleAttribute FOLLOW_RANGE = new SimpleAttribute(Attribute.FOLLOW_RANGE);
    public static SimpleAttribute KNOCKBACK_RESISTANCE = new SimpleAttribute(Attribute.KNOCKBACK_RESISTANCE);
    public static SimpleAttribute LUCK = new SimpleAttribute(Attribute.LUCK);
    public static SimpleAttribute MAX_ABSORPTION = new SimpleAttribute(Attribute.MAX_ABSORPTION);
    public static SimpleAttribute MAX_HEALTH = new SimpleAttribute(Attribute.MAX_HEALTH);
    public static SimpleAttribute MOVEMENT_SPEED = new SimpleAttribute(Attribute.MOVEMENT_SPEED);
    public static SimpleAttribute SCALE = new SimpleAttribute(Attribute.SCALE);
    public static SimpleAttribute STEP_HEIGHT = new SimpleAttribute(Attribute.STEP_HEIGHT);
    public static SimpleAttribute JUMP_STRENGTH = new SimpleAttribute(Attribute.JUMP_STRENGTH);
    public static SimpleAttribute BLOCK_INTERACTION_RANGE = new SimpleAttribute(Attribute.BLOCK_INTERACTION_RANGE);
    public static SimpleAttribute ENTITY_INTERACTION_RANGE = new SimpleAttribute(Attribute.ENTITY_INTERACTION_RANGE);
    public static SimpleAttribute SPAWN_REINFORCEMENTS = new SimpleAttribute(Attribute.SPAWN_REINFORCEMENTS);
    public static SimpleAttribute BLOCK_BREAK_SPEED = new SimpleAttribute(Attribute.BLOCK_BREAK_SPEED);
    public static SimpleAttribute GRAVITY = new SimpleAttribute(Attribute.GRAVITY);
    public static SimpleAttribute SAFE_FALL_DISTANCE = new SimpleAttribute(Attribute.SAFE_FALL_DISTANCE);
    public static SimpleAttribute FALL_DAMAGE_MULTIPLIER = new SimpleAttribute(Attribute.FALL_DAMAGE_MULTIPLIER);
    public static SimpleAttribute BURNING_TIME = new SimpleAttribute(Attribute.BURNING_TIME);
    public static SimpleAttribute EXPLOSION_KNOCKBACK_RESISTANCE = new SimpleAttribute(Attribute.EXPLOSION_KNOCKBACK_RESISTANCE);
    public static SimpleAttribute MINING_EFFICIENCY = new SimpleAttribute(Attribute.MINING_EFFICIENCY);
    public static SimpleAttribute MOVEMENT_EFFICIENCY = new SimpleAttribute(Attribute.MOVEMENT_EFFICIENCY);
    public static SimpleAttribute OXYGEN_BONUS = new SimpleAttribute(Attribute.OXYGEN_BONUS);
    public static SimpleAttribute SNEAKING_SPEED = new SimpleAttribute(Attribute.SNEAKING_SPEED);
    public static SimpleAttribute SUBMERGED_MINING_SPEED = new SimpleAttribute(Attribute.SUBMERGED_MINING_SPEED);
    public static SimpleAttribute SWEEPING_DAMAGE_RATIO = new SimpleAttribute(Attribute.SWEEPING_DAMAGE_RATIO);
    public static SimpleAttribute TEMPT_RANGE = new SimpleAttribute(Attribute.TEMPT_RANGE);
    public static SimpleAttribute WATER_MOVEMENT_EFFEICIENCY = new SimpleAttribute(Attribute.WATER_MOVEMENT_EFFEICIENCY);
}
