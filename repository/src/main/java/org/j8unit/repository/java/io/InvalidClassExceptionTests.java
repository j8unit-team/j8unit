package org.j8unit.repository.java.io;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.io.InvalidClassException class java.io.InvalidClassException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.io.InvalidClassExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface InvalidClassExceptionTests<SUT extends java.io.InvalidClassException>
extends org.j8unit.repository.java.io.ObjectStreamExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.io.InvalidClassException#getMessage() public java.lang.String java.io.InvalidClassException.getMessage()}.
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
