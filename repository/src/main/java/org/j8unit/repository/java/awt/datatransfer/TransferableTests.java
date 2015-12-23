package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.datatransfer.Transferable interface
 * java.awt.datatransfer.Transferable}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.datatransfer.TransferableTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.datatransfer.TransferableClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.datatransfer.Transferable
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransferableTests<SUT extends java.awt.datatransfer.Transferable>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.Transferable#getTransferData(java.awt.datatransfer.DataFlavor)
     * public abstract java.lang.Object
     * java.awt.datatransfer.Transferable.getTransferData(java.awt.datatransfer.DataFlavor) throws
     * java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.datatransfer.Transferable#getTransferData(java.awt.datatransfer.DataFlavor)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.datatransfer.Transferable#getTransferDataFlavors()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.datatransfer.Transferable#isDataFlavorSupported(java.awt.datatransfer.DataFlavor)
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
