package dev.akarah.datatypes.attributes;

import dev.akarah.component.ComponentMaster;

public class Attributes implements ComponentMaster<
        AttributeContainer,
        Attributes> {
    public static SimpleAttribute ATTACK_DAMAGE = new SimpleAttribute(Attribute.ATTACK_DAMAGE);
    public static SimpleAttribute ATTACK_KNOCKBACK = new SimpleAttribute(Attribute.ATTACK_KNOCKBACK);
    public static SimpleAttribute ARMOR = new SimpleAttribute(Attribute.ARMOR);
}
