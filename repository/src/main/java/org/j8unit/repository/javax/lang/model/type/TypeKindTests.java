package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.type.TypeKind class javax.lang.model.type.TypeKind}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.type.TypeKindClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TypeKindTests<SUT extends javax.lang.model.type.TypeKind>
extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.lang.model.type.TypeKind> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeKind#isPrimitive() public boolean
     * javax.lang.model.type.TypeKind.isPrimitive()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPrimitive()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
