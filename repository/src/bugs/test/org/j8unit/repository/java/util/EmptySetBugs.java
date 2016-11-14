package org.j8unit.repository.java.util;

import static org.junit.Assert.fail;
import java.util.Collections;
import java.util.Set;
import org.junit.Test;

/**
 * {@link Collections#emptySet()} is said to be immutable. Thus it should be unmodifiable too. Unfortunately, it does
 * not behave accordingly!
 *
 * @since 0.9.6
 */
public class EmptySetBugs {

    @Test(expected = AssertionError.class)
    public void emptySetIllegallySupportsClear() {
        final UnmodifiableSetTests<Set<Object>, Object> lt = Collections::emptySet;
        try {
            lt.clearMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptySetIllegallySupportsRemove() {
        final UnmodifiableSetTests<Set<Object>, Object> lt = Collections::emptySet;
        try {
            lt.removeMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptySetIllegallySupportsRemoveAll() {
        final UnmodifiableSetTests<Set<Object>, Object> lt = Collections::emptySet;
        try {
            lt.removeAllMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptySetIllegallySupportsRetainAll() {
        final UnmodifiableSetTests<Set<Object>, Object> lt = Collections::emptySet;
        try {
            lt.retainAllMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptySetIllegallySupportsRemoveIf() {
        final UnmodifiableSetTests<Set<Object>, Object> lt = Collections::emptySet;
        try {
            lt.removeIfMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptySetIllegallySupportsAddAll() {
        final UnmodifiableSetTests<Set<Object>, Object> lt = Collections::emptySet;
        try {
            lt.addAllMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

}
