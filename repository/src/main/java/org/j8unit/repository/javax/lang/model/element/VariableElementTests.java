package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.element.VariableElement interface
 * javax.lang.model.element.VariableElement}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link VariableElementClassTests}.
 * </p>
 *
 * @see javax.lang.model.element.VariableElement interface javax.lang.model.element.VariableElement (the hereby targeted
 *      class-under-test class)
 * @see VariableElementClassTests VariableElementClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface VariableElementTests<SUT extends javax.lang.model.element.VariableElement>
extends ElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.VariableElement#getSimpleName() public abstract
     * javax.lang.model.element.Name javax.lang.model.element.VariableElement.getSimpleName()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.VariableElement#getSimpleName() public abstract
     * javax.lang.model.element.Name javax.lang.model.element.VariableElement.getSimpleName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.VariableElement#getSimpleName() public abstract javax.lang.model.element.Name
     *      javax.lang.model.element.VariableElement.getSimpleName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSimpleName()
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
     * <p>
     * Test method for {@link javax.lang.model.element.VariableElement#getEnclosingElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.element.VariableElement.getEnclosingElement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.VariableElement#getEnclosingElement() public abstract
     *      javax.lang.model.element.Element javax.lang.model.element.VariableElement.getEnclosingElement() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getEnclosingElement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.VariableElement#getConstantValue() public abstract
     * java.lang.Object javax.lang.model.element.VariableElement.getConstantValue()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.VariableElement#getConstantValue() public abstract
     * java.lang.Object javax.lang.model.element.VariableElement.getConstantValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.VariableElement#getConstantValue() public abstract java.lang.Object
     *      javax.lang.model.element.VariableElement.getConstantValue() (the hereby targeted method-under-test)
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

}
