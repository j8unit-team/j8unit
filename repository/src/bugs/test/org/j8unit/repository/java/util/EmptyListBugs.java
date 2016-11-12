package org.j8unit.repository.java.util;

import static org.junit.Assert.fail;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/**
 * {@link Collections#emptyList()} is said to be immutable. Thus it should be unmodifiable too. Unfortunately, it does
 * not behave accordingly!
 *
 * @since 0.9.6
 */
public class EmptyListBugs {

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsClear() {
        final UnmodifiableListTests<List<Object>, Object> lt = Collections::emptyList;
        try {
            lt.clearMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsRemove() {
        final UnmodifiableListTests<List<Object>, Object> lt = Collections::emptyList;
        try {
            lt.removeMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsRemoveAll() {
        final UnmodifiableListTests<List<Object>, Object> lt = Collections::emptyList;
        try {
            lt.removeAllMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsReplaceAll() {
        final UnmodifiableListTests<List<Object>, Object> lt = Collections::emptyList;
        try {
            lt.replaceAllMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsRetainAll() {
        final UnmodifiableListTests<List<Object>, Object> lt = Collections::emptyList;
        try {
            lt.retainAllMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsSort() {
        final UnmodifiableListTests<List<Object>, Object> lt = Collections::emptyList;
        try {
            lt.sortMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsRemoveIf() {
        final UnmodifiableListTests<List<Object>, Object> lt = Collections::emptyList;
        try {
            lt.removeIfMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsAddAll() {
        final UnmodifiableListTests<List<Object>, Object> lt = Collections::emptyList;
        try {
            lt.addAllMustThrowUOE();
            fail("According to the immutable/unmodifiable definition, a UnsupportedOperationException must have been thrown!");
        } catch (final UnsupportedOperationException missing) {}
    }

}
