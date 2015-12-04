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
 * Test class for {@link javax.lang.model.element.QualifiedNameable interface javax.lang.model.element.QualifiedNameable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.element.QualifiedNameableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface QualifiedNameableTests<SUT extends javax.lang.model.element.QualifiedNameable>
extends org.j8unit.repository.javax.lang.model.element.ElementTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.QualifiedNameable#getQualifiedName() public abstract javax.lang.model.element.Name javax.lang.model.element.QualifiedNameable.getQualifiedName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getQualifiedName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
