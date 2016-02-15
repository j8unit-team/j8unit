package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.element.UnknownElementException class
 * javax.lang.model.element.UnknownElementException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link UnknownElementExceptionClassTests}.
 * </p>
 *
 * @see javax.lang.model.element.UnknownElementException class javax.lang.model.element.UnknownElementException (the
 *      hereby targeted class-under-test class)
 * @see UnknownElementExceptionClassTests UnknownElementExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnknownElementExceptionTests<SUT extends javax.lang.model.element.UnknownElementException>
extends org.j8unit.repository.javax.lang.model.UnknownEntityExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.UnknownElementException#getArgument() public java.lang.Object
     * javax.lang.model.element.UnknownElementException.getArgument()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.UnknownElementException#getArgument() public java.lang.Object
     * javax.lang.model.element.UnknownElementException.getArgument()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.UnknownElementException#getArgument() public java.lang.Object
     *      javax.lang.model.element.UnknownElementException.getArgument() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getArgument()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.UnknownElementException#getUnknownElement() public
     * javax.lang.model.element.Element javax.lang.model.element.UnknownElementException.getUnknownElement()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.UnknownElementException#getUnknownElement() public
     * javax.lang.model.element.Element javax.lang.model.element.UnknownElementException.getUnknownElement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.UnknownElementException#getUnknownElement() public javax.lang.model.element.Element
     *      javax.lang.model.element.UnknownElementException.getUnknownElement() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnknownElement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
