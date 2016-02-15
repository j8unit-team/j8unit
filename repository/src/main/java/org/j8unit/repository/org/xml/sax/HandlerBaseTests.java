package org.j8unit.repository.org.xml.sax;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.HandlerBase class org.xml.sax.HandlerBase}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link HandlerBaseClassTests}.
 * </p>
 *
 * @see org.xml.sax.HandlerBase class org.xml.sax.HandlerBase (the hereby targeted class-under-test class)
 * @see HandlerBaseClassTests HandlerBaseClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HandlerBaseTests<SUT extends org.xml.sax.HandlerBase>
extends EntityResolverTests<SUT>, DTDHandlerTests<SUT>, DocumentHandlerTests<SUT>, ErrorHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#resolveEntity(String, String) public org.xml.sax.InputSource
     * org.xml.sax.HandlerBase.resolveEntity(java.lang.String,java.lang.String) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#resolveEntity(String, String) public org.xml.sax.InputSource
     * org.xml.sax.HandlerBase.resolveEntity(java.lang.String,java.lang.String) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#resolveEntity(String, String) public org.xml.sax.InputSource
     *      org.xml.sax.HandlerBase.resolveEntity(java.lang.String,java.lang.String) throws org.xml.sax.SAXException
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.HandlerBase#notationDecl(String, String, String) public void
     * org.xml.sax.HandlerBase.notationDecl(java.lang.String,java.lang.String,java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#notationDecl(String, String, String) public void
     * org.xml.sax.HandlerBase.notationDecl(java.lang.String,java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#notationDecl(String, String, String) public void
     *      org.xml.sax.HandlerBase.notationDecl(java.lang.String,java.lang.String,java.lang.String) (the hereby
     *      targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#startDocument() public void
     * org.xml.sax.HandlerBase.startDocument() throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#startDocument() public void
     * org.xml.sax.HandlerBase.startDocument() throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#startDocument() public void org.xml.sax.HandlerBase.startDocument() throws
     *      org.xml.sax.SAXException (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.HandlerBase#endDocument() public void org.xml.sax.HandlerBase.endDocument()
     * throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#endDocument() public void org.xml.sax.HandlerBase.endDocument()
     * throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#endDocument() public void org.xml.sax.HandlerBase.endDocument() throws
     *      org.xml.sax.SAXException (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.HandlerBase#error(org.xml.sax.SAXParseException) public void
     * org.xml.sax.HandlerBase.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#error(org.xml.sax.SAXParseException) public void
     * org.xml.sax.HandlerBase.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#error(org.xml.sax.SAXParseException) public void
     *      org.xml.sax.HandlerBase.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link org.xml.sax.HandlerBase#fatalError(org.xml.sax.SAXParseException) public void
     * org.xml.sax.HandlerBase.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#fatalError(org.xml.sax.SAXParseException) public void
     * org.xml.sax.HandlerBase.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#fatalError(org.xml.sax.SAXParseException) public void
     *      org.xml.sax.HandlerBase.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.HandlerBase#startElement(String, org.xml.sax.AttributeList) public void
     * org.xml.sax.HandlerBase.startElement(java.lang.String,org.xml.sax.AttributeList) throws org.xml.sax.SAXException}
     * .
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#startElement(String, org.xml.sax.AttributeList) public void
     * org.xml.sax.HandlerBase.startElement(java.lang.String,org.xml.sax.AttributeList) throws org.xml.sax.SAXException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#startElement(String, org.xml.sax.AttributeList) public void
     *      org.xml.sax.HandlerBase.startElement(java.lang.String,org.xml.sax.AttributeList) throws
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
     * Test method for {@link org.xml.sax.HandlerBase#setDocumentLocator(org.xml.sax.Locator) public void
     * org.xml.sax.HandlerBase.setDocumentLocator(org.xml.sax.Locator)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#setDocumentLocator(org.xml.sax.Locator) public void
     * org.xml.sax.HandlerBase.setDocumentLocator(org.xml.sax.Locator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#setDocumentLocator(org.xml.sax.Locator) public void
     *      org.xml.sax.HandlerBase.setDocumentLocator(org.xml.sax.Locator) (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.HandlerBase#warning(org.xml.sax.SAXParseException) public void
     * org.xml.sax.HandlerBase.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#warning(org.xml.sax.SAXParseException) public void
     * org.xml.sax.HandlerBase.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#warning(org.xml.sax.SAXParseException) public void
     *      org.xml.sax.HandlerBase.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link org.xml.sax.HandlerBase#unparsedEntityDecl(String, String, String, String) public void
     * org.xml.sax.HandlerBase.unparsedEntityDecl(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#unparsedEntityDecl(String, String, String, String) public void
     * org.xml.sax.HandlerBase.unparsedEntityDecl(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#unparsedEntityDecl(String, String, String, String) public void
     *      org.xml.sax.HandlerBase.unparsedEntityDecl(java.lang.String,java.lang.String,java.lang.String,java.lang.
     *      String) (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.HandlerBase#processingInstruction(String, String) public void
     * org.xml.sax.HandlerBase.processingInstruction(java.lang.String,java.lang.String) throws org.xml.sax.SAXException}
     * .
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#processingInstruction(String, String) public void
     * org.xml.sax.HandlerBase.processingInstruction(java.lang.String,java.lang.String) throws org.xml.sax.SAXException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#processingInstruction(String, String) public void
     *      org.xml.sax.HandlerBase.processingInstruction(java.lang.String,java.lang.String) throws
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
     * Test method for {@link org.xml.sax.HandlerBase#ignorableWhitespace(char[], int, int) public void
     * org.xml.sax.HandlerBase.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#ignorableWhitespace(char[], int, int) public void
     * org.xml.sax.HandlerBase.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#ignorableWhitespace(char[], int, int) public void
     *      org.xml.sax.HandlerBase.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link org.xml.sax.HandlerBase#endElement(String) public void
     * org.xml.sax.HandlerBase.endElement(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#endElement(String) public void
     * org.xml.sax.HandlerBase.endElement(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#endElement(String) public void org.xml.sax.HandlerBase.endElement(java.lang.String)
     *      throws org.xml.sax.SAXException (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.HandlerBase#characters(char[], int, int) public void
     * org.xml.sax.HandlerBase.characters(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.HandlerBase#characters(char[], int, int) public void
     * org.xml.sax.HandlerBase.characters(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.HandlerBase#characters(char[], int, int) public void
     *      org.xml.sax.HandlerBase.characters(char[],int,int) throws org.xml.sax.SAXException (the hereby targeted
     *      method-under-test)
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

}
