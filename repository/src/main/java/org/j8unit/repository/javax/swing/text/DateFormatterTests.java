package org.j8unit.repository.javax.swing.text;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.text.DateFormatter class javax.swing.text.DateFormatter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.DateFormatterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DateFormatterTests<SUT extends javax.swing.text.DateFormatter>
extends org.j8unit.repository.javax.swing.text.InternationalFormatterTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.text.DateFormatter#setFormat(java.text.DateFormat) public void javax.swing.text.DateFormatter.setFormat(java.text.DateFormat)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFormat_DateFormat() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
