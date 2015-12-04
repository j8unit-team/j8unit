package org.j8unit.repository.java.awt;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.HeadlessException class java.awt.HeadlessException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.HeadlessExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HeadlessExceptionTests<SUT extends java.awt.HeadlessException>
extends org.j8unit.repository.java.lang.UnsupportedOperationExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.HeadlessException#getMessage() public java.lang.String java.awt.HeadlessException.getMessage()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMessage() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
