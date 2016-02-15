package org.j8unit.repository.java.util;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.Comparator interface java.util.Comparator}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ComparatorClassTests}.
 * </p>
 *
 * @see java.util.Comparator interface java.util.Comparator (the hereby targeted class-under-test class)
 * @see ComparatorClassTests ComparatorClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ComparatorTests<SUT extends java.util.Comparator<T>, T>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.Comparator#reversed() public default java.util.Comparator
     * <T> java.util.Comparator.reversed()}.
     *
     * <p>
     * Test method for {@link java.util.Comparator#reversed() public default java.util.Comparator
     * java.util.Comparator.reversed()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Comparator#reversed() public default java.util.Comparator java.util.Comparator.reversed() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reversed()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Comparator#thenComparing(java.util.function.Function) public default
     * <U> java.util.Comparator<T> java.util.Comparator.thenComparing(java.util.function.Function<? super T, ? extends
     * U>)}.
     *
     * <p>
     * Test method for {@link java.util.Comparator#thenComparing(java.util.function.Function) public default
     * java.util.Comparator java.util.Comparator.thenComparing(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Comparator#thenComparing(java.util.function.Function) public default java.util.Comparator
     *      java.util.Comparator.thenComparing(java.util.function.Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_thenComparing_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Comparator#thenComparing(java.util.Comparator) public default
     * java.util.Comparator<T> java.util.Comparator.thenComparing(java.util.Comparator<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.Comparator#thenComparing(java.util.Comparator) public default
     * java.util.Comparator java.util.Comparator.thenComparing(java.util.Comparator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Comparator#thenComparing(java.util.Comparator) public default java.util.Comparator
     *      java.util.Comparator.thenComparing(java.util.Comparator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_thenComparing_Comparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Comparator#thenComparing(java.util.function.Function, java.util.Comparator)
     * public default <U> java.util.Comparator<T> java.util.Comparator.thenComparing(java.util.function.Function<? super
     * T, ? extends U>,java.util.Comparator<? super U>)}.
     *
     * <p>
     * Test method for {@link java.util.Comparator#thenComparing(java.util.function.Function, java.util.Comparator)
     * public default java.util.Comparator
     * java.util.Comparator.thenComparing(java.util.function.Function,java.util.Comparator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Comparator#thenComparing(java.util.function.Function, java.util.Comparator) public default
     *      java.util.Comparator java.util.Comparator.thenComparing(java.util.function.Function,java.util.Comparator)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_thenComparing_Function_Comparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Comparator#thenComparingDouble(java.util.function.ToDoubleFunction) public
     * default java.util.Comparator<T> java.util.Comparator.thenComparingDouble(java.util.function.ToDoubleFunction<?
     * super T>)}.
     *
     * <p>
     * Test method for {@link java.util.Comparator#thenComparingDouble(java.util.function.ToDoubleFunction) public
     * default java.util.Comparator java.util.Comparator.thenComparingDouble(java.util.function.ToDoubleFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Comparator#thenComparingDouble(java.util.function.ToDoubleFunction) public default
     *      java.util.Comparator java.util.Comparator.thenComparingDouble(java.util.function.ToDoubleFunction) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_thenComparingDouble_ToDoubleFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Comparator#equals(Object) public abstract boolean
     * java.util.Comparator.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Comparator#equals(Object) public abstract boolean
     * java.util.Comparator.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Comparator#equals(Object) public abstract boolean java.util.Comparator.equals(java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Comparator#compare(Object, Object) public abstract int
     * java.util.Comparator.compare(T,T)}.
     *
     * <p>
     * Test method for {@link java.util.Comparator#compare(Object, Object) public abstract int
     * java.util.Comparator.compare(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Comparator#compare(Object, Object) public abstract int
     *      java.util.Comparator.compare(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compare_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Comparator#thenComparingInt(java.util.function.ToIntFunction) public default
     * java.util.Comparator<T> java.util.Comparator.thenComparingInt(java.util.function.ToIntFunction<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.Comparator#thenComparingInt(java.util.function.ToIntFunction) public default
     * java.util.Comparator java.util.Comparator.thenComparingInt(java.util.function.ToIntFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Comparator#thenComparingInt(java.util.function.ToIntFunction) public default java.util.Comparator
     *      java.util.Comparator.thenComparingInt(java.util.function.ToIntFunction) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_thenComparingInt_ToIntFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Comparator#thenComparingLong(java.util.function.ToLongFunction) public default
     * java.util.Comparator<T> java.util.Comparator.thenComparingLong(java.util.function.ToLongFunction<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.Comparator#thenComparingLong(java.util.function.ToLongFunction) public default
     * java.util.Comparator java.util.Comparator.thenComparingLong(java.util.function.ToLongFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Comparator#thenComparingLong(java.util.function.ToLongFunction) public default
     *      java.util.Comparator java.util.Comparator.thenComparingLong(java.util.function.ToLongFunction) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_thenComparingLong_ToLongFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
