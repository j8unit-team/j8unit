package org.j8unit.repository.javax.activation;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.activation.DataContentHandler interface javax.activation.DataContentHandler},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.activation.DataContentHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DataContentHandlerTests<SUT extends javax.activation.DataContentHandler>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.activation.DataContentHandler#getTransferDataFlavors() public abstract java.awt.datatransfer.DataFlavor[] javax.activation.DataContentHandler.getTransferDataFlavors()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransferDataFlavors() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataContentHandler#getTransferData(java.awt.datatransfer.DataFlavor,javax.activation.DataSource) public abstract java.lang.Object javax.activation.DataContentHandler.getTransferData(java.awt.datatransfer.DataFlavor,javax.activation.DataSource) throws java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransferData_DataFlavor_DataSource() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataContentHandler#writeTo(java.lang.Object,java.lang.String,java.io.OutputStream) public abstract void javax.activation.DataContentHandler.writeTo(java.lang.Object,java.lang.String,java.io.OutputStream) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeTo_Object_String_OutputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.activation.DataContentHandler#getContent(javax.activation.DataSource) public abstract java.lang.Object javax.activation.DataContentHandler.getContent(javax.activation.DataSource) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContent_DataSource() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
