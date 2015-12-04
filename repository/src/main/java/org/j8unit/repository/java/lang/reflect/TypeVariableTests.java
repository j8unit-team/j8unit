package org.j8unit.repository.java.lang.reflect;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.reflect.TypeVariable interface java.lang.reflect.TypeVariable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.reflect.TypeVariableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TypeVariableTests<SUT extends java.lang.reflect.TypeVariable<D>, D extends java.lang.reflect.GenericDeclaration>
extends org.j8unit.repository.java.lang.reflect.TypeTests<SUT>,
        org.j8unit.repository.java.lang.reflect.AnnotatedElementTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getName() public abstract java.lang.String java.lang.reflect.TypeVariable.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getAnnotatedBounds() public abstract java.lang.reflect.AnnotatedType[] java.lang.reflect.TypeVariable.getAnnotatedBounds()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedBounds() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getGenericDeclaration() public abstract java.lang.reflect.GenericDeclaration java.lang.reflect.TypeVariable.getGenericDeclaration()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGenericDeclaration() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getBounds() public abstract java.lang.reflect.Type[] java.lang.reflect.TypeVariable.getBounds()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBounds() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
