package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.element.Parameterizable interface
 * javax.lang.model.element.Parameterizable}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ParameterizableClassTests}.
 * </p>
 *
 * @see javax.lang.model.element.Parameterizable interface javax.lang.model.element.Parameterizable (the hereby targeted
 *      class-under-test class)
 * @see ParameterizableClassTests ParameterizableClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParameterizableTests<SUT extends javax.lang.model.element.Parameterizable>
extends ElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.Parameterizable#getTypeParameters() public abstract
     * java.util.List<? extends javax.lang.model.element.TypeParameterElement>
     * javax.lang.model.element.Parameterizable.getTypeParameters()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.Parameterizable#getTypeParameters() public abstract
     * java.util.List javax.lang.model.element.Parameterizable.getTypeParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.Parameterizable#getTypeParameters() public abstract java.util.List
     *      javax.lang.model.element.Parameterizable.getTypeParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTypeParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
