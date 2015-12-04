package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.datatransfer.StringSelection class java.awt.datatransfer.StringSelection},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.datatransfer.StringSelectionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface StringSelectionTests<SUT extends java.awt.datatransfer.StringSelection>
extends org.j8unit.repository.java.awt.datatransfer.TransferableTests<SUT>,
        org.j8unit.repository.java.awt.datatransfer.ClipboardOwnerTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.StringSelection#getTransferData(java.awt.datatransfer.DataFlavor) public java.lang.Object java.awt.datatransfer.StringSelection.getTransferData(java.awt.datatransfer.DataFlavor) throws java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getTransferData_DataFlavor() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.StringSelection#getTransferDataFlavors() public java.awt.datatransfer.DataFlavor[] java.awt.datatransfer.StringSelection.getTransferDataFlavors()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getTransferDataFlavors() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.StringSelection#isDataFlavorSupported(java.awt.datatransfer.DataFlavor) public boolean java.awt.datatransfer.StringSelection.isDataFlavorSupported(java.awt.datatransfer.DataFlavor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isDataFlavorSupported_DataFlavor() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.StringSelection#lostOwnership(java.awt.datatransfer.Clipboard,java.awt.datatransfer.Transferable) public void java.awt.datatransfer.StringSelection.lostOwnership(java.awt.datatransfer.Clipboard,java.awt.datatransfer.Transferable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_lostOwnership_Clipboard_Transferable() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
