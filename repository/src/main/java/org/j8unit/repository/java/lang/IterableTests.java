package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;
import javax.xml.ws.Holder;
import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.categories.TimeLinear;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.Iterable interface java.lang.Iterable}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.IterableClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IterableTests<SUT extends java.lang.Iterable<T>, T>
extends J8UnitTest<SUT> {

    @Test
    @Category(TimeLinear.class)
    public default void forEachMustConsumeNOOP() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assumeTrue("The given Iterable is empty; Thus, the test becomes useless.", sut.iterator().hasNext());
        sut.forEach(e -> {});
    }

    @Test
    public default void forEachMustRelayException() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assumeTrue("The given Iterable is empty; Thus, the test becomes useless.", sut.iterator().hasNext());
        final Holder<Integer> counter = new Holder<>(0);
        try {
            sut.forEach(e -> {
                counter.value++;
                throw new UnsupportedOperationException("relayed exception");
            });
            fail("Thrown exception has been suppressed!");
        } catch (final UnsupportedOperationException relayed) {
            // check exception
            assertEquals("relayed exception", relayed.getMessage());
            // check unique execution of consumer block
            assertEquals((Integer) 1, counter.value);
            return;
        }
    }

    @Test(expected = NullPointerException.class)
    @Category(TimeLinear.class)
    public default void forEachOfNullMustCauseNPE() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.forEach(null);
    }

    @Test
    public default void iteratorMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.iterator());
    }

    @Test
    public default void spliteratorMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.spliterator());
    }

}
