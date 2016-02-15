package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.reflect.ParameterizedType interface
 * java.lang.reflect.ParameterizedType}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ParameterizedTypeClassTests}.
 * </p>
 *
 * @see java.lang.reflect.ParameterizedType interface java.lang.reflect.ParameterizedType (the hereby targeted
 *      class-under-test class)
 * @see ParameterizedTypeClassTests ParameterizedTypeClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParameterizedTypeTests<SUT extends java.lang.reflect.ParameterizedType>
extends TypeTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.ParameterizedType#getActualTypeArguments() public abstract
     * java.lang.reflect.Type[] java.lang.reflect.ParameterizedType.getActualTypeArguments()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.ParameterizedType#getActualTypeArguments() public abstract
     * java.lang.reflect.Type[] java.lang.reflect.ParameterizedType.getActualTypeArguments()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.ParameterizedType#getActualTypeArguments() public abstract java.lang.reflect.Type[]
     *      java.lang.reflect.ParameterizedType.getActualTypeArguments() (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.ParameterizedType#getRawType() public abstract java.lang.reflect.Type
     * java.lang.reflect.ParameterizedType.getRawType()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.ParameterizedType#getRawType() public abstract java.lang.reflect.Type
     * java.lang.reflect.ParameterizedType.getRawType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.ParameterizedType#getRawType() public abstract java.lang.reflect.Type
     *      java.lang.reflect.ParameterizedType.getRawType() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.lang.reflect.ParameterizedType#getOwnerType() public abstract java.lang.reflect.Type
     * java.lang.reflect.ParameterizedType.getOwnerType()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.ParameterizedType#getOwnerType() public abstract java.lang.reflect.Type
     * java.lang.reflect.ParameterizedType.getOwnerType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.ParameterizedType#getOwnerType() public abstract java.lang.reflect.Type
     *      java.lang.reflect.ParameterizedType.getOwnerType() (the hereby targeted method-under-test)
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

}
