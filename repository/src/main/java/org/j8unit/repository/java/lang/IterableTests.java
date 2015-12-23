package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;
import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.categories.TimeLinear;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.Iterable interface java.lang.Iterable}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.java.lang.IterableTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.IterableClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.Iterable
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IterableTests<SUT extends java.lang.Iterable<T>, T>
extends RepositoryTests<SUT> {

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.Iterable#forEach(java.util.function.Consumer)
     */
    @Test
    @Category(TimeLinear.class)
    public default void forEachMustConsumeNOOP() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assumeTrue("The given Iterable is empty; Thus, this test becomes useless.", sut.iterator().hasNext());
        sut.forEach(e -> {});
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.Iterable#forEach(java.util.function.Consumer)
     */
    @Test
    public default void forEachMustRelayException() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assumeTrue("The given Iterable is empty; Thus, this test becomes useless.", sut.iterator().hasNext());
        final javax.xml.ws.Holder<Integer> counter = new javax.xml.ws.Holder<>(0);
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

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.Iterable#forEach(java.util.function.Consumer)
     */
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

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.Iterable#spliterator()
     */
    @Test
    public default void spliteratorMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.spliterator());
    }

    /**
     * <p>
     * Test method for {@link java.lang.Iterable#forEach(java.util.function.Consumer) public default void
     * java.lang.Iterable.forEach(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.Iterable#forEach(java.util.function.Consumer)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forEach_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Iterable#iterator() public abstract java.util.Iterator
     * java.lang.Iterable.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.Iterable#iterator()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_iterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Iterable#spliterator() public default java.util.Spliterator
     * java.lang.Iterable.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.Iterable#spliterator()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
