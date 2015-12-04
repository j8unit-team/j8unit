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
 * Test class for {@link javax.lang.model.util.AbstractTypeVisitor7 class javax.lang.model.util.AbstractTypeVisitor7},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.util.AbstractTypeVisitor7ClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AbstractTypeVisitor7Tests<SUT extends javax.lang.model.util.AbstractTypeVisitor7<R,P>, R, P>
extends org.j8unit.repository.javax.lang.model.util.AbstractTypeVisitor6Tests<SUT,R,P>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.util.AbstractTypeVisitor7#visitUnion(javax.lang.model.type.UnionType,java.lang.Object) public abstract java.lang.Object javax.lang.model.util.AbstractTypeVisitor7.visitUnion(javax.lang.model.type.UnionType,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visitUnion_UnionType_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
