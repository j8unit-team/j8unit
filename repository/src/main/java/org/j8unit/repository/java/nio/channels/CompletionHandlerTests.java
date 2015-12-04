package org.j8unit.repository.java.nio.channels;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.CompletionHandler interface java.nio.channels.CompletionHandler}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.CompletionHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CompletionHandlerTests<SUT extends java.nio.channels.CompletionHandler<V, A>, V, A>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.CompletionHandler#completed(java.lang.Object,java.lang.Object) public
     * abstract void java.nio.channels.CompletionHandler.completed(java.lang.Object,java.lang.Object)}.
     * </p>
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
     * Test method for {@link java.nio.channels.CompletionHandler#failed(java.lang.Throwable,java.lang.Object) public
     * abstract void java.nio.channels.CompletionHandler.failed(java.lang.Throwable,java.lang.Object)}.
     * </p>
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
