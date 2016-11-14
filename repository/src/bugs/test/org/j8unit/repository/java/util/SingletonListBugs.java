package org.j8unit.repository.java.util;

import static java.util.Collections.singletonList;
import static org.junit.Assert.fail;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/**
 * {@link Collections#singletonList(Object)} is said to be immutable. Thus it should be unmodifiable too. Unfortunately,
 * it does not behave accordingly!
 *
 * @since 0.9.6
 */
public class SingletonListBugs {

    @Test(expected = AssertionError.class)
    public void singletonListIllegallySupportsRemove() {
        final UnmodifiableListTests<List<Object>, Object> lt = () -> singletonList("single");
        try {
            lt.removeMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void singletonListIllegallySupportsSort() {
        final UnmodifiableListTests<List<Object>, Object> lt = () -> singletonList("single");
        try {
            lt.sortMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

}
