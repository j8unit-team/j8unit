package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.reflect.GenericDeclaration interface java.lang.reflect.GenericDeclaration},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.reflect.GenericDeclarationClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface GenericDeclarationTests<SUT extends java.lang.reflect.GenericDeclaration>
extends org.j8unit.repository.java.lang.reflect.AnnotatedElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.GenericDeclaration#getTypeParameters() public abstract
     * java.lang.reflect.TypeVariable[] java.lang.reflect.GenericDeclaration.getTypeParameters()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTypeParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
