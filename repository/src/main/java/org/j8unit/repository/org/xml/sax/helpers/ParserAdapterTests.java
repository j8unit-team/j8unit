package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.helpers.ParserAdapter class org.xml.sax.helpers.ParserAdapter}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link ParserAdapterClassTests}.
 * </p>
 *
 * @see org.xml.sax.helpers.ParserAdapter class org.xml.sax.helpers.ParserAdapter (the hereby targeted class-under-test
 *      class)
 * @see ParserAdapterClassTests ParserAdapterClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParserAdapterTests<SUT extends org.xml.sax.helpers.ParserAdapter>
extends org.j8unit.repository.org.xml.sax.XMLReaderTests<SUT>, org.j8unit.repository.org.xml.sax.DocumentHandlerTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#characters(char[], int, int) public void
     * org.xml.sax.helpers.ParserAdapter.characters(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#characters(char[], int, int) public void
     * org.xml.sax.helpers.ParserAdapter.characters(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#characters(char[], int, int) public void
     *      org.xml.sax.helpers.ParserAdapter.characters(char[],int,int) throws org.xml.sax.SAXException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_characters_charArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getErrorHandler() public org.xml.sax.ErrorHandler
     * org.xml.sax.helpers.ParserAdapter.getErrorHandler()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getErrorHandler() public org.xml.sax.ErrorHandler
     * org.xml.sax.helpers.ParserAdapter.getErrorHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#getErrorHandler() public org.xml.sax.ErrorHandler
     *      org.xml.sax.helpers.ParserAdapter.getErrorHandler() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getErrorHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#endElement(String) public void
     * org.xml.sax.helpers.ParserAdapter.endElement(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#endElement(String) public void
     * org.xml.sax.helpers.ParserAdapter.endElement(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#endElement(String) public void
     *      org.xml.sax.helpers.ParserAdapter.endElement(java.lang.String) throws org.xml.sax.SAXException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_endElement_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getDTDHandler() public org.xml.sax.DTDHandler
     * org.xml.sax.helpers.ParserAdapter.getDTDHandler()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getDTDHandler() public org.xml.sax.DTDHandler
     * org.xml.sax.helpers.ParserAdapter.getDTDHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#getDTDHandler() public org.xml.sax.DTDHandler
     *      org.xml.sax.helpers.ParserAdapter.getDTDHandler() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDTDHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setFeature(String, boolean) public void
     * org.xml.sax.helpers.ParserAdapter.setFeature(java.lang.String,boolean) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setFeature(String, boolean) public void
     * org.xml.sax.helpers.ParserAdapter.setFeature(java.lang.String,boolean) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#setFeature(String, boolean) public void
     *      org.xml.sax.helpers.ParserAdapter.setFeature(java.lang.String,boolean) throws
     *      org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setFeature_String_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setContentHandler(org.xml.sax.ContentHandler) public
     * void org.xml.sax.helpers.ParserAdapter.setContentHandler(org.xml.sax.ContentHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setContentHandler(org.xml.sax.ContentHandler) public
     * void org.xml.sax.helpers.ParserAdapter.setContentHandler(org.xml.sax.ContentHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#setContentHandler(org.xml.sax.ContentHandler) public void
     *      org.xml.sax.helpers.ParserAdapter.setContentHandler(org.xml.sax.ContentHandler) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setContentHandler_ContentHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setProperty(String, Object) public void
     * org.xml.sax.helpers.ParserAdapter.setProperty(java.lang.String,java.lang.Object) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setProperty(String, Object) public void
     * org.xml.sax.helpers.ParserAdapter.setProperty(java.lang.String,java.lang.Object) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#setProperty(String, Object) public void
     *      org.xml.sax.helpers.ParserAdapter.setProperty(java.lang.String,java.lang.Object) throws
     *      org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setProperty_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getContentHandler() public org.xml.sax.ContentHandler
     * org.xml.sax.helpers.ParserAdapter.getContentHandler()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getContentHandler() public org.xml.sax.ContentHandler
     * org.xml.sax.helpers.ParserAdapter.getContentHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#getContentHandler() public org.xml.sax.ContentHandler
     *      org.xml.sax.helpers.ParserAdapter.getContentHandler() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getContentHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setErrorHandler(org.xml.sax.ErrorHandler) public void
     * org.xml.sax.helpers.ParserAdapter.setErrorHandler(org.xml.sax.ErrorHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setErrorHandler(org.xml.sax.ErrorHandler) public void
     * org.xml.sax.helpers.ParserAdapter.setErrorHandler(org.xml.sax.ErrorHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#setErrorHandler(org.xml.sax.ErrorHandler) public void
     *      org.xml.sax.helpers.ParserAdapter.setErrorHandler(org.xml.sax.ErrorHandler) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setDocumentLocator(org.xml.sax.Locator) public void
     * org.xml.sax.helpers.ParserAdapter.setDocumentLocator(org.xml.sax.Locator)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setDocumentLocator(org.xml.sax.Locator) public void
     * org.xml.sax.helpers.ParserAdapter.setDocumentLocator(org.xml.sax.Locator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#setDocumentLocator(org.xml.sax.Locator) public void
     *      org.xml.sax.helpers.ParserAdapter.setDocumentLocator(org.xml.sax.Locator) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setDocumentLocator_Locator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#ignorableWhitespace(char[], int, int) public void
     * org.xml.sax.helpers.ParserAdapter.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#ignorableWhitespace(char[], int, int) public void
     * org.xml.sax.helpers.ParserAdapter.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#ignorableWhitespace(char[], int, int) public void
     *      org.xml.sax.helpers.ParserAdapter.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_ignorableWhitespace_charArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#processingInstruction(String, String) public void
     * org.xml.sax.helpers.ParserAdapter.processingInstruction(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#processingInstruction(String, String) public void
     * org.xml.sax.helpers.ParserAdapter.processingInstruction(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#processingInstruction(String, String) public void
     *      org.xml.sax.helpers.ParserAdapter.processingInstruction(java.lang.String,java.lang.String) throws
     *      org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_processingInstruction_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setEntityResolver(org.xml.sax.EntityResolver) public
     * void org.xml.sax.helpers.ParserAdapter.setEntityResolver(org.xml.sax.EntityResolver)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setEntityResolver(org.xml.sax.EntityResolver) public
     * void org.xml.sax.helpers.ParserAdapter.setEntityResolver(org.xml.sax.EntityResolver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#setEntityResolver(org.xml.sax.EntityResolver) public void
     *      org.xml.sax.helpers.ParserAdapter.setEntityResolver(org.xml.sax.EntityResolver) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getProperty(String) public java.lang.Object
     * org.xml.sax.helpers.ParserAdapter.getProperty(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getProperty(String) public java.lang.Object
     * org.xml.sax.helpers.ParserAdapter.getProperty(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#getProperty(String) public java.lang.Object
     *      org.xml.sax.helpers.ParserAdapter.getProperty(java.lang.String) throws
     *      org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getProperty_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#startElement(String, org.xml.sax.AttributeList) public
     * void org.xml.sax.helpers.ParserAdapter.startElement(java.lang.String,org.xml.sax.AttributeList) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#startElement(String, org.xml.sax.AttributeList) public
     * void org.xml.sax.helpers.ParserAdapter.startElement(java.lang.String,org.xml.sax.AttributeList) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#startElement(String, org.xml.sax.AttributeList) public void
     *      org.xml.sax.helpers.ParserAdapter.startElement(java.lang.String,org.xml.sax.AttributeList) throws
     *      org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_startElement_String_AttributeList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setDTDHandler(org.xml.sax.DTDHandler) public void
     * org.xml.sax.helpers.ParserAdapter.setDTDHandler(org.xml.sax.DTDHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#setDTDHandler(org.xml.sax.DTDHandler) public void
     * org.xml.sax.helpers.ParserAdapter.setDTDHandler(org.xml.sax.DTDHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#setDTDHandler(org.xml.sax.DTDHandler) public void
     *      org.xml.sax.helpers.ParserAdapter.setDTDHandler(org.xml.sax.DTDHandler) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#parse(String) public void
     * org.xml.sax.helpers.ParserAdapter.parse(java.lang.String) throws java.io.IOException,org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#parse(String) public void
     * org.xml.sax.helpers.ParserAdapter.parse(java.lang.String) throws java.io.IOException,org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#parse(String) public void
     *      org.xml.sax.helpers.ParserAdapter.parse(java.lang.String) throws
     *      java.io.IOException,org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#parse(org.xml.sax.InputSource) public void
     * org.xml.sax.helpers.ParserAdapter.parse(org.xml.sax.InputSource) throws
     * java.io.IOException,org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#parse(org.xml.sax.InputSource) public void
     * org.xml.sax.helpers.ParserAdapter.parse(org.xml.sax.InputSource) throws
     * java.io.IOException,org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#parse(org.xml.sax.InputSource) public void
     *      org.xml.sax.helpers.ParserAdapter.parse(org.xml.sax.InputSource) throws
     *      java.io.IOException,org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getEntityResolver() public org.xml.sax.EntityResolver
     * org.xml.sax.helpers.ParserAdapter.getEntityResolver()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getEntityResolver() public org.xml.sax.EntityResolver
     * org.xml.sax.helpers.ParserAdapter.getEntityResolver()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#getEntityResolver() public org.xml.sax.EntityResolver
     *      org.xml.sax.helpers.ParserAdapter.getEntityResolver() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getEntityResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#startDocument() public void
     * org.xml.sax.helpers.ParserAdapter.startDocument() throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#startDocument() public void
     * org.xml.sax.helpers.ParserAdapter.startDocument() throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#startDocument() public void
     *      org.xml.sax.helpers.ParserAdapter.startDocument() throws org.xml.sax.SAXException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_startDocument()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#endDocument() public void
     * org.xml.sax.helpers.ParserAdapter.endDocument() throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#endDocument() public void
     * org.xml.sax.helpers.ParserAdapter.endDocument() throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#endDocument() public void org.xml.sax.helpers.ParserAdapter.endDocument()
     *      throws org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_endDocument()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getFeature(String) public boolean
     * org.xml.sax.helpers.ParserAdapter.getFeature(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.ParserAdapter#getFeature(String) public boolean
     * org.xml.sax.helpers.ParserAdapter.getFeature(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.ParserAdapter#getFeature(String) public boolean
     *      org.xml.sax.helpers.ParserAdapter.getFeature(java.lang.String) throws
     *      org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getFeature_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
