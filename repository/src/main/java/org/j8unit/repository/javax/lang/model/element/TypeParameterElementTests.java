package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.element.TypeParameterElement interface
 * javax.lang.model.element.TypeParameterElement}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.element.TypeParameterElementClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TypeParameterElementTests<SUT extends javax.lang.model.element.TypeParameterElement>
extends org.j8unit.repository.javax.lang.model.element.ElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.TypeParameterElement#getBounds() public abstract java.util.List
     * javax.lang.model.element.TypeParameterElement.getBounds()}.
     * </p>
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
     * </p>
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
     * Test method for {@link javax.lang.model.element.TypeParameterElement#getGenericElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.element.TypeParameterElement.getGenericElement()}.
     * </p>
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
