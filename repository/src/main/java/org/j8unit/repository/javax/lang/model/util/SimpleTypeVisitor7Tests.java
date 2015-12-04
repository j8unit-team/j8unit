package org.j8unit.repository.javax.lang.model.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.util.SimpleTypeVisitor7 class javax.lang.model.util.SimpleTypeVisitor7},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.util.SimpleTypeVisitor7ClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SimpleTypeVisitor7Tests<SUT extends javax.lang.model.util.SimpleTypeVisitor7<R, P>, R, P>
extends org.j8unit.repository.javax.lang.model.util.SimpleTypeVisitor6Tests<SUT, R, P> {

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.util.SimpleTypeVisitor7#visitUnion(javax.lang.model.type.UnionType,java.lang.Object)
     * public java.lang.Object
     * javax.lang.model.util.SimpleTypeVisitor7.visitUnion(javax.lang.model.type.UnionType,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visitUnion_UnionType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
