package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.lang.model.element.Parameterizable interface
 * javax.lang.model.element.Parameterizable}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.lang.model.element.ParameterizableTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.lang.model.element.ParameterizableClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.lang.model.element.Parameterizable
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParameterizableTests<SUT extends javax.lang.model.element.Parameterizable>
extends org.j8unit.repository.javax.lang.model.element.ElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.Parameterizable#getTypeParameters() public abstract
     * java.util.List javax.lang.model.element.Parameterizable.getTypeParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.Parameterizable#getTypeParameters()
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
