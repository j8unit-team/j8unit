package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.CompletionHandler interface
 * java.nio.channels.CompletionHandler}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link CompletionHandlerClassTests}.
 * </p>
 *
 * @see java.nio.channels.CompletionHandler interface java.nio.channels.CompletionHandler (the hereby targeted
 *      class-under-test class)
 * @see CompletionHandlerClassTests CompletionHandlerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompletionHandlerTests<SUT extends java.nio.channels.CompletionHandler<V, A>, V, A>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.CompletionHandler#completed(Object, Object) public abstract void
     * java.nio.channels.CompletionHandler.completed(V,A)}.
     *
     * <p>
     * Test method for {@link java.nio.channels.CompletionHandler#completed(Object, Object) public abstract void
     * java.nio.channels.CompletionHandler.completed(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.CompletionHandler#completed(Object, Object) public abstract void
     *      java.nio.channels.CompletionHandler.completed(java.lang.Object,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_completed_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.CompletionHandler#failed(Throwable, Object) public abstract void
     * java.nio.channels.CompletionHandler.failed(java.lang.Throwable,A)}.
     *
     * <p>
     * Test method for {@link java.nio.channels.CompletionHandler#failed(Throwable, Object) public abstract void
     * java.nio.channels.CompletionHandler.failed(java.lang.Throwable,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.CompletionHandler#failed(Throwable, Object) public abstract void
     *      java.nio.channels.CompletionHandler.failed(java.lang.Throwable,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_failed_Throwable_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
