package org.j8unit.repository.javax.xml.bind.attachment;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.bind.attachment.AttachmentMarshaller class
 * javax.xml.bind.attachment.AttachmentMarshaller}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.xml.bind.attachment.AttachmentMarshallerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.bind.attachment.AttachmentMarshallerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.bind.attachment.AttachmentMarshaller
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttachmentMarshallerTests<SUT extends javax.xml.bind.attachment.AttachmentMarshaller>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.xml.bind.attachment.AttachmentMarshaller#addMtomAttachment(byte[], int, int, java.lang.String, java.lang.String, java.lang.String)
     * public abstract java.lang.String
     * javax.xml.bind.attachment.AttachmentMarshaller.addMtomAttachment(byte[],int,int,java.lang.String,java.lang.String,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.bind.attachment.AttachmentMarshaller#addMtomAttachment(byte[], int, int, java.lang.String,
     *             java.lang.String, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addMtomAttachment_byteArray_int_int_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.bind.attachment.AttachmentMarshaller#addMtomAttachment(javax.activation.DataHandler, java.lang.String, java.lang.String)
     * public abstract java.lang.String
     * javax.xml.bind.attachment.AttachmentMarshaller.addMtomAttachment(javax.activation.DataHandler,java.lang.String,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.bind.attachment.AttachmentMarshaller#addMtomAttachment(javax.activation.DataHandler,
     *             java.lang.String, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addMtomAttachment_DataHandler_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.bind.attachment.AttachmentMarshaller#addSwaRefAttachment(javax.activation.DataHandler) public
     * abstract java.lang.String
     * javax.xml.bind.attachment.AttachmentMarshaller.addSwaRefAttachment(javax.activation.DataHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.bind.attachment.AttachmentMarshaller#addSwaRefAttachment(javax.activation.DataHandler)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addSwaRefAttachment_DataHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.attachment.AttachmentMarshaller#isXOPPackage() public boolean
     * javax.xml.bind.attachment.AttachmentMarshaller.isXOPPackage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.bind.attachment.AttachmentMarshaller#isXOPPackage()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isXOPPackage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
