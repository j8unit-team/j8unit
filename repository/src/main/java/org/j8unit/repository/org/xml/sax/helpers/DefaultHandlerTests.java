package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.helpers.DefaultHandler class
 * org.xml.sax.helpers.DefaultHandler}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DefaultHandlerClassTests}.
 * </p>
 *
 * @see org.xml.sax.helpers.DefaultHandler class org.xml.sax.helpers.DefaultHandler (the hereby targeted
 *      class-under-test class)
 * @see DefaultHandlerClassTests DefaultHandlerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultHandlerTests<SUT extends org.xml.sax.helpers.DefaultHandler>
extends org.j8unit.repository.org.xml.sax.EntityResolverTests<SUT>, org.j8unit.repository.org.xml.sax.DTDHandlerTests<SUT>,
org.j8unit.repository.org.xml.sax.ContentHandlerTests<SUT>, org.j8unit.repository.org.xml.sax.ErrorHandlerTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#characters(char[], int, int) public void
     * org.xml.sax.helpers.DefaultHandler.characters(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#characters(char[], int, int) public void
     * org.xml.sax.helpers.DefaultHandler.characters(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int) public void
     *      org.xml.sax.helpers.DefaultHandler.characters(char[],int,int) throws org.xml.sax.SAXException (the hereby
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
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#endElement(String, String, String) public void
     * org.xml.sax.helpers.DefaultHandler.endElement(java.lang.String,java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#endElement(String, String, String) public void
     * org.xml.sax.helpers.DefaultHandler.endElement(java.lang.String,java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#endElement(String, String, String) public void
     *      org.xml.sax.helpers.DefaultHandler.endElement(java.lang.String,java.lang.String,java.lang.String) throws
     *      org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_endElement_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#startPrefixMapping(String, String) public void
     * org.xml.sax.helpers.DefaultHandler.startPrefixMapping(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#startPrefixMapping(String, String) public void
     * org.xml.sax.helpers.DefaultHandler.startPrefixMapping(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#startPrefixMapping(String, String) public void
     *      org.xml.sax.helpers.DefaultHandler.startPrefixMapping(java.lang.String,java.lang.String) throws
     *      org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_startPrefixMapping_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#skippedEntity(String) public void
     * org.xml.sax.helpers.DefaultHandler.skippedEntity(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#skippedEntity(String) public void
     * org.xml.sax.helpers.DefaultHandler.skippedEntity(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#skippedEntity(String) public void
     *      org.xml.sax.helpers.DefaultHandler.skippedEntity(java.lang.String) throws org.xml.sax.SAXException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_skippedEntity_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#unparsedEntityDecl(String, String, String, String)
     * public void
     * org.xml.sax.helpers.DefaultHandler.unparsedEntityDecl(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
     * throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#unparsedEntityDecl(String, String, String, String)
     * public void
     * org.xml.sax.helpers.DefaultHandler.unparsedEntityDecl(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
     * throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#unparsedEntityDecl(String, String, String, String) public void
     *      org.xml.sax.helpers.DefaultHandler.unparsedEntityDecl(java.lang.String,java.lang.String,java.lang.String,
     *      java.lang.String) throws org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_unparsedEntityDecl_String_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#warning(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.DefaultHandler.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#warning(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.DefaultHandler.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#warning(org.xml.sax.SAXParseException) public void
     *      org.xml.sax.helpers.DefaultHandler.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_warning_SAXParseException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#setDocumentLocator(org.xml.sax.Locator) public void
     * org.xml.sax.helpers.DefaultHandler.setDocumentLocator(org.xml.sax.Locator)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#setDocumentLocator(org.xml.sax.Locator) public void
     * org.xml.sax.helpers.DefaultHandler.setDocumentLocator(org.xml.sax.Locator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#setDocumentLocator(org.xml.sax.Locator) public void
     *      org.xml.sax.helpers.DefaultHandler.setDocumentLocator(org.xml.sax.Locator) (the hereby targeted
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
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#ignorableWhitespace(char[], int, int) public void
     * org.xml.sax.helpers.DefaultHandler.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#ignorableWhitespace(char[], int, int) public void
     * org.xml.sax.helpers.DefaultHandler.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#ignorableWhitespace(char[], int, int) public void
     *      org.xml.sax.helpers.DefaultHandler.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException (the
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
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#processingInstruction(String, String) public void
     * org.xml.sax.helpers.DefaultHandler.processingInstruction(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#processingInstruction(String, String) public void
     * org.xml.sax.helpers.DefaultHandler.processingInstruction(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#processingInstruction(String, String) public void
     *      org.xml.sax.helpers.DefaultHandler.processingInstruction(java.lang.String,java.lang.String) throws
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
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#endPrefixMapping(String) public void
     * org.xml.sax.helpers.DefaultHandler.endPrefixMapping(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#endPrefixMapping(String) public void
     * org.xml.sax.helpers.DefaultHandler.endPrefixMapping(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#endPrefixMapping(String) public void
     *      org.xml.sax.helpers.DefaultHandler.endPrefixMapping(java.lang.String) throws org.xml.sax.SAXException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_endPrefixMapping_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.xml.sax.helpers.DefaultHandler#startElement(String, String, String, org.xml.sax.Attributes) public
     * void
     * org.xml.sax.helpers.DefaultHandler.startElement(java.lang.String,java.lang.String,java.lang.String,org.xml.sax.Attributes)
     * throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for
     * {@link org.xml.sax.helpers.DefaultHandler#startElement(String, String, String, org.xml.sax.Attributes) public
     * void
     * org.xml.sax.helpers.DefaultHandler.startElement(java.lang.String,java.lang.String,java.lang.String,org.xml.sax.Attributes)
     * throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#startElement(String, String, String, org.xml.sax.Attributes) public void
     *      org.xml.sax.helpers.DefaultHandler.startElement(java.lang.String,java.lang.String,java.lang.String,org.xml.
     *      sax.Attributes) throws org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_startElement_String_String_String_Attributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#fatalError(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.DefaultHandler.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#fatalError(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.DefaultHandler.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#fatalError(org.xml.sax.SAXParseException) public void
     *      org.xml.sax.helpers.DefaultHandler.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_fatalError_SAXParseException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#resolveEntity(String, String) public
     * org.xml.sax.InputSource org.xml.sax.helpers.DefaultHandler.resolveEntity(java.lang.String,java.lang.String)
     * throws java.io.IOException,org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#resolveEntity(String, String) public
     * org.xml.sax.InputSource org.xml.sax.helpers.DefaultHandler.resolveEntity(java.lang.String,java.lang.String)
     * throws java.io.IOException,org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#resolveEntity(String, String) public org.xml.sax.InputSource
     *      org.xml.sax.helpers.DefaultHandler.resolveEntity(java.lang.String,java.lang.String) throws
     *      java.io.IOException,org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_resolveEntity_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#error(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.DefaultHandler.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#error(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.DefaultHandler.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#error(org.xml.sax.SAXParseException) public void
     *      org.xml.sax.helpers.DefaultHandler.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_error_SAXParseException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#startDocument() public void
     * org.xml.sax.helpers.DefaultHandler.startDocument() throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#startDocument() public void
     * org.xml.sax.helpers.DefaultHandler.startDocument() throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#startDocument() public void
     *      org.xml.sax.helpers.DefaultHandler.startDocument() throws org.xml.sax.SAXException (the hereby targeted
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
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#endDocument() public void
     * org.xml.sax.helpers.DefaultHandler.endDocument() throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#endDocument() public void
     * org.xml.sax.helpers.DefaultHandler.endDocument() throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#endDocument() public void
     *      org.xml.sax.helpers.DefaultHandler.endDocument() throws org.xml.sax.SAXException (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#notationDecl(String, String, String) public void
     * org.xml.sax.helpers.DefaultHandler.notationDecl(java.lang.String,java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.DefaultHandler#notationDecl(String, String, String) public void
     * org.xml.sax.helpers.DefaultHandler.notationDecl(java.lang.String,java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.DefaultHandler#notationDecl(String, String, String) public void
     *      org.xml.sax.helpers.DefaultHandler.notationDecl(java.lang.String,java.lang.String,java.lang.String) throws
     *      org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_notationDecl_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
