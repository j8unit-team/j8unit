package org.j8unit.repository.java.util.function;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.function.BiConsumer interface java.util.function.BiConsumer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.BiConsumerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BiConsumerTests<SUT extends java.util.function.BiConsumer<T,U>, T, U>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.function.BiConsumer#andThen(java.util.function.BiConsumer) public default java.util.function.BiConsumer java.util.function.BiConsumer.andThen(java.util.function.BiConsumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_andThen_BiConsumer() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.BiConsumer#accept(java.lang.Object,java.lang.Object) public abstract void java.util.function.BiConsumer.accept(java.lang.Object,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_Object_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
