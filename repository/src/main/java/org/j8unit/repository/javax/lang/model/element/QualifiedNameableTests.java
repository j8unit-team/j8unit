package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.element.QualifiedNameable interface
 * javax.lang.model.element.QualifiedNameable}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.element.QualifiedNameableClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface QualifiedNameableTests<SUT extends javax.lang.model.element.QualifiedNameable>
extends org.j8unit.repository.javax.lang.model.element.ElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.QualifiedNameable#getQualifiedName() public abstract
     * javax.lang.model.element.Name javax.lang.model.element.QualifiedNameable.getQualifiedName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getQualifiedName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
