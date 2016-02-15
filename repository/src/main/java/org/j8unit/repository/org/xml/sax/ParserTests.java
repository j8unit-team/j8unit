package org.j8unit.repository.org.xml.sax;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.Parser interface org.xml.sax.Parser}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link ParserClassTests}.
 * </p>
 *
 * @see org.xml.sax.Parser interface org.xml.sax.Parser (the hereby targeted class-under-test class)
 * @see ParserClassTests ParserClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParserTests<SUT extends org.xml.sax.Parser>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.Parser#setEntityResolver(org.xml.sax.EntityResolver) public abstract void
     * org.xml.sax.Parser.setEntityResolver(org.xml.sax.EntityResolver)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.Parser#setEntityResolver(org.xml.sax.EntityResolver) public abstract void
     * org.xml.sax.Parser.setEntityResolver(org.xml.sax.EntityResolver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.Parser#setEntityResolver(org.xml.sax.EntityResolver) public abstract void
     *      org.xml.sax.Parser.setEntityResolver(org.xml.sax.EntityResolver) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEntityResolver_EntityResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.Parser#setDTDHandler(org.xml.sax.DTDHandler) public abstract void
     * org.xml.sax.Parser.setDTDHandler(org.xml.sax.DTDHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.Parser#setDTDHandler(org.xml.sax.DTDHandler) public abstract void
     * org.xml.sax.Parser.setDTDHandler(org.xml.sax.DTDHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.Parser#setDTDHandler(org.xml.sax.DTDHandler) public abstract void
     *      org.xml.sax.Parser.setDTDHandler(org.xml.sax.DTDHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDTDHandler_DTDHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.Parser#setErrorHandler(org.xml.sax.ErrorHandler) public abstract void
     * org.xml.sax.Parser.setErrorHandler(org.xml.sax.ErrorHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.Parser#setErrorHandler(org.xml.sax.ErrorHandler) public abstract void
     * org.xml.sax.Parser.setErrorHandler(org.xml.sax.ErrorHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.Parser#setErrorHandler(org.xml.sax.ErrorHandler) public abstract void
     *      org.xml.sax.Parser.setErrorHandler(org.xml.sax.ErrorHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setErrorHandler_ErrorHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.Parser#parse(String) public abstract void
     * org.xml.sax.Parser.parse(java.lang.String) throws org.xml.sax.SAXException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.Parser#parse(String) public abstract void
     * org.xml.sax.Parser.parse(java.lang.String) throws org.xml.sax.SAXException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.Parser#parse(String) public abstract void org.xml.sax.Parser.parse(java.lang.String) throws
     *      org.xml.sax.SAXException,java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.Parser#parse(org.xml.sax.InputSource) public abstract void
     * org.xml.sax.Parser.parse(org.xml.sax.InputSource) throws org.xml.sax.SAXException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.Parser#parse(org.xml.sax.InputSource) public abstract void
     * org.xml.sax.Parser.parse(org.xml.sax.InputSource) throws org.xml.sax.SAXException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.Parser#parse(org.xml.sax.InputSource) public abstract void
     *      org.xml.sax.Parser.parse(org.xml.sax.InputSource) throws org.xml.sax.SAXException,java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_InputSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.Parser#setDocumentHandler(org.xml.sax.DocumentHandler) public abstract void
     * org.xml.sax.Parser.setDocumentHandler(org.xml.sax.DocumentHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.Parser#setDocumentHandler(org.xml.sax.DocumentHandler) public abstract void
     * org.xml.sax.Parser.setDocumentHandler(org.xml.sax.DocumentHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.Parser#setDocumentHandler(org.xml.sax.DocumentHandler) public abstract void
     *      org.xml.sax.Parser.setDocumentHandler(org.xml.sax.DocumentHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDocumentHandler_DocumentHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.Parser#setLocale(java.util.Locale) public abstract void
     * org.xml.sax.Parser.setLocale(java.util.Locale) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.Parser#setLocale(java.util.Locale) public abstract void
     * org.xml.sax.Parser.setLocale(java.util.Locale) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.Parser#setLocale(java.util.Locale) public abstract void
     *      org.xml.sax.Parser.setLocale(java.util.Locale) throws org.xml.sax.SAXException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLocale_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
