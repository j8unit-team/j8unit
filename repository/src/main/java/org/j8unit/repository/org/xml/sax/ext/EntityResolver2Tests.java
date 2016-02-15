package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.ext.EntityResolver2 interface org.xml.sax.ext.EntityResolver2}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link EntityResolver2ClassTests}.
 * </p>
 *
 * @see org.xml.sax.ext.EntityResolver2 interface org.xml.sax.ext.EntityResolver2 (the hereby targeted class-under-test
 *      class)
 * @see EntityResolver2ClassTests EntityResolver2ClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EntityResolver2Tests<SUT extends org.xml.sax.ext.EntityResolver2>
extends org.j8unit.repository.org.xml.sax.EntityResolverTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.ext.EntityResolver2#getExternalSubset(String, String) public abstract
     * org.xml.sax.InputSource org.xml.sax.ext.EntityResolver2.getExternalSubset(java.lang.String,java.lang.String)
     * throws org.xml.sax.SAXException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.ext.EntityResolver2#getExternalSubset(String, String) public abstract
     * org.xml.sax.InputSource org.xml.sax.ext.EntityResolver2.getExternalSubset(java.lang.String,java.lang.String)
     * throws org.xml.sax.SAXException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.ext.EntityResolver2#getExternalSubset(String, String) public abstract org.xml.sax.InputSource
     *      org.xml.sax.ext.EntityResolver2.getExternalSubset(java.lang.String,java.lang.String) throws
     *      org.xml.sax.SAXException,java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.ext.EntityResolver2#resolveEntity(String, String, String, String) public
     * abstract org.xml.sax.InputSource
     * org.xml.sax.ext.EntityResolver2.resolveEntity(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
     * throws org.xml.sax.SAXException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.ext.EntityResolver2#resolveEntity(String, String, String, String) public
     * abstract org.xml.sax.InputSource
     * org.xml.sax.ext.EntityResolver2.resolveEntity(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
     * throws org.xml.sax.SAXException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.ext.EntityResolver2#resolveEntity(String, String, String, String) public abstract
     *      org.xml.sax.InputSource
     *      org.xml.sax.ext.EntityResolver2.resolveEntity(java.lang.String,java.lang.String,java.lang.String,java.lang.
     *      String) throws org.xml.sax.SAXException,java.io.IOException (the hereby targeted method-under-test)
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
