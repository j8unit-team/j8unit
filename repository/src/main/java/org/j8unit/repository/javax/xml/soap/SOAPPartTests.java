package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.soap.SOAPPart class javax.xml.soap.SOAPPart}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link SOAPPartClassTests}.
 * </p>
 *
 * @see javax.xml.soap.SOAPPart class javax.xml.soap.SOAPPart (the hereby targeted class-under-test class)
 * @see SOAPPartClassTests SOAPPartClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPPartTests<SUT extends javax.xml.soap.SOAPPart>
extends org.j8unit.repository.org.w3c.dom.DocumentTests<SUT>, NodeTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getNonMatchingMimeHeaders(String[]) public abstract
     * java.util.Iterator javax.xml.soap.SOAPPart.getNonMatchingMimeHeaders(java.lang.String[])}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getNonMatchingMimeHeaders(String[]) public abstract
     * java.util.Iterator javax.xml.soap.SOAPPart.getNonMatchingMimeHeaders(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#getNonMatchingMimeHeaders(String[]) public abstract java.util.Iterator
     *      javax.xml.soap.SOAPPart.getNonMatchingMimeHeaders(java.lang.String[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNonMatchingMimeHeaders_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#removeAllMimeHeaders() public abstract void
     * javax.xml.soap.SOAPPart.removeAllMimeHeaders()}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#removeAllMimeHeaders() public abstract void
     * javax.xml.soap.SOAPPart.removeAllMimeHeaders()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#removeAllMimeHeaders() public abstract void
     *      javax.xml.soap.SOAPPart.removeAllMimeHeaders() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeAllMimeHeaders()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#setContentLocation(String) public void
     * javax.xml.soap.SOAPPart.setContentLocation(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#setContentLocation(String) public void
     * javax.xml.soap.SOAPPart.setContentLocation(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#setContentLocation(String) public void
     *      javax.xml.soap.SOAPPart.setContentLocation(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setContentLocation_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getMimeHeader(String) public abstract java.lang.String[]
     * javax.xml.soap.SOAPPart.getMimeHeader(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getMimeHeader(String) public abstract java.lang.String[]
     * javax.xml.soap.SOAPPart.getMimeHeader(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#getMimeHeader(String) public abstract java.lang.String[]
     *      javax.xml.soap.SOAPPart.getMimeHeader(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMimeHeader_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getContentId() public java.lang.String
     * javax.xml.soap.SOAPPart.getContentId()}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getContentId() public java.lang.String
     * javax.xml.soap.SOAPPart.getContentId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#getContentId() public java.lang.String javax.xml.soap.SOAPPart.getContentId() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContentId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#addMimeHeader(String, String) public abstract void
     * javax.xml.soap.SOAPPart.addMimeHeader(java.lang.String,java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#addMimeHeader(String, String) public abstract void
     * javax.xml.soap.SOAPPart.addMimeHeader(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#addMimeHeader(String, String) public abstract void
     *      javax.xml.soap.SOAPPart.addMimeHeader(java.lang.String,java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addMimeHeader_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getAllMimeHeaders() public abstract java.util.Iterator
     * javax.xml.soap.SOAPPart.getAllMimeHeaders()}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getAllMimeHeaders() public abstract java.util.Iterator
     * javax.xml.soap.SOAPPart.getAllMimeHeaders()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#getAllMimeHeaders() public abstract java.util.Iterator
     *      javax.xml.soap.SOAPPart.getAllMimeHeaders() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAllMimeHeaders()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getEnvelope() public abstract javax.xml.soap.SOAPEnvelope
     * javax.xml.soap.SOAPPart.getEnvelope() throws javax.xml.soap.SOAPException}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getEnvelope() public abstract javax.xml.soap.SOAPEnvelope
     * javax.xml.soap.SOAPPart.getEnvelope() throws javax.xml.soap.SOAPException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#getEnvelope() public abstract javax.xml.soap.SOAPEnvelope
     *      javax.xml.soap.SOAPPart.getEnvelope() throws javax.xml.soap.SOAPException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnvelope()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getMatchingMimeHeaders(String[]) public abstract
     * java.util.Iterator javax.xml.soap.SOAPPart.getMatchingMimeHeaders(java.lang.String[])}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getMatchingMimeHeaders(String[]) public abstract
     * java.util.Iterator javax.xml.soap.SOAPPart.getMatchingMimeHeaders(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#getMatchingMimeHeaders(String[]) public abstract java.util.Iterator
     *      javax.xml.soap.SOAPPart.getMatchingMimeHeaders(java.lang.String[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMatchingMimeHeaders_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getContentLocation() public java.lang.String
     * javax.xml.soap.SOAPPart.getContentLocation()}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getContentLocation() public java.lang.String
     * javax.xml.soap.SOAPPart.getContentLocation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#getContentLocation() public java.lang.String
     *      javax.xml.soap.SOAPPart.getContentLocation() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContentLocation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#removeMimeHeader(String) public abstract void
     * javax.xml.soap.SOAPPart.removeMimeHeader(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#removeMimeHeader(String) public abstract void
     * javax.xml.soap.SOAPPart.removeMimeHeader(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#removeMimeHeader(String) public abstract void
     *      javax.xml.soap.SOAPPart.removeMimeHeader(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeMimeHeader_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#setContent(javax.xml.transform.Source) public abstract void
     * javax.xml.soap.SOAPPart.setContent(javax.xml.transform.Source) throws javax.xml.soap.SOAPException}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#setContent(javax.xml.transform.Source) public abstract void
     * javax.xml.soap.SOAPPart.setContent(javax.xml.transform.Source) throws javax.xml.soap.SOAPException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#setContent(javax.xml.transform.Source) public abstract void
     *      javax.xml.soap.SOAPPart.setContent(javax.xml.transform.Source) throws javax.xml.soap.SOAPException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setContent_Source()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getContent() public abstract javax.xml.transform.Source
     * javax.xml.soap.SOAPPart.getContent() throws javax.xml.soap.SOAPException}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#getContent() public abstract javax.xml.transform.Source
     * javax.xml.soap.SOAPPart.getContent() throws javax.xml.soap.SOAPException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#getContent() public abstract javax.xml.transform.Source
     *      javax.xml.soap.SOAPPart.getContent() throws javax.xml.soap.SOAPException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#setMimeHeader(String, String) public abstract void
     * javax.xml.soap.SOAPPart.setMimeHeader(java.lang.String,java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#setMimeHeader(String, String) public abstract void
     * javax.xml.soap.SOAPPart.setMimeHeader(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#setMimeHeader(String, String) public abstract void
     *      javax.xml.soap.SOAPPart.setMimeHeader(java.lang.String,java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMimeHeader_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#setContentId(String) public void
     * javax.xml.soap.SOAPPart.setContentId(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPPart#setContentId(String) public void
     * javax.xml.soap.SOAPPart.setContentId(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPPart#setContentId(String) public void
     *      javax.xml.soap.SOAPPart.setContentId(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setContentId_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
