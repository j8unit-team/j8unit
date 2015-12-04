package org.j8unit.repository.javax.management;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.DescriptorAccess interface javax.management.DescriptorAccess},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.DescriptorAccessClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DescriptorAccessTests<SUT extends javax.management.DescriptorAccess>
extends org.j8unit.repository.javax.management.DescriptorReadTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.management.DescriptorAccess#setDescriptor(javax.management.Descriptor) public abstract void javax.management.DescriptorAccess.setDescriptor(javax.management.Descriptor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDescriptor_Descriptor() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
