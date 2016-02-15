package org.j8unit.repository.javax.activation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.activation.DataHandler class javax.activation.DataHandler}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DataHandlerClassTests}.
 * </p>
 *
 * @see javax.activation.DataHandler class javax.activation.DataHandler (the hereby targeted class-under-test class)
 * @see DataHandlerClassTests DataHandlerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataHandlerTests<SUT extends javax.activation.DataHandler>
extends org.j8unit.repository.java.awt.datatransfer.TransferableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#getInputStream() public java.io.InputStream
     * javax.activation.DataHandler.getInputStream() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getInputStream() public java.io.InputStream
     * javax.activation.DataHandler.getInputStream() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getInputStream() public java.io.InputStream
     *      javax.activation.DataHandler.getInputStream() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#getTransferData(java.awt.datatransfer.DataFlavor) public
     * java.lang.Object javax.activation.DataHandler.getTransferData(java.awt.datatransfer.DataFlavor) throws
     * java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getTransferData(java.awt.datatransfer.DataFlavor) public
     * java.lang.Object javax.activation.DataHandler.getTransferData(java.awt.datatransfer.DataFlavor) throws
     * java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getTransferData(java.awt.datatransfer.DataFlavor) public java.lang.Object
     *      javax.activation.DataHandler.getTransferData(java.awt.datatransfer.DataFlavor) throws
     *      java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTransferData_DataFlavor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#getContent() public java.lang.Object
     * javax.activation.DataHandler.getContent() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getContent() public java.lang.Object
     * javax.activation.DataHandler.getContent() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getContent() public java.lang.Object javax.activation.DataHandler.getContent()
     *      throws java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link javax.activation.DataHandler#getCommand(String) public javax.activation.CommandInfo
     * javax.activation.DataHandler.getCommand(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getCommand(String) public javax.activation.CommandInfo
     * javax.activation.DataHandler.getCommand(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getCommand(String) public javax.activation.CommandInfo
     *      javax.activation.DataHandler.getCommand(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCommand_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#getPreferredCommands() public javax.activation.CommandInfo[]
     * javax.activation.DataHandler.getPreferredCommands()}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getPreferredCommands() public javax.activation.CommandInfo[]
     * javax.activation.DataHandler.getPreferredCommands()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getPreferredCommands() public javax.activation.CommandInfo[]
     *      javax.activation.DataHandler.getPreferredCommands() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPreferredCommands()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#getName() public java.lang.String
     * javax.activation.DataHandler.getName()}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getName() public java.lang.String
     * javax.activation.DataHandler.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getName() public java.lang.String javax.activation.DataHandler.getName() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#getDataSource() public javax.activation.DataSource
     * javax.activation.DataHandler.getDataSource()}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getDataSource() public javax.activation.DataSource
     * javax.activation.DataHandler.getDataSource()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getDataSource() public javax.activation.DataSource
     *      javax.activation.DataHandler.getDataSource() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDataSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#getTransferDataFlavors() public synchronized
     * java.awt.datatransfer.DataFlavor[] javax.activation.DataHandler.getTransferDataFlavors()}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getTransferDataFlavors() public synchronized
     * java.awt.datatransfer.DataFlavor[] javax.activation.DataHandler.getTransferDataFlavors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getTransferDataFlavors() public synchronized java.awt.datatransfer.DataFlavor[]
     *      javax.activation.DataHandler.getTransferDataFlavors() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.activation.DataHandler#getContentType() public java.lang.String
     * javax.activation.DataHandler.getContentType()}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getContentType() public java.lang.String
     * javax.activation.DataHandler.getContentType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getContentType() public java.lang.String
     *      javax.activation.DataHandler.getContentType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContentType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#getAllCommands() public javax.activation.CommandInfo[]
     * javax.activation.DataHandler.getAllCommands()}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getAllCommands() public javax.activation.CommandInfo[]
     * javax.activation.DataHandler.getAllCommands()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getAllCommands() public javax.activation.CommandInfo[]
     *      javax.activation.DataHandler.getAllCommands() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAllCommands()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#getBean(javax.activation.CommandInfo) public java.lang.Object
     * javax.activation.DataHandler.getBean(javax.activation.CommandInfo)}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getBean(javax.activation.CommandInfo) public java.lang.Object
     * javax.activation.DataHandler.getBean(javax.activation.CommandInfo)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getBean(javax.activation.CommandInfo) public java.lang.Object
     *      javax.activation.DataHandler.getBean(javax.activation.CommandInfo) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBean_CommandInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#getOutputStream() public java.io.OutputStream
     * javax.activation.DataHandler.getOutputStream() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#getOutputStream() public java.io.OutputStream
     * javax.activation.DataHandler.getOutputStream() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#getOutputStream() public java.io.OutputStream
     *      javax.activation.DataHandler.getOutputStream() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#writeTo(java.io.OutputStream) public void
     * javax.activation.DataHandler.writeTo(java.io.OutputStream) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#writeTo(java.io.OutputStream) public void
     * javax.activation.DataHandler.writeTo(java.io.OutputStream) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#writeTo(java.io.OutputStream) public void
     *      javax.activation.DataHandler.writeTo(java.io.OutputStream) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeTo_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#setCommandMap(javax.activation.CommandMap) public
     * synchronized void javax.activation.DataHandler.setCommandMap(javax.activation.CommandMap)}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#setCommandMap(javax.activation.CommandMap) public
     * synchronized void javax.activation.DataHandler.setCommandMap(javax.activation.CommandMap)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#setCommandMap(javax.activation.CommandMap) public synchronized void
     *      javax.activation.DataHandler.setCommandMap(javax.activation.CommandMap) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCommandMap_CommandMap()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataHandler#isDataFlavorSupported(java.awt.datatransfer.DataFlavor)
     * public boolean javax.activation.DataHandler.isDataFlavorSupported(java.awt.datatransfer.DataFlavor)}.
     *
     * <p>
     * Test method for {@link javax.activation.DataHandler#isDataFlavorSupported(java.awt.datatransfer.DataFlavor)
     * public boolean javax.activation.DataHandler.isDataFlavorSupported(java.awt.datatransfer.DataFlavor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.activation.DataHandler#isDataFlavorSupported(java.awt.datatransfer.DataFlavor) public boolean
     *      javax.activation.DataHandler.isDataFlavorSupported(java.awt.datatransfer.DataFlavor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isDataFlavorSupported_DataFlavor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
