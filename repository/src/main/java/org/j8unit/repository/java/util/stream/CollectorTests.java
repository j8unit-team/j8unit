package org.j8unit.repository.java.util.stream;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.stream.Collector interface java.util.stream.Collector}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CollectorClassTests}.
 * </p>
 *
 * @see java.util.stream.Collector interface java.util.stream.Collector (the hereby targeted class-under-test class)
 * @see CollectorClassTests CollectorClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CollectorTests<SUT extends java.util.stream.Collector<T, A, R>, T, A, R>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.stream.Collector#accumulator() public abstract java.util.function.BiConsumer<A,
     * T> java.util.stream.Collector.accumulator()}.
     *
     * <p>
     * Test method for {@link java.util.stream.Collector#accumulator() public abstract java.util.function.BiConsumer
     * java.util.stream.Collector.accumulator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Collector#accumulator() public abstract java.util.function.BiConsumer
     *      java.util.stream.Collector.accumulator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.stream.Collector#finisher() public abstract java.util.function.Function<A, R>
     * java.util.stream.Collector.finisher()}.
     *
     * <p>
     * Test method for {@link java.util.stream.Collector#finisher() public abstract java.util.function.Function
     * java.util.stream.Collector.finisher()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Collector#finisher() public abstract java.util.function.Function
     *      java.util.stream.Collector.finisher() (the hereby targeted method-under-test)
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
     * <A> java.util.stream.Collector.combiner()}.
     *
     * <p>
     * Test method for {@link java.util.stream.Collector#combiner() public abstract java.util.function.BinaryOperator
     * java.util.stream.Collector.combiner()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Collector#combiner() public abstract java.util.function.BinaryOperator
     *      java.util.stream.Collector.combiner() (the hereby targeted method-under-test)
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
     * <java.util.stream.Collector$Characteristics> java.util.stream.Collector.characteristics()}.
     *
     * <p>
     * Test method for {@link java.util.stream.Collector#characteristics() public abstract java.util.Set
     * java.util.stream.Collector.characteristics()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Collector#characteristics() public abstract java.util.Set
     *      java.util.stream.Collector.characteristics() (the hereby targeted method-under-test)
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
     * <A> java.util.stream.Collector.supplier()}.
     *
     * <p>
     * Test method for {@link java.util.stream.Collector#supplier() public abstract java.util.function.Supplier
     * java.util.stream.Collector.supplier()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.Collector#supplier() public abstract java.util.function.Supplier
     *      java.util.stream.Collector.supplier() (the hereby targeted method-under-test)
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.stream.Collector.Characteristics class
     * java.util.stream.Collector$Characteristics}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link CollectorClassTests.CharacteristicsClassTests}.
     * </p>
     *
     * @see java.util.stream.Collector.Characteristics class java.util.stream.Collector$Characteristics (the hereby
     *      targeted class-under-test class)
     * @see CollectorClassTests.CharacteristicsClassTests CollectorClassTests.CharacteristicsClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CharacteristicsTests<SUT extends java.util.stream.Collector.Characteristics>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.util.stream.Collector.Characteristics> {

    }

}
