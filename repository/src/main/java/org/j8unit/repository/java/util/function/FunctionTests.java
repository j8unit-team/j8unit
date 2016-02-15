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
 * non-{@code static} methods) of {@linkplain java.util.function.Function interface java.util.function.Function}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link FunctionClassTests}.
 * </p>
 *
 * @see java.util.function.Function interface java.util.function.Function (the hereby targeted class-under-test class)
 * @see FunctionClassTests FunctionClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FunctionTests<SUT extends java.util.function.Function<T, R>, T, R>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.function.Function#andThen(java.util.function.Function) public default
     * <V> java.util.function.Function<T, V> java.util.function.Function.andThen(java.util.function.Function<? super R,
     * ? extends V>)}.
     *
     * <p>
     * Test method for {@link java.util.function.Function#andThen(java.util.function.Function) public default
     * java.util.function.Function java.util.function.Function.andThen(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.Function#andThen(java.util.function.Function) public default java.util.function.Function
     *      java.util.function.Function.andThen(java.util.function.Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_andThen_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.Function#apply(Object) public abstract R
     * java.util.function.Function.apply(T)}.
     *
     * <p>
     * Test method for {@link java.util.function.Function#apply(Object) public abstract java.lang.Object
     * java.util.function.Function.apply(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.Function#apply(Object) public abstract java.lang.Object
     *      java.util.function.Function.apply(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_apply_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.Function#compose(java.util.function.Function) public default
     * <V> java.util.function.Function<V, R> java.util.function.Function.compose(java.util.function.Function<? super V,
     * ? extends T>)}.
     *
     * <p>
     * Test method for {@link java.util.function.Function#compose(java.util.function.Function) public default
     * java.util.function.Function java.util.function.Function.compose(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.Function#compose(java.util.function.Function) public default java.util.function.Function
     *      java.util.function.Function.compose(java.util.function.Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compose_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
