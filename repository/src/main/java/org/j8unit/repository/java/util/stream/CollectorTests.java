package org.j8unit.repository.java.util.stream;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.stream.Collector interface java.util.stream.Collector}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.stream.CollectorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CollectorTests<SUT extends java.util.stream.Collector<T, A, R>, T, A, R>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.stream.Collector#accumulator() public abstract java.util.function.BiConsumer
     * java.util.stream.Collector.accumulator()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accumulator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Collector#finisher() public abstract java.util.function.Function
     * java.util.stream.Collector.finisher()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_finisher()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Collector#combiner() public abstract java.util.function.BinaryOperator
     * java.util.stream.Collector.combiner()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_combiner()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Collector#characteristics() public abstract java.util.Set
     * java.util.stream.Collector.characteristics()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_characteristics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.Collector#supplier() public abstract java.util.function.Supplier
     * java.util.stream.Collector.supplier()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_supplier()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.util.stream.Collector$Characteristics class
     * java.util.stream.Collector$Characteristics}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.stream.CollectorClassTests.CharacteristicsClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CharacteristicsTests<SUT extends java.util.stream.Collector.Characteristics>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.util.stream.Collector.Characteristics> {

    }

}
