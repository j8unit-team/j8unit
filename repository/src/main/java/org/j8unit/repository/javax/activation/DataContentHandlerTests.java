package org.j8unit.repository.javax.activation;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.activation.DataContentHandler interface
 * javax.activation.DataContentHandler}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link DataContentHandlerClassTests}.
 * </p>
 *
 * @see javax.activation.DataContentHandler interface javax.activation.DataContentHandler (the hereby targeted
 *      class-under-test class)
 * @see DataContentHandlerClassTests DataContentHandlerClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataContentHandlerTests<SUT extends javax.activation.DataContentHandler>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.activation.DataContentHandler#getTransferDataFlavors() public abstract
     * java.awt.datatransfer.DataFlavor[] javax.activation.DataContentHandler.getTransferDataFlavors()}.
     *
     * <p>
     * Test method for {@link javax.activation.DataContentHandler#getTransferDataFlavors() public abstract
     * java.awt.datatransfer.DataFlavor[] javax.activation.DataContentHandler.getTransferDataFlavors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataContentHandler#getTransferDataFlavors() public abstract
     *      java.awt.datatransfer.DataFlavor[] javax.activation.DataContentHandler.getTransferDataFlavors() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransferDataFlavors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.activation.DataContentHandler#getTransferData(java.awt.datatransfer.DataFlavor, javax.activation.DataSource)
     * public abstract java.lang.Object
     * javax.activation.DataContentHandler.getTransferData(java.awt.datatransfer.DataFlavor,javax.activation.DataSource)
     * throws java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.activation.DataContentHandler#getTransferData(java.awt.datatransfer.DataFlavor, javax.activation.DataSource)
     * public abstract java.lang.Object
     * javax.activation.DataContentHandler.getTransferData(java.awt.datatransfer.DataFlavor,javax.activation.DataSource)
     * throws java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataContentHandler#getTransferData(java.awt.datatransfer.DataFlavor,
     *      javax.activation.DataSource) public abstract java.lang.Object
     *      javax.activation.DataContentHandler.getTransferData(java.awt.datatransfer.DataFlavor,javax.activation.
     *      DataSource) throws java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransferData_DataFlavor_DataSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataContentHandler#writeTo(Object, String, java.io.OutputStream) public
     * abstract void javax.activation.DataContentHandler.writeTo(java.lang.Object,java.lang.String,java.io.OutputStream)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.activation.DataContentHandler#writeTo(Object, String, java.io.OutputStream) public
     * abstract void javax.activation.DataContentHandler.writeTo(java.lang.Object,java.lang.String,java.io.OutputStream)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataContentHandler#writeTo(Object, String, java.io.OutputStream) public abstract void
     *      javax.activation.DataContentHandler.writeTo(java.lang.Object,java.lang.String,java.io.OutputStream) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeTo_Object_String_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataContentHandler#getContent(javax.activation.DataSource) public
     * abstract java.lang.Object javax.activation.DataContentHandler.getContent(javax.activation.DataSource) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.activation.DataContentHandler#getContent(javax.activation.DataSource) public
     * abstract java.lang.Object javax.activation.DataContentHandler.getContent(javax.activation.DataSource) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataContentHandler#getContent(javax.activation.DataSource) public abstract java.lang.Object
     *      javax.activation.DataContentHandler.getContent(javax.activation.DataSource) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContent_DataSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
