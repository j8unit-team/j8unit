package org.j8unit.repository.java.time.format;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.time.format.DateTimeParseException class java.time.format.DateTimeParseException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.format.DateTimeParseExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DateTimeParseExceptionTests<SUT extends java.time.format.DateTimeParseException>
extends org.j8unit.repository.java.time.DateTimeExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeParseException#getErrorIndex() public int java.time.format.DateTimeParseException.getErrorIndex()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getErrorIndex() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeParseException#getParsedString() public java.lang.String java.time.format.DateTimeParseException.getParsedString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParsedString() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
