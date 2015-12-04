package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.soap.SOAPEnvelope interface javax.xml.soap.SOAPEnvelope}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.soap.SOAPEnvelopeClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SOAPEnvelopeTests<SUT extends javax.xml.soap.SOAPEnvelope>
extends org.j8unit.repository.javax.xml.soap.SOAPElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPEnvelope#createName(java.lang.String,java.lang.String,java.lang.String)
     * public abstract javax.xml.soap.Name
     * javax.xml.soap.SOAPEnvelope.createName(java.lang.String,java.lang.String,java.lang.String) throws
     * javax.xml.soap.SOAPException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createName_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPEnvelope#createName(java.lang.String) public abstract
     * javax.xml.soap.Name javax.xml.soap.SOAPEnvelope.createName(java.lang.String) throws javax.xml.soap.SOAPException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPEnvelope#getHeader() public abstract javax.xml.soap.SOAPHeader
     * javax.xml.soap.SOAPEnvelope.getHeader() throws javax.xml.soap.SOAPException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHeader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPEnvelope#getBody() public abstract javax.xml.soap.SOAPBody
     * javax.xml.soap.SOAPEnvelope.getBody() throws javax.xml.soap.SOAPException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBody()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPEnvelope#addBody() public abstract javax.xml.soap.SOAPBody
     * javax.xml.soap.SOAPEnvelope.addBody() throws javax.xml.soap.SOAPException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addBody()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPEnvelope#addHeader() public abstract javax.xml.soap.SOAPHeader
     * javax.xml.soap.SOAPEnvelope.addHeader() throws javax.xml.soap.SOAPException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addHeader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
