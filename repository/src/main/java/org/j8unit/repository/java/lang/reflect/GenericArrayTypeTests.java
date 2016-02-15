package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.reflect.GenericArrayType interface
 * java.lang.reflect.GenericArrayType}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link GenericArrayTypeClassTests}.
 * </p>
 *
 * @see java.lang.reflect.GenericArrayType interface java.lang.reflect.GenericArrayType (the hereby targeted
 *      class-under-test class)
 * @see GenericArrayTypeClassTests GenericArrayTypeClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GenericArrayTypeTests<SUT extends java.lang.reflect.GenericArrayType>
extends TypeTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.GenericArrayType#getGenericComponentType() public abstract
     * java.lang.reflect.Type java.lang.reflect.GenericArrayType.getGenericComponentType()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.GenericArrayType#getGenericComponentType() public abstract
     * java.lang.reflect.Type java.lang.reflect.GenericArrayType.getGenericComponentType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.GenericArrayType#getGenericComponentType() public abstract java.lang.reflect.Type
     *      java.lang.reflect.GenericArrayType.getGenericComponentType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGenericComponentType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
