package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.datatransfer.Transferable interface java.awt.datatransfer.Transferable}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.datatransfer.TransferableClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransferableTests<SUT extends java.awt.datatransfer.Transferable>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.Transferable#getTransferData(java.awt.datatransfer.DataFlavor)
     * public abstract java.lang.Object
     * java.awt.datatransfer.Transferable.getTransferData(java.awt.datatransfer.DataFlavor) throws
     * java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.awt.datatransfer.Transferable#getTransferDataFlavors() public abstract
     * java.awt.datatransfer.DataFlavor[] java.awt.datatransfer.Transferable.getTransferDataFlavors()}.
     * </p>
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
     * Test method for {@link java.awt.datatransfer.Transferable#isDataFlavorSupported(java.awt.datatransfer.DataFlavor)
     * public abstract boolean
     * java.awt.datatransfer.Transferable.isDataFlavorSupported(java.awt.datatransfer.DataFlavor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDataFlavorSupported_DataFlavor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
