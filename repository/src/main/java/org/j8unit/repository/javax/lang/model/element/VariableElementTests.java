package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.lang.model.element.VariableElement interface
 * javax.lang.model.element.VariableElement}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.lang.model.element.VariableElementTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.lang.model.element.VariableElementClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.lang.model.element.VariableElement
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface VariableElementTests<SUT extends javax.lang.model.element.VariableElement>
extends org.j8unit.repository.javax.lang.model.element.ElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.VariableElement#getConstantValue() public abstract
     * java.lang.Object javax.lang.model.element.VariableElement.getConstantValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.VariableElement#getConstantValue()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConstantValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.VariableElement#getEnclosingElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.element.VariableElement.getEnclosingElement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.VariableElement#getEnclosingElement()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getEnclosingElement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.VariableElement#getSimpleName() public abstract
     * javax.lang.model.element.Name javax.lang.model.element.VariableElement.getSimpleName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.VariableElement#getSimpleName()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getSimpleName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
