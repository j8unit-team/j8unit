package org.j8unit.repository.java.util;

import static java.lang.String.format;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/**
 * {@link Collections#singletonList(Object)} is said to be immutable. Thus, it must be unmodifiable too. Unfortunately,
 * it does not behave accordingly!
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html">The Java definition
 *      of <em>unmodifiable</em> and <em>immutable</em> collections</a>
 *
 * @since 0.9.6
 */
public class SingletonListBugs {

    @Test(expected = AssertionError.class)
    public void singletonListIllegallySupportsAddAll() {
        final List<Object> immutable = Collections.singletonList("single");
        try {
            immutable.addAll(Collections.emptyList());
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class)
    public void singletonListIllegallySupportsRemove() {
        final List<Object> immutable = Collections.singletonList("single");
        try {
            immutable.remove(new Object());
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class)
    public void singletonListIllegallySupportsRemoveAll() {
        final List<Object> immutable = Collections.singletonList("single");
        try {
            immutable.removeAll(Collections.emptyList());
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class)
    public void singletonListIllegallySupportsRetainAll() {
        final List<Object> immutable = Collections.singletonList("single");
        try {
            immutable.retainAll(Collections.singletonList("single"));
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

    @Test(expected = AssertionError.class)
    public void singletonListIllegallySupportsSort() {
        final List<Object> immutable = Collections.singletonList("single");
        try {
            immutable.sort((x, y) -> immutable.indexOf(x) - immutable.indexOf(y));
            fail(format("According to the unmodifiable/immutable definition, an %s must have been thrown!", UnsupportedOperationException.class));
        } catch (final UnsupportedOperationException unmodifiableBarrier) {
            assertTrue("A really unmodifiable collection does not support the operation above!", true);
        }
    }

}
