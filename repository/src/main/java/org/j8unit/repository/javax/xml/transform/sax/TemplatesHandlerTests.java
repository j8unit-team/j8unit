package org.j8unit.repository.javax.xml.transform.sax;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.transform.sax.TemplatesHandler interface javax.xml.transform.sax.TemplatesHandler},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.transform.sax.TemplatesHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TemplatesHandlerTests<SUT extends javax.xml.transform.sax.TemplatesHandler>
extends org.j8unit.repository.org.xml.sax.ContentHandlerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.transform.sax.TemplatesHandler#setSystemId(java.lang.String) public abstract void javax.xml.transform.sax.TemplatesHandler.setSystemId(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSystemId_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.sax.TemplatesHandler#getSystemId() public abstract java.lang.String javax.xml.transform.sax.TemplatesHandler.getSystemId()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSystemId() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.sax.TemplatesHandler#getTemplates() public abstract javax.xml.transform.Templates javax.xml.transform.sax.TemplatesHandler.getTemplates()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTemplates() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
