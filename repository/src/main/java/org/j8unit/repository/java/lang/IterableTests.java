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
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Iterable public
 * abstract interface java.lang.Iterable<T>}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.lang.IterableClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IterableTests<SUT extends Iterable<T>, T>
extends RepositoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Iterable]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Iterable#forEach(java.util.function.Consumer) public
     * default void java.lang.Iterable.forEach(java.util.function.Consumer<? super T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test {@link Iterable#spliterator() public default
     * java.util.Spliterator<T> java.lang.Iterable.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Iterable#iterator() public abstract
     * java.util.Iterator<T> java.lang.Iterable.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Iterable]

    /**
     * @see Iterable#forEach(java.util.function.Consumer) public default void
     *      java.lang.Iterable.forEach(java.util.function.Consumer) (the hereby targeted method-under-test)
     *
     * @since 0.9.3
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
     * @see Iterable#forEach(java.util.function.Consumer) public default void
     *      java.lang.Iterable.forEach(java.util.function.Consumer) (the hereby targeted method-under-test)
     *
     * @since 0.9.3
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
     * @see Iterable#forEach(java.util.function.Consumer) public default void
     *      java.lang.Iterable.forEach(java.util.function.Consumer) (the hereby targeted method-under-test)
     *
     * @since 0.9.3
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
     * @see Iterable#spliterator() public default java.util.Spliterator java.lang.Iterable.spliterator() (the hereby
     *      targeted method-under-test)
     *
     * @since 0.9.3
     */
    @Test
    public default void spliteratorMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.spliterator());
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Iterable]

}
