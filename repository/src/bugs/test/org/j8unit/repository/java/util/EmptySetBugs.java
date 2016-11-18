package org.j8unit.repository.java.util;

import static java.lang.String.format;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.Collections;
import java.util.Set;
import org.junit.Test;

/**
 * {@link Collections#emptySet()} is said to be immutable. Thus, it must be unmodifiable too. Unfortunately, it does not
 * behave accordingly!
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html">The Java definition
 *      of <em>unmodifiable</em> and <em>immutable</em> collections</a>
 *
 * @since 0.9.6
 */
public class EmptySetBugs {

    @Test(expected = AssertionError.class /* because there is a bug! */)
    public void emptySetIllegallySupportsAddAll() {
        final Set<Object> immutable = Collections.emptySet();
        try {
            immutable.addAll(Collections.emptySet());
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class /* because there is a bug! */)
    public void emptySetIllegallySupportsClear() {
        final Set<Object> immutable = Collections.emptySet();
        try {
            immutable.clear();
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class /* because there is a bug! */)
    public void emptySetIllegallySupportsRemove() {
        final Set<Object> immutable = Collections.emptySet();
        try {
            immutable.remove(new Object());
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class /* because there is a bug! */)
    public void emptySetIllegallySupportsRemoveAll() {
        final Set<Object> immutable = Collections.emptySet();
        try {
            immutable.removeAll(Collections.emptySet());
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class /* because there is a bug! */)
    public void emptySetIllegallySupportsRemoveIf() {
        final Set<Object> immutable = Collections.emptySet();
        try {
            immutable.removeIf(e -> false);
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class /* because there is a bug! */)
    public void emptySetIllegallySupportsRetainAll() {
        final Set<Object> immutable = Collections.emptySet();
        try {
            immutable.retainAll(Collections.emptySet());
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

}
