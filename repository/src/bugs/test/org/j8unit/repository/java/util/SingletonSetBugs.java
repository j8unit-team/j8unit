package org.j8unit.repository.java.util;

import static java.util.Collections.singleton;
import static org.junit.Assert.fail;
import java.util.Collections;
import java.util.Set;
import org.junit.Test;

/**
 * {@link Collections#singleton(Object)} is said to be immutable. Thus it should be unmodifiable too. Unfortunately, it
 * does not behave accordingly!
 *
 * @since 0.9.6
 */
public class SingletonSetBugs {

    @Test(expected = AssertionError.class)
    public void singletonIllegallySupportsRemove() {
        final UnmodifiableSetTests<Set<Object>, Object> lt = () -> singleton("single");
        try {
            lt.removeMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

}
