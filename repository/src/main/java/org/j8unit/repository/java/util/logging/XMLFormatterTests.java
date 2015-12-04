package org.j8unit.repository.java.util.logging;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.logging.XMLFormatter class java.util.logging.XMLFormatter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.logging.XMLFormatterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XMLFormatterTests<SUT extends java.util.logging.XMLFormatter>
extends org.j8unit.repository.java.util.logging.FormatterTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.logging.XMLFormatter#getTail(java.util.logging.Handler) public java.lang.String java.util.logging.XMLFormatter.getTail(java.util.logging.Handler)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getTail_Handler() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.logging.XMLFormatter#getHead(java.util.logging.Handler) public java.lang.String java.util.logging.XMLFormatter.getHead(java.util.logging.Handler)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getHead_Handler() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.logging.XMLFormatter#format(java.util.logging.LogRecord) public java.lang.String java.util.logging.XMLFormatter.format(java.util.logging.LogRecord)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_format_LogRecord() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
