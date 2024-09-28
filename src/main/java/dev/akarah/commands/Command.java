package dev.akarah.commands;

import java.lang.annotation.Annotation;

public @interface Command {
    CommandArgument[] value();
}
