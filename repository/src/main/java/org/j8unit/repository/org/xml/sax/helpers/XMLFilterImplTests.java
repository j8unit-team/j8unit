package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.helpers.XMLFilterImpl class org.xml.sax.helpers.XMLFilterImpl}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link XMLFilterImplClassTests}.
 * </p>
 *
 * @see org.xml.sax.helpers.XMLFilterImpl class org.xml.sax.helpers.XMLFilterImpl (the hereby targeted class-under-test
 *      class)
 * @see XMLFilterImplClassTests XMLFilterImplClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLFilterImplTests<SUT extends org.xml.sax.helpers.XMLFilterImpl>
extends org.j8unit.repository.org.xml.sax.XMLFilterTests<SUT>, org.j8unit.repository.org.xml.sax.EntityResolverTests<SUT>,
org.j8unit.repository.org.xml.sax.DTDHandlerTests<SUT>, org.j8unit.repository.org.xml.sax.ContentHandlerTests<SUT>,
org.j8unit.repository.org.xml.sax.ErrorHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#resolveEntity(String, String) public
     * org.xml.sax.InputSource org.xml.sax.helpers.XMLFilterImpl.resolveEntity(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#resolveEntity(String, String) public
     * org.xml.sax.InputSource org.xml.sax.helpers.XMLFilterImpl.resolveEntity(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#resolveEntity(String, String) public org.xml.sax.InputSource
     *      org.xml.sax.helpers.XMLFilterImpl.resolveEntity(java.lang.String,java.lang.String) throws
     *      org.xml.sax.SAXException,java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#parse(String) public void
     * org.xml.sax.helpers.XMLFilterImpl.parse(java.lang.String) throws org.xml.sax.SAXException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#parse(String) public void
     * org.xml.sax.helpers.XMLFilterImpl.parse(java.lang.String) throws org.xml.sax.SAXException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#parse(String) public void
     *      org.xml.sax.helpers.XMLFilterImpl.parse(java.lang.String) throws
     *      org.xml.sax.SAXException,java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#parse(org.xml.sax.InputSource) public void
     * org.xml.sax.helpers.XMLFilterImpl.parse(org.xml.sax.InputSource) throws
     * org.xml.sax.SAXException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#parse(org.xml.sax.InputSource) public void
     * org.xml.sax.helpers.XMLFilterImpl.parse(org.xml.sax.InputSource) throws
     * org.xml.sax.SAXException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#parse(org.xml.sax.InputSource) public void
     *      org.xml.sax.helpers.XMLFilterImpl.parse(org.xml.sax.InputSource) throws
     *      org.xml.sax.SAXException,java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getEntityResolver() public org.xml.sax.EntityResolver
     * org.xml.sax.helpers.XMLFilterImpl.getEntityResolver()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getEntityResolver() public org.xml.sax.EntityResolver
     * org.xml.sax.helpers.XMLFilterImpl.getEntityResolver()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#getEntityResolver() public org.xml.sax.EntityResolver
     *      org.xml.sax.helpers.XMLFilterImpl.getEntityResolver() (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#startDocument() public void
     * org.xml.sax.helpers.XMLFilterImpl.startDocument() throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#startDocument() public void
     * org.xml.sax.helpers.XMLFilterImpl.startDocument() throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#startDocument() public void
     *      org.xml.sax.helpers.XMLFilterImpl.startDocument() throws org.xml.sax.SAXException (the hereby targeted
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#endDocument() public void
     * org.xml.sax.helpers.XMLFilterImpl.endDocument() throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#endDocument() public void
     * org.xml.sax.helpers.XMLFilterImpl.endDocument() throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#endDocument() public void org.xml.sax.helpers.XMLFilterImpl.endDocument()
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getFeature(String) public boolean
     * org.xml.sax.helpers.XMLFilterImpl.getFeature(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getFeature(String) public boolean
     * org.xml.sax.helpers.XMLFilterImpl.getFeature(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#getFeature(String) public boolean
     *      org.xml.sax.helpers.XMLFilterImpl.getFeature(java.lang.String) throws
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

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getParent() public org.xml.sax.XMLReader
     * org.xml.sax.helpers.XMLFilterImpl.getParent()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getParent() public org.xml.sax.XMLReader
     * org.xml.sax.helpers.XMLFilterImpl.getParent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#getParent() public org.xml.sax.XMLReader
     *      org.xml.sax.helpers.XMLFilterImpl.getParent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getParent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getProperty(String) public java.lang.Object
     * org.xml.sax.helpers.XMLFilterImpl.getProperty(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getProperty(String) public java.lang.Object
     * org.xml.sax.helpers.XMLFilterImpl.getProperty(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#getProperty(String) public java.lang.Object
     *      org.xml.sax.helpers.XMLFilterImpl.getProperty(java.lang.String) throws
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
     * Test method for
     * {@link org.xml.sax.helpers.XMLFilterImpl#startElement(String, String, String, org.xml.sax.Attributes) public void
     * org.xml.sax.helpers.XMLFilterImpl.startElement(java.lang.String,java.lang.String,java.lang.String,org.xml.sax.Attributes)
     * throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for
     * {@link org.xml.sax.helpers.XMLFilterImpl#startElement(String, String, String, org.xml.sax.Attributes) public void
     * org.xml.sax.helpers.XMLFilterImpl.startElement(java.lang.String,java.lang.String,java.lang.String,org.xml.sax.Attributes)
     * throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#startElement(String, String, String, org.xml.sax.Attributes) public void
     *      org.xml.sax.helpers.XMLFilterImpl.startElement(java.lang.String,java.lang.String,java.lang.String,org.xml.
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#fatalError(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.XMLFilterImpl.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#fatalError(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.XMLFilterImpl.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#fatalError(org.xml.sax.SAXParseException) public void
     *      org.xml.sax.helpers.XMLFilterImpl.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#unparsedEntityDecl(String, String, String, String)
     * public void
     * org.xml.sax.helpers.XMLFilterImpl.unparsedEntityDecl(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
     * throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#unparsedEntityDecl(String, String, String, String)
     * public void
     * org.xml.sax.helpers.XMLFilterImpl.unparsedEntityDecl(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
     * throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#unparsedEntityDecl(String, String, String, String) public void
     *      org.xml.sax.helpers.XMLFilterImpl.unparsedEntityDecl(java.lang.String,java.lang.String,java.lang.String,java
     *      .lang.String) throws org.xml.sax.SAXException (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#processingInstruction(String, String) public void
     * org.xml.sax.helpers.XMLFilterImpl.processingInstruction(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#processingInstruction(String, String) public void
     * org.xml.sax.helpers.XMLFilterImpl.processingInstruction(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#processingInstruction(String, String) public void
     *      org.xml.sax.helpers.XMLFilterImpl.processingInstruction(java.lang.String,java.lang.String) throws
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getDTDHandler() public org.xml.sax.DTDHandler
     * org.xml.sax.helpers.XMLFilterImpl.getDTDHandler()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getDTDHandler() public org.xml.sax.DTDHandler
     * org.xml.sax.helpers.XMLFilterImpl.getDTDHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#getDTDHandler() public org.xml.sax.DTDHandler
     *      org.xml.sax.helpers.XMLFilterImpl.getDTDHandler() (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setProperty(String, Object) public void
     * org.xml.sax.helpers.XMLFilterImpl.setProperty(java.lang.String,java.lang.Object) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setProperty(String, Object) public void
     * org.xml.sax.helpers.XMLFilterImpl.setProperty(java.lang.String,java.lang.Object) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#setProperty(String, Object) public void
     *      org.xml.sax.helpers.XMLFilterImpl.setProperty(java.lang.String,java.lang.Object) throws
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setErrorHandler(org.xml.sax.ErrorHandler) public void
     * org.xml.sax.helpers.XMLFilterImpl.setErrorHandler(org.xml.sax.ErrorHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setErrorHandler(org.xml.sax.ErrorHandler) public void
     * org.xml.sax.helpers.XMLFilterImpl.setErrorHandler(org.xml.sax.ErrorHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#setErrorHandler(org.xml.sax.ErrorHandler) public void
     *      org.xml.sax.helpers.XMLFilterImpl.setErrorHandler(org.xml.sax.ErrorHandler) (the hereby targeted
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#skippedEntity(String) public void
     * org.xml.sax.helpers.XMLFilterImpl.skippedEntity(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#skippedEntity(String) public void
     * org.xml.sax.helpers.XMLFilterImpl.skippedEntity(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#skippedEntity(String) public void
     *      org.xml.sax.helpers.XMLFilterImpl.skippedEntity(java.lang.String) throws org.xml.sax.SAXException (the
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#error(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.XMLFilterImpl.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#error(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.XMLFilterImpl.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#error(org.xml.sax.SAXParseException) public void
     *      org.xml.sax.helpers.XMLFilterImpl.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException (the
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#notationDecl(String, String, String) public void
     * org.xml.sax.helpers.XMLFilterImpl.notationDecl(java.lang.String,java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#notationDecl(String, String, String) public void
     * org.xml.sax.helpers.XMLFilterImpl.notationDecl(java.lang.String,java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#notationDecl(String, String, String) public void
     *      org.xml.sax.helpers.XMLFilterImpl.notationDecl(java.lang.String,java.lang.String,java.lang.String) throws
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

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setEntityResolver(org.xml.sax.EntityResolver) public
     * void org.xml.sax.helpers.XMLFilterImpl.setEntityResolver(org.xml.sax.EntityResolver)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setEntityResolver(org.xml.sax.EntityResolver) public
     * void org.xml.sax.helpers.XMLFilterImpl.setEntityResolver(org.xml.sax.EntityResolver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#setEntityResolver(org.xml.sax.EntityResolver) public void
     *      org.xml.sax.helpers.XMLFilterImpl.setEntityResolver(org.xml.sax.EntityResolver) (the hereby targeted
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#endPrefixMapping(String) public void
     * org.xml.sax.helpers.XMLFilterImpl.endPrefixMapping(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#endPrefixMapping(String) public void
     * org.xml.sax.helpers.XMLFilterImpl.endPrefixMapping(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#endPrefixMapping(String) public void
     *      org.xml.sax.helpers.XMLFilterImpl.endPrefixMapping(java.lang.String) throws org.xml.sax.SAXException (the
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setDTDHandler(org.xml.sax.DTDHandler) public void
     * org.xml.sax.helpers.XMLFilterImpl.setDTDHandler(org.xml.sax.DTDHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setDTDHandler(org.xml.sax.DTDHandler) public void
     * org.xml.sax.helpers.XMLFilterImpl.setDTDHandler(org.xml.sax.DTDHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#setDTDHandler(org.xml.sax.DTDHandler) public void
     *      org.xml.sax.helpers.XMLFilterImpl.setDTDHandler(org.xml.sax.DTDHandler) (the hereby targeted
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#warning(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.XMLFilterImpl.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#warning(org.xml.sax.SAXParseException) public void
     * org.xml.sax.helpers.XMLFilterImpl.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#warning(org.xml.sax.SAXParseException) public void
     *      org.xml.sax.helpers.XMLFilterImpl.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setParent(org.xml.sax.XMLReader) public void
     * org.xml.sax.helpers.XMLFilterImpl.setParent(org.xml.sax.XMLReader)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setParent(org.xml.sax.XMLReader) public void
     * org.xml.sax.helpers.XMLFilterImpl.setParent(org.xml.sax.XMLReader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#setParent(org.xml.sax.XMLReader) public void
     *      org.xml.sax.helpers.XMLFilterImpl.setParent(org.xml.sax.XMLReader) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setParent_XMLReader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setDocumentLocator(org.xml.sax.Locator) public void
     * org.xml.sax.helpers.XMLFilterImpl.setDocumentLocator(org.xml.sax.Locator)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setDocumentLocator(org.xml.sax.Locator) public void
     * org.xml.sax.helpers.XMLFilterImpl.setDocumentLocator(org.xml.sax.Locator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#setDocumentLocator(org.xml.sax.Locator) public void
     *      org.xml.sax.helpers.XMLFilterImpl.setDocumentLocator(org.xml.sax.Locator) (the hereby targeted
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#ignorableWhitespace(char[], int, int) public void
     * org.xml.sax.helpers.XMLFilterImpl.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#ignorableWhitespace(char[], int, int) public void
     * org.xml.sax.helpers.XMLFilterImpl.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#ignorableWhitespace(char[], int, int) public void
     *      org.xml.sax.helpers.XMLFilterImpl.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException (the
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#characters(char[], int, int) public void
     * org.xml.sax.helpers.XMLFilterImpl.characters(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#characters(char[], int, int) public void
     * org.xml.sax.helpers.XMLFilterImpl.characters(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#characters(char[], int, int) public void
     *      org.xml.sax.helpers.XMLFilterImpl.characters(char[],int,int) throws org.xml.sax.SAXException (the hereby
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getErrorHandler() public org.xml.sax.ErrorHandler
     * org.xml.sax.helpers.XMLFilterImpl.getErrorHandler()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getErrorHandler() public org.xml.sax.ErrorHandler
     * org.xml.sax.helpers.XMLFilterImpl.getErrorHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#getErrorHandler() public org.xml.sax.ErrorHandler
     *      org.xml.sax.helpers.XMLFilterImpl.getErrorHandler() (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#endElement(String, String, String) public void
     * org.xml.sax.helpers.XMLFilterImpl.endElement(java.lang.String,java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#endElement(String, String, String) public void
     * org.xml.sax.helpers.XMLFilterImpl.endElement(java.lang.String,java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#endElement(String, String, String) public void
     *      org.xml.sax.helpers.XMLFilterImpl.endElement(java.lang.String,java.lang.String,java.lang.String) throws
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#startPrefixMapping(String, String) public void
     * org.xml.sax.helpers.XMLFilterImpl.startPrefixMapping(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#startPrefixMapping(String, String) public void
     * org.xml.sax.helpers.XMLFilterImpl.startPrefixMapping(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#startPrefixMapping(String, String) public void
     *      org.xml.sax.helpers.XMLFilterImpl.startPrefixMapping(java.lang.String,java.lang.String) throws
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setFeature(String, boolean) public void
     * org.xml.sax.helpers.XMLFilterImpl.setFeature(java.lang.String,boolean) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setFeature(String, boolean) public void
     * org.xml.sax.helpers.XMLFilterImpl.setFeature(java.lang.String,boolean) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#setFeature(String, boolean) public void
     *      org.xml.sax.helpers.XMLFilterImpl.setFeature(java.lang.String,boolean) throws
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setContentHandler(org.xml.sax.ContentHandler) public
     * void org.xml.sax.helpers.XMLFilterImpl.setContentHandler(org.xml.sax.ContentHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#setContentHandler(org.xml.sax.ContentHandler) public
     * void org.xml.sax.helpers.XMLFilterImpl.setContentHandler(org.xml.sax.ContentHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#setContentHandler(org.xml.sax.ContentHandler) public void
     *      org.xml.sax.helpers.XMLFilterImpl.setContentHandler(org.xml.sax.ContentHandler) (the hereby targeted
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
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getContentHandler() public org.xml.sax.ContentHandler
     * org.xml.sax.helpers.XMLFilterImpl.getContentHandler()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.helpers.XMLFilterImpl#getContentHandler() public org.xml.sax.ContentHandler
     * org.xml.sax.helpers.XMLFilterImpl.getContentHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.helpers.XMLFilterImpl#getContentHandler() public org.xml.sax.ContentHandler
     *      org.xml.sax.helpers.XMLFilterImpl.getContentHandler() (the hereby targeted method-under-test)
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

}
