package org.j8unit.generator;

import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;
import static org.j8unit.generator.util.Java.STATIC;
import java.util.Set;

public abstract interface EnvelopedTypeModifiers {

    public default Set<String> optionalModifiers(final int depth) {
        return (depth == 0) ? emptySet() : singleton(STATIC);
    }

}
