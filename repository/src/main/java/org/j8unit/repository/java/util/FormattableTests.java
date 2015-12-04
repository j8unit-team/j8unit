package org.j8unit.repository.java.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.Formattable interface java.util.Formattable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.FormattableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface FormattableTests<SUT extends java.util.Formattable>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.Formattable#formatTo(java.util.Formatter,int,int,int) public abstract void java.util.Formattable.formatTo(java.util.Formatter,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_formatTo_Formatter_int_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
