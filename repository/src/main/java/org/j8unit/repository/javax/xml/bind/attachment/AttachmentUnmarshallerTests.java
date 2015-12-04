package org.j8unit.repository.javax.xml.bind.attachment;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.bind.attachment.AttachmentUnmarshaller class
 * javax.xml.bind.attachment.AttachmentUnmarshaller}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.attachment.AttachmentUnmarshallerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttachmentUnmarshallerTests<SUT extends javax.xml.bind.attachment.AttachmentUnmarshaller>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.xml.bind.attachment.AttachmentUnmarshaller#getAttachmentAsByteArray(java.lang.String) public
     * abstract byte[] javax.xml.bind.attachment.AttachmentUnmarshaller.getAttachmentAsByteArray(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttachmentAsByteArray_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.bind.attachment.AttachmentUnmarshaller#getAttachmentAsDataHandler(java.lang.String) public
     * abstract javax.activation.DataHandler
     * javax.xml.bind.attachment.AttachmentUnmarshaller.getAttachmentAsDataHandler(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttachmentAsDataHandler_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.attachment.AttachmentUnmarshaller#isXOPPackage() public boolean
     * javax.xml.bind.attachment.AttachmentUnmarshaller.isXOPPackage()}.
     * </p>
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
