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
 * Test class for {@link java.util.function.BiFunction interface java.util.function.BiFunction},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.BiFunctionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BiFunctionTests<SUT extends java.util.function.BiFunction<T,U,R>, T, U, R>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.function.BiFunction#apply(java.lang.Object,java.lang.Object) public abstract java.lang.Object java.util.function.BiFunction.apply(java.lang.Object,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_apply_Object_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.BiFunction#andThen(java.util.function.Function) public default java.util.function.BiFunction java.util.function.BiFunction.andThen(java.util.function.Function)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_andThen_Function() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
