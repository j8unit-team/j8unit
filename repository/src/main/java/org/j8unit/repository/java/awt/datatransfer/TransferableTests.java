package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.datatransfer.Transferable interface
 * java.awt.datatransfer.Transferable}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link TransferableClassTests}.
 * </p>
 *
 * @see java.awt.datatransfer.Transferable interface java.awt.datatransfer.Transferable (the hereby targeted
 *      class-under-test class)
 * @see TransferableClassTests TransferableClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
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
     * @see java.awt.datatransfer.Transferable#getTransferData(java.awt.datatransfer.DataFlavor) public abstract
     *      java.lang.Object java.awt.datatransfer.Transferable.getTransferData(java.awt.datatransfer.DataFlavor) throws
     *      java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException (the hereby targeted method-under-test)
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
     * <p>
     * Test method for {@link java.awt.datatransfer.Transferable#getTransferDataFlavors() public abstract
     * java.awt.datatransfer.DataFlavor[] java.awt.datatransfer.Transferable.getTransferDataFlavors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.Transferable#getTransferDataFlavors() public abstract
     *      java.awt.datatransfer.DataFlavor[] java.awt.datatransfer.Transferable.getTransferDataFlavors() (the hereby
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
     * Test method for {@link java.awt.datatransfer.Transferable#isDataFlavorSupported(java.awt.datatransfer.DataFlavor)
     * public abstract boolean
     * java.awt.datatransfer.Transferable.isDataFlavorSupported(java.awt.datatransfer.DataFlavor)}.
     *
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
     * @see java.awt.datatransfer.Transferable#isDataFlavorSupported(java.awt.datatransfer.DataFlavor) public abstract
     *      boolean java.awt.datatransfer.Transferable.isDataFlavorSupported(java.awt.datatransfer.DataFlavor) (the
     *      hereby targeted method-under-test)
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
