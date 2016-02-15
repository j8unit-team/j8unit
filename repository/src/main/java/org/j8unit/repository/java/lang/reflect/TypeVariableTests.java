package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.reflect.TypeVariable interface java.lang.reflect.TypeVariable}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link TypeVariableClassTests}.
 * </p>
 *
 * @see java.lang.reflect.TypeVariable interface java.lang.reflect.TypeVariable (the hereby targeted class-under-test
 *      class)
 * @see TypeVariableClassTests TypeVariableClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TypeVariableTests<SUT extends java.lang.reflect.TypeVariable<D>, D extends java.lang.reflect.GenericDeclaration>
extends TypeTests<SUT>, AnnotatedElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getName() public abstract java.lang.String
     * java.lang.reflect.TypeVariable.getName()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getName() public abstract java.lang.String
     * java.lang.reflect.TypeVariable.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.TypeVariable#getName() public abstract java.lang.String
     *      java.lang.reflect.TypeVariable.getName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getAnnotatedBounds() public abstract
     * java.lang.reflect.AnnotatedType[] java.lang.reflect.TypeVariable.getAnnotatedBounds()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getAnnotatedBounds() public abstract
     * java.lang.reflect.AnnotatedType[] java.lang.reflect.TypeVariable.getAnnotatedBounds()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.TypeVariable#getAnnotatedBounds() public abstract java.lang.reflect.AnnotatedType[]
     *      java.lang.reflect.TypeVariable.getAnnotatedBounds() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedBounds()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getGenericDeclaration() public abstract D
     * java.lang.reflect.TypeVariable.getGenericDeclaration()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getGenericDeclaration() public abstract
     * java.lang.reflect.GenericDeclaration java.lang.reflect.TypeVariable.getGenericDeclaration()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.TypeVariable#getGenericDeclaration() public abstract java.lang.reflect.GenericDeclaration
     *      java.lang.reflect.TypeVariable.getGenericDeclaration() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGenericDeclaration()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getBounds() public abstract java.lang.reflect.Type[]
     * java.lang.reflect.TypeVariable.getBounds()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.TypeVariable#getBounds() public abstract java.lang.reflect.Type[]
     * java.lang.reflect.TypeVariable.getBounds()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.TypeVariable#getBounds() public abstract java.lang.reflect.Type[]
     *      java.lang.reflect.TypeVariable.getBounds() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBounds()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
