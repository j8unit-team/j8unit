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
 * non-{@code static} methods) of {@linkplain org.xml.sax.XMLReader interface org.xml.sax.XMLReader}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link XMLReaderClassTests}.
 * </p>
 *
 * @see org.xml.sax.XMLReader interface org.xml.sax.XMLReader (the hereby targeted class-under-test class)
 * @see XMLReaderClassTests XMLReaderClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLReaderTests<SUT extends org.xml.sax.XMLReader>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#getErrorHandler() public abstract org.xml.sax.ErrorHandler
     * org.xml.sax.XMLReader.getErrorHandler()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#getErrorHandler() public abstract org.xml.sax.ErrorHandler
     * org.xml.sax.XMLReader.getErrorHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#getErrorHandler() public abstract org.xml.sax.ErrorHandler
     *      org.xml.sax.XMLReader.getErrorHandler() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.XMLReader#getDTDHandler() public abstract org.xml.sax.DTDHandler
     * org.xml.sax.XMLReader.getDTDHandler()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#getDTDHandler() public abstract org.xml.sax.DTDHandler
     * org.xml.sax.XMLReader.getDTDHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#getDTDHandler() public abstract org.xml.sax.DTDHandler
     *      org.xml.sax.XMLReader.getDTDHandler() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.XMLReader#setFeature(String, boolean) public abstract void
     * org.xml.sax.XMLReader.setFeature(java.lang.String,boolean) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#setFeature(String, boolean) public abstract void
     * org.xml.sax.XMLReader.setFeature(java.lang.String,boolean) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#setFeature(String, boolean) public abstract void
     *      org.xml.sax.XMLReader.setFeature(java.lang.String,boolean) throws
     *      org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.XMLReader#setContentHandler(org.xml.sax.ContentHandler) public abstract void
     * org.xml.sax.XMLReader.setContentHandler(org.xml.sax.ContentHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#setContentHandler(org.xml.sax.ContentHandler) public abstract void
     * org.xml.sax.XMLReader.setContentHandler(org.xml.sax.ContentHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#setContentHandler(org.xml.sax.ContentHandler) public abstract void
     *      org.xml.sax.XMLReader.setContentHandler(org.xml.sax.ContentHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.XMLReader#setProperty(String, Object) public abstract void
     * org.xml.sax.XMLReader.setProperty(java.lang.String,java.lang.Object) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#setProperty(String, Object) public abstract void
     * org.xml.sax.XMLReader.setProperty(java.lang.String,java.lang.Object) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#setProperty(String, Object) public abstract void
     *      org.xml.sax.XMLReader.setProperty(java.lang.String,java.lang.Object) throws
     *      org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.XMLReader#getContentHandler() public abstract org.xml.sax.ContentHandler
     * org.xml.sax.XMLReader.getContentHandler()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#getContentHandler() public abstract org.xml.sax.ContentHandler
     * org.xml.sax.XMLReader.getContentHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#getContentHandler() public abstract org.xml.sax.ContentHandler
     *      org.xml.sax.XMLReader.getContentHandler() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.XMLReader#setErrorHandler(org.xml.sax.ErrorHandler) public abstract void
     * org.xml.sax.XMLReader.setErrorHandler(org.xml.sax.ErrorHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#setErrorHandler(org.xml.sax.ErrorHandler) public abstract void
     * org.xml.sax.XMLReader.setErrorHandler(org.xml.sax.ErrorHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#setErrorHandler(org.xml.sax.ErrorHandler) public abstract void
     *      org.xml.sax.XMLReader.setErrorHandler(org.xml.sax.ErrorHandler) (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.XMLReader#getProperty(String) public abstract java.lang.Object
     * org.xml.sax.XMLReader.getProperty(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#getProperty(String) public abstract java.lang.Object
     * org.xml.sax.XMLReader.getProperty(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#getProperty(String) public abstract java.lang.Object
     *      org.xml.sax.XMLReader.getProperty(java.lang.String) throws
     *      org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.XMLReader#setEntityResolver(org.xml.sax.EntityResolver) public abstract void
     * org.xml.sax.XMLReader.setEntityResolver(org.xml.sax.EntityResolver)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#setEntityResolver(org.xml.sax.EntityResolver) public abstract void
     * org.xml.sax.XMLReader.setEntityResolver(org.xml.sax.EntityResolver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#setEntityResolver(org.xml.sax.EntityResolver) public abstract void
     *      org.xml.sax.XMLReader.setEntityResolver(org.xml.sax.EntityResolver) (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.XMLReader#setDTDHandler(org.xml.sax.DTDHandler) public abstract void
     * org.xml.sax.XMLReader.setDTDHandler(org.xml.sax.DTDHandler)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#setDTDHandler(org.xml.sax.DTDHandler) public abstract void
     * org.xml.sax.XMLReader.setDTDHandler(org.xml.sax.DTDHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#setDTDHandler(org.xml.sax.DTDHandler) public abstract void
     *      org.xml.sax.XMLReader.setDTDHandler(org.xml.sax.DTDHandler) (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.XMLReader#parse(String) public abstract void
     * org.xml.sax.XMLReader.parse(java.lang.String) throws java.io.IOException,org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#parse(String) public abstract void
     * org.xml.sax.XMLReader.parse(java.lang.String) throws java.io.IOException,org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#parse(String) public abstract void org.xml.sax.XMLReader.parse(java.lang.String)
     *      throws java.io.IOException,org.xml.sax.SAXException (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.XMLReader#parse(org.xml.sax.InputSource) public abstract void
     * org.xml.sax.XMLReader.parse(org.xml.sax.InputSource) throws java.io.IOException,org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#parse(org.xml.sax.InputSource) public abstract void
     * org.xml.sax.XMLReader.parse(org.xml.sax.InputSource) throws java.io.IOException,org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#parse(org.xml.sax.InputSource) public abstract void
     *      org.xml.sax.XMLReader.parse(org.xml.sax.InputSource) throws java.io.IOException,org.xml.sax.SAXException
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.XMLReader#getEntityResolver() public abstract org.xml.sax.EntityResolver
     * org.xml.sax.XMLReader.getEntityResolver()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#getEntityResolver() public abstract org.xml.sax.EntityResolver
     * org.xml.sax.XMLReader.getEntityResolver()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#getEntityResolver() public abstract org.xml.sax.EntityResolver
     *      org.xml.sax.XMLReader.getEntityResolver() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.XMLReader#getFeature(String) public abstract boolean
     * org.xml.sax.XMLReader.getFeature(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.XMLReader#getFeature(String) public abstract boolean
     * org.xml.sax.XMLReader.getFeature(java.lang.String) throws
     * org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.XMLReader#getFeature(String) public abstract boolean
     *      org.xml.sax.XMLReader.getFeature(java.lang.String) throws
     *      org.xml.sax.SAXNotRecognizedException,org.xml.sax.SAXNotSupportedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFeature_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
