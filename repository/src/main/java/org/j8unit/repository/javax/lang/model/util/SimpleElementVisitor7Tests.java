package org.j8unit.repository.javax.lang.model.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.util.SimpleElementVisitor7 class javax.lang.model.util.SimpleElementVisitor7},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.util.SimpleElementVisitor7ClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SimpleElementVisitor7Tests<SUT extends javax.lang.model.util.SimpleElementVisitor7<R, P>, R, P>
extends org.j8unit.repository.javax.lang.model.util.SimpleElementVisitor6Tests<SUT, R, P> {

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.util.SimpleElementVisitor7#visitVariable(javax.lang.model.element.VariableElement,java.lang.Object)
     * public java.lang.Object
     * javax.lang.model.util.SimpleElementVisitor7.visitVariable(javax.lang.model.element.VariableElement,java.lang.Object)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visitVariable_VariableElement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
