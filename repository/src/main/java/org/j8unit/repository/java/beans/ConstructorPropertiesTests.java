package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.ConstructorProperties interface
 * java.beans.ConstructorProperties}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link ConstructorPropertiesClassTests}.
 * </p>
 *
 * @see java.beans.ConstructorProperties interface java.beans.ConstructorProperties (the hereby targeted
 *      class-under-test class)
 * @see ConstructorPropertiesClassTests ConstructorPropertiesClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConstructorPropertiesTests<SUT extends java.beans.ConstructorProperties>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.ConstructorProperties#value() public abstract java.lang.String[]
     * java.beans.ConstructorProperties.value()}.
     *
     * <p>
     * Test method for {@link java.beans.ConstructorProperties#value() public abstract java.lang.String[]
     * java.beans.ConstructorProperties.value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.ConstructorProperties#value() public abstract java.lang.String[]
     *      java.beans.ConstructorProperties.value() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
