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
 * non-{@code static} methods) of {@linkplain java.util.function.BiConsumer interface java.util.function.BiConsumer}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link BiConsumerClassTests}.
 * </p>
 *
 * @see java.util.function.BiConsumer interface java.util.function.BiConsumer (the hereby targeted class-under-test
 *      class)
 * @see BiConsumerClassTests BiConsumerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BiConsumerTests<SUT extends java.util.function.BiConsumer<T, U>, T, U>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.function.BiConsumer#andThen(java.util.function.BiConsumer) public default
     * java.util.function.BiConsumer<T, U> java.util.function.BiConsumer.andThen(java.util.function.BiConsumer<? super
     * T, ? super U>)}.
     *
     * <p>
     * Test method for {@link java.util.function.BiConsumer#andThen(java.util.function.BiConsumer) public default
     * java.util.function.BiConsumer java.util.function.BiConsumer.andThen(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.BiConsumer#andThen(java.util.function.BiConsumer) public default
     *      java.util.function.BiConsumer java.util.function.BiConsumer.andThen(java.util.function.BiConsumer) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_andThen_BiConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.BiConsumer#accept(Object, Object) public abstract void
     * java.util.function.BiConsumer.accept(T,U)}.
     *
     * <p>
     * Test method for {@link java.util.function.BiConsumer#accept(Object, Object) public abstract void
     * java.util.function.BiConsumer.accept(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.BiConsumer#accept(Object, Object) public abstract void
     *      java.util.function.BiConsumer.accept(java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
