package org.j8unit.repository.java.util;

import static java.lang.String.format;
import static java.util.function.UnaryOperator.identity;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/**
 * {@link Collections#emptyList()} is said to be immutable. Thus, it must be unmodifiable too. Unfortunately, it does
 * not behave accordingly!
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html">The Java definition
 *      of <em>unmodifiable</em> and <em>immutable</em> collections</a>
 *
 * @since 0.9.6
 */
public class EmptyListBugs {

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsAddAll() {
        final List<Object> immutable = Collections.emptyList();
        try {
            immutable.addAll(Collections.emptyList());
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsClear() {
        final List<Object> immutable = Collections.emptyList();
        try {
            immutable.clear();
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsRemove() {
        final List<Object> immutable = Collections.emptyList();
        try {
            immutable.remove(new Object());
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsRemoveAll() {
        final List<Object> immutable = Collections.emptyList();
        try {
            immutable.removeAll(Collections.emptyList());
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsRemoveIf() {
        final List<Object> immutable = Collections.emptyList();
        try {
            immutable.removeIf(e -> false);
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsReplaceAll() {
        final List<Object> immutable = Collections.emptyList();
        try {
            immutable.replaceAll(identity());
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsRetainAll() {
        final List<Object> immutable = Collections.emptyList();
        try {
            immutable.retainAll(immutable);
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class)
    public void emptyListIllegallySupportsSort() {
        final List<Object> immutable = Collections.emptyList();
        try {
            immutable.sort((x, y) -> immutable.indexOf(x) - immutable.indexOf(y));
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

}
