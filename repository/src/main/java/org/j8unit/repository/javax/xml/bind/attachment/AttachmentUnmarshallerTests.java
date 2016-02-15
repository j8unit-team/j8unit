package org.j8unit.repository.javax.xml.bind.attachment;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.attachment.AttachmentUnmarshaller class
 * javax.xml.bind.attachment.AttachmentUnmarshaller}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AttachmentUnmarshallerClassTests}.
 * </p>
 *
 * @see javax.xml.bind.attachment.AttachmentUnmarshaller class javax.xml.bind.attachment.AttachmentUnmarshaller (the
 *      hereby targeted class-under-test class)
 * @see AttachmentUnmarshallerClassTests AttachmentUnmarshallerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttachmentUnmarshallerTests<SUT extends javax.xml.bind.attachment.AttachmentUnmarshaller>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.attachment.AttachmentUnmarshaller#getAttachmentAsByteArray(String) public
     * abstract byte[] javax.xml.bind.attachment.AttachmentUnmarshaller.getAttachmentAsByteArray(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.attachment.AttachmentUnmarshaller#getAttachmentAsByteArray(String) public
     * abstract byte[] javax.xml.bind.attachment.AttachmentUnmarshaller.getAttachmentAsByteArray(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.attachment.AttachmentUnmarshaller#getAttachmentAsByteArray(String) public abstract byte[]
     *      javax.xml.bind.attachment.AttachmentUnmarshaller.getAttachmentAsByteArray(java.lang.String) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.xml.bind.attachment.AttachmentUnmarshaller#getAttachmentAsDataHandler(String) public
     * abstract javax.activation.DataHandler
     * javax.xml.bind.attachment.AttachmentUnmarshaller.getAttachmentAsDataHandler(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.attachment.AttachmentUnmarshaller#getAttachmentAsDataHandler(String) public
     * abstract javax.activation.DataHandler
     * javax.xml.bind.attachment.AttachmentUnmarshaller.getAttachmentAsDataHandler(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.attachment.AttachmentUnmarshaller#getAttachmentAsDataHandler(String) public abstract
     *      javax.activation.DataHandler
     *      javax.xml.bind.attachment.AttachmentUnmarshaller.getAttachmentAsDataHandler(java.lang.String) (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.xml.bind.attachment.AttachmentUnmarshaller#isXOPPackage() public boolean
     * javax.xml.bind.attachment.AttachmentUnmarshaller.isXOPPackage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.attachment.AttachmentUnmarshaller#isXOPPackage() public boolean
     *      javax.xml.bind.attachment.AttachmentUnmarshaller.isXOPPackage() (the hereby targeted method-under-test)
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
