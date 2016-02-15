package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.element.TypeParameterElement interface
 * javax.lang.model.element.TypeParameterElement}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link TypeParameterElementClassTests}.
 * </p>
 *
 * @see javax.lang.model.element.TypeParameterElement interface javax.lang.model.element.TypeParameterElement (the
 *      hereby targeted class-under-test class)
 * @see TypeParameterElementClassTests TypeParameterElementClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TypeParameterElementTests<SUT extends javax.lang.model.element.TypeParameterElement>
extends ElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.TypeParameterElement#getBounds() public abstract java.util.List<?
     * extends javax.lang.model.type.TypeMirror> javax.lang.model.element.TypeParameterElement.getBounds()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.TypeParameterElement#getBounds() public abstract java.util.List
     * javax.lang.model.element.TypeParameterElement.getBounds()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.TypeParameterElement#getBounds() public abstract java.util.List
     *      javax.lang.model.element.TypeParameterElement.getBounds() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.TypeParameterElement#getEnclosingElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.element.TypeParameterElement.getEnclosingElement()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.TypeParameterElement#getEnclosingElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.element.TypeParameterElement.getEnclosingElement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.TypeParameterElement#getEnclosingElement() public abstract
     *      javax.lang.model.element.Element javax.lang.model.element.TypeParameterElement.getEnclosingElement() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link javax.lang.model.element.TypeParameterElement#getGenericElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.element.TypeParameterElement.getGenericElement()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.TypeParameterElement#getGenericElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.element.TypeParameterElement.getGenericElement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.TypeParameterElement#getGenericElement() public abstract
     *      javax.lang.model.element.Element javax.lang.model.element.TypeParameterElement.getGenericElement() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGenericElement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
