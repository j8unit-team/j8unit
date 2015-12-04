package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.datatransfer.Clipboard class java.awt.datatransfer.Clipboard}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.datatransfer.ClipboardClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClipboardTests<SUT extends java.awt.datatransfer.Clipboard>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#addFlavorListener(java.awt.datatransfer.FlavorListener)
     * public synchronized void java.awt.datatransfer.Clipboard.addFlavorListener(java.awt.datatransfer.FlavorListener)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addFlavorListener_FlavorListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getAvailableDataFlavors() public
     * java.awt.datatransfer.DataFlavor[] java.awt.datatransfer.Clipboard.getAvailableDataFlavors()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAvailableDataFlavors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getContents(java.lang.Object) public synchronized
     * java.awt.datatransfer.Transferable java.awt.datatransfer.Clipboard.getContents(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContents_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getData(java.awt.datatransfer.DataFlavor) public
     * java.lang.Object java.awt.datatransfer.Clipboard.getData(java.awt.datatransfer.DataFlavor) throws
     * java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getData_DataFlavor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getFlavorListeners() public synchronized
     * java.awt.datatransfer.FlavorListener[] java.awt.datatransfer.Clipboard.getFlavorListeners()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlavorListeners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getName() public java.lang.String
     * java.awt.datatransfer.Clipboard.getName()}.
     * </p>
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
     * Test method for {@link java.awt.datatransfer.Clipboard#isDataFlavorAvailable(java.awt.datatransfer.DataFlavor)
     * public boolean java.awt.datatransfer.Clipboard.isDataFlavorAvailable(java.awt.datatransfer.DataFlavor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDataFlavorAvailable_DataFlavor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#removeFlavorListener(java.awt.datatransfer.FlavorListener)
     * public synchronized void
     * java.awt.datatransfer.Clipboard.removeFlavorListener(java.awt.datatransfer.FlavorListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeFlavorListener_FlavorListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.Clipboard#setContents(java.awt.datatransfer.Transferable,java.awt.datatransfer.ClipboardOwner)
     * public synchronized void
     * java.awt.datatransfer.Clipboard.setContents(java.awt.datatransfer.Transferable,java.awt.datatransfer.ClipboardOwner)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setContents_Transferable_ClipboardOwner()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
