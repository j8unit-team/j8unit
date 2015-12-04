package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.reflect.ParameterizedType interface java.lang.reflect.ParameterizedType}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.reflect.ParameterizedTypeClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParameterizedTypeTests<SUT extends java.lang.reflect.ParameterizedType>
extends org.j8unit.repository.java.lang.reflect.TypeTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.ParameterizedType#getActualTypeArguments() public abstract
     * java.lang.reflect.Type[] java.lang.reflect.ParameterizedType.getActualTypeArguments()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getActualTypeArguments()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.ParameterizedType#getOwnerType() public abstract java.lang.reflect.Type
     * java.lang.reflect.ParameterizedType.getOwnerType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOwnerType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.ParameterizedType#getRawType() public abstract java.lang.reflect.Type
     * java.lang.reflect.ParameterizedType.getRawType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRawType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
