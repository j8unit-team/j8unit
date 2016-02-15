package org.j8unit.repository.java.util.function;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.function.BiPredicate interface java.util.function.BiPredicate}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link BiPredicateClassTests}.
 * </p>
 *
 * @see java.util.function.BiPredicate interface java.util.function.BiPredicate (the hereby targeted class-under-test
 *      class)
 * @see BiPredicateClassTests BiPredicateClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BiPredicateTests<SUT extends java.util.function.BiPredicate<T, U>, T, U>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.function.BiPredicate#or(java.util.function.BiPredicate) public default
     * java.util.function.BiPredicate<T, U> java.util.function.BiPredicate.or(java.util.function.BiPredicate<? super T,
     * ? super U>)}.
     *
     * <p>
     * Test method for {@link java.util.function.BiPredicate#or(java.util.function.BiPredicate) public default
     * java.util.function.BiPredicate java.util.function.BiPredicate.or(java.util.function.BiPredicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.BiPredicate#or(java.util.function.BiPredicate) public default
     *      java.util.function.BiPredicate java.util.function.BiPredicate.or(java.util.function.BiPredicate) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_or_BiPredicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.BiPredicate#test(Object, Object) public abstract boolean
     * java.util.function.BiPredicate.test(T,U)}.
     *
     * <p>
     * Test method for {@link java.util.function.BiPredicate#test(Object, Object) public abstract boolean
     * java.util.function.BiPredicate.test(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.BiPredicate#test(Object, Object) public abstract boolean
     *      java.util.function.BiPredicate.test(java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_test_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.BiPredicate#and(java.util.function.BiPredicate) public default
     * java.util.function.BiPredicate<T, U> java.util.function.BiPredicate.and(java.util.function.BiPredicate<? super T,
     * ? super U>)}.
     *
     * <p>
     * Test method for {@link java.util.function.BiPredicate#and(java.util.function.BiPredicate) public default
     * java.util.function.BiPredicate java.util.function.BiPredicate.and(java.util.function.BiPredicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.BiPredicate#and(java.util.function.BiPredicate) public default
     *      java.util.function.BiPredicate java.util.function.BiPredicate.and(java.util.function.BiPredicate) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_and_BiPredicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.BiPredicate#negate() public default java.util.function.BiPredicate<T,
     * U> java.util.function.BiPredicate.negate()}.
     *
     * <p>
     * Test method for {@link java.util.function.BiPredicate#negate() public default java.util.function.BiPredicate
     * java.util.function.BiPredicate.negate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.BiPredicate#negate() public default java.util.function.BiPredicate
     *      java.util.function.BiPredicate.negate() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_negate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
