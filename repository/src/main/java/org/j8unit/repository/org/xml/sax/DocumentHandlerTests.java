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
 * non-{@code static} methods) of {@linkplain org.xml.sax.DocumentHandler interface org.xml.sax.DocumentHandler}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DocumentHandlerClassTests}.
 * </p>
 *
 * @see org.xml.sax.DocumentHandler interface org.xml.sax.DocumentHandler (the hereby targeted class-under-test class)
 * @see DocumentHandlerClassTests DocumentHandlerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DocumentHandlerTests<SUT extends org.xml.sax.DocumentHandler>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.DocumentHandler#setDocumentLocator(org.xml.sax.Locator) public abstract void
     * org.xml.sax.DocumentHandler.setDocumentLocator(org.xml.sax.Locator)}.
     *
     * <p>
     * Test method for {@link org.xml.sax.DocumentHandler#setDocumentLocator(org.xml.sax.Locator) public abstract void
     * org.xml.sax.DocumentHandler.setDocumentLocator(org.xml.sax.Locator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.DocumentHandler#setDocumentLocator(org.xml.sax.Locator) public abstract void
     *      org.xml.sax.DocumentHandler.setDocumentLocator(org.xml.sax.Locator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.DocumentHandler#startDocument() public abstract void
     * org.xml.sax.DocumentHandler.startDocument() throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.DocumentHandler#startDocument() public abstract void
     * org.xml.sax.DocumentHandler.startDocument() throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.DocumentHandler#startDocument() public abstract void org.xml.sax.DocumentHandler.startDocument()
     *      throws org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.DocumentHandler#endDocument() public abstract void
     * org.xml.sax.DocumentHandler.endDocument() throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.DocumentHandler#endDocument() public abstract void
     * org.xml.sax.DocumentHandler.endDocument() throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.DocumentHandler#endDocument() public abstract void org.xml.sax.DocumentHandler.endDocument()
     *      throws org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.DocumentHandler#ignorableWhitespace(char[], int, int) public abstract void
     * org.xml.sax.DocumentHandler.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.DocumentHandler#ignorableWhitespace(char[], int, int) public abstract void
     * org.xml.sax.DocumentHandler.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.DocumentHandler#ignorableWhitespace(char[], int, int) public abstract void
     *      org.xml.sax.DocumentHandler.ignorableWhitespace(char[],int,int) throws org.xml.sax.SAXException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.DocumentHandler#processingInstruction(String, String) public abstract void
     * org.xml.sax.DocumentHandler.processingInstruction(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.DocumentHandler#processingInstruction(String, String) public abstract void
     * org.xml.sax.DocumentHandler.processingInstruction(java.lang.String,java.lang.String) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.DocumentHandler#processingInstruction(String, String) public abstract void
     *      org.xml.sax.DocumentHandler.processingInstruction(java.lang.String,java.lang.String) throws
     *      org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.DocumentHandler#characters(char[], int, int) public abstract void
     * org.xml.sax.DocumentHandler.characters(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.DocumentHandler#characters(char[], int, int) public abstract void
     * org.xml.sax.DocumentHandler.characters(char[],int,int) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.DocumentHandler#characters(char[], int, int) public abstract void
     *      org.xml.sax.DocumentHandler.characters(char[],int,int) throws org.xml.sax.SAXException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.DocumentHandler#endElement(String) public abstract void
     * org.xml.sax.DocumentHandler.endElement(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.DocumentHandler#endElement(String) public abstract void
     * org.xml.sax.DocumentHandler.endElement(java.lang.String) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.DocumentHandler#endElement(String) public abstract void
     *      org.xml.sax.DocumentHandler.endElement(java.lang.String) throws org.xml.sax.SAXException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.xml.sax.DocumentHandler#startElement(String, org.xml.sax.AttributeList) public
     * abstract void org.xml.sax.DocumentHandler.startElement(java.lang.String,org.xml.sax.AttributeList) throws
     * org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.DocumentHandler#startElement(String, org.xml.sax.AttributeList) public
     * abstract void org.xml.sax.DocumentHandler.startElement(java.lang.String,org.xml.sax.AttributeList) throws
     * org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.DocumentHandler#startElement(String, org.xml.sax.AttributeList) public abstract void
     *      org.xml.sax.DocumentHandler.startElement(java.lang.String,org.xml.sax.AttributeList) throws
     *      org.xml.sax.SAXException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_startElement_String_AttributeList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
