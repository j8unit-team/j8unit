package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.xml.sax.ext.EntityResolver2 interface org.xml.sax.ext.EntityResolver2}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.xml.sax.ext.EntityResolver2ClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface EntityResolver2Tests<SUT extends org.xml.sax.ext.EntityResolver2>
extends org.j8unit.repository.org.xml.sax.EntityResolverTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.ext.EntityResolver2#getExternalSubset(java.lang.String,java.lang.String)
     * public abstract org.xml.sax.InputSource
     * org.xml.sax.ext.EntityResolver2.getExternalSubset(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExternalSubset_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.xml.sax.ext.EntityResolver2#resolveEntity(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
     * public abstract org.xml.sax.InputSource
     * org.xml.sax.ext.EntityResolver2.resolveEntity(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
     * throws org.xml.sax.SAXException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resolveEntity_String_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
