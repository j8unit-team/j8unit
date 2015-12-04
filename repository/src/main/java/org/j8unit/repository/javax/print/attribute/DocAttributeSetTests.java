package org.j8unit.repository.javax.print.attribute;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.print.attribute.DocAttributeSet interface javax.print.attribute.DocAttributeSet},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.attribute.DocAttributeSetClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DocAttributeSetTests<SUT extends javax.print.attribute.DocAttributeSet>
extends org.j8unit.repository.javax.print.attribute.AttributeSetTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.print.attribute.DocAttributeSet#add(javax.print.attribute.Attribute) public abstract boolean javax.print.attribute.DocAttributeSet.add(javax.print.attribute.Attribute)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_add_Attribute() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.DocAttributeSet#addAll(javax.print.attribute.AttributeSet) public abstract boolean javax.print.attribute.DocAttributeSet.addAll(javax.print.attribute.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addAll_AttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
