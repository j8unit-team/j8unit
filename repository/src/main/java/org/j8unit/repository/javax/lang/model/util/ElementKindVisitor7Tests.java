package org.j8unit.repository.javax.lang.model.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.lang.model.util.ElementKindVisitor7 class javax.lang.model.util.ElementKindVisitor7},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.util.ElementKindVisitor7ClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ElementKindVisitor7Tests<SUT extends javax.lang.model.util.ElementKindVisitor7<R,P>, R, P>
extends org.j8unit.repository.javax.lang.model.util.ElementKindVisitor6Tests<SUT,R,P>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.util.ElementKindVisitor7#visitVariableAsResourceVariable(javax.lang.model.element.VariableElement,java.lang.Object) public java.lang.Object javax.lang.model.util.ElementKindVisitor7.visitVariableAsResourceVariable(javax.lang.model.element.VariableElement,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visitVariableAsResourceVariable_VariableElement_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
