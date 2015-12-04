package org.j8unit.repository.java.awt.print;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.print.Printable interface java.awt.print.Printable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.print.PrintableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PrintableTests<SUT extends java.awt.print.Printable>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.print.Printable#print(java.awt.Graphics,java.awt.print.PageFormat,int) public abstract int java.awt.print.Printable.print(java.awt.Graphics,java.awt.print.PageFormat,int) throws java.awt.print.PrinterException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_print_Graphics_PageFormat_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
