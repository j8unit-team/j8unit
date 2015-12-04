package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.lang.model.element.UnknownElementException class javax.lang.model.element.UnknownElementException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.element.UnknownElementExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface UnknownElementExceptionTests<SUT extends javax.lang.model.element.UnknownElementException>
extends org.j8unit.repository.javax.lang.model.UnknownEntityExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.UnknownElementException#getArgument() public java.lang.Object javax.lang.model.element.UnknownElementException.getArgument()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getArgument() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.UnknownElementException#getUnknownElement() public javax.lang.model.element.Element javax.lang.model.element.UnknownElementException.getUnknownElement()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnknownElement() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
