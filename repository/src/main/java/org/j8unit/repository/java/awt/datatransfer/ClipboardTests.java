package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.datatransfer.Clipboard class java.awt.datatransfer.Clipboard}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ClipboardClassTests}.
 * </p>
 *
 * @see java.awt.datatransfer.Clipboard class java.awt.datatransfer.Clipboard (the hereby targeted class-under-test
 *      class)
 * @see ClipboardClassTests ClipboardClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClipboardTests<SUT extends java.awt.datatransfer.Clipboard>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getName() public java.lang.String
     * java.awt.datatransfer.Clipboard.getName()}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getName() public java.lang.String
     * java.awt.datatransfer.Clipboard.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.Clipboard#getName() public java.lang.String java.awt.datatransfer.Clipboard.getName()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.awt.datatransfer.Clipboard#addFlavorListener(java.awt.datatransfer.FlavorListener)
     * public synchronized void java.awt.datatransfer.Clipboard.addFlavorListener(java.awt.datatransfer.FlavorListener)}
     * .
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#addFlavorListener(java.awt.datatransfer.FlavorListener)
     * public synchronized void java.awt.datatransfer.Clipboard.addFlavorListener(java.awt.datatransfer.FlavorListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.Clipboard#addFlavorListener(java.awt.datatransfer.FlavorListener) public synchronized
     *      void java.awt.datatransfer.Clipboard.addFlavorListener(java.awt.datatransfer.FlavorListener) (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getAvailableDataFlavors() public
     * java.awt.datatransfer.DataFlavor[] java.awt.datatransfer.Clipboard.getAvailableDataFlavors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.Clipboard#getAvailableDataFlavors() public java.awt.datatransfer.DataFlavor[]
     *      java.awt.datatransfer.Clipboard.getAvailableDataFlavors() (the hereby targeted method-under-test)
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
     * Test method for {@link java.awt.datatransfer.Clipboard#isDataFlavorAvailable(java.awt.datatransfer.DataFlavor)
     * public boolean java.awt.datatransfer.Clipboard.isDataFlavorAvailable(java.awt.datatransfer.DataFlavor)}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#isDataFlavorAvailable(java.awt.datatransfer.DataFlavor)
     * public boolean java.awt.datatransfer.Clipboard.isDataFlavorAvailable(java.awt.datatransfer.DataFlavor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.Clipboard#isDataFlavorAvailable(java.awt.datatransfer.DataFlavor) public boolean
     *      java.awt.datatransfer.Clipboard.isDataFlavorAvailable(java.awt.datatransfer.DataFlavor) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.awt.datatransfer.Clipboard#getContents(Object) public synchronized
     * java.awt.datatransfer.Transferable java.awt.datatransfer.Clipboard.getContents(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getContents(Object) public synchronized
     * java.awt.datatransfer.Transferable java.awt.datatransfer.Clipboard.getContents(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.Clipboard#getContents(Object) public synchronized java.awt.datatransfer.Transferable
     *      java.awt.datatransfer.Clipboard.getContents(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.awt.datatransfer.Clipboard#getFlavorListeners() public synchronized
     * java.awt.datatransfer.FlavorListener[] java.awt.datatransfer.Clipboard.getFlavorListeners()}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getFlavorListeners() public synchronized
     * java.awt.datatransfer.FlavorListener[] java.awt.datatransfer.Clipboard.getFlavorListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.Clipboard#getFlavorListeners() public synchronized
     *      java.awt.datatransfer.FlavorListener[] java.awt.datatransfer.Clipboard.getFlavorListeners() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.awt.datatransfer.Clipboard#removeFlavorListener(java.awt.datatransfer.FlavorListener)
     * public synchronized void
     * java.awt.datatransfer.Clipboard.removeFlavorListener(java.awt.datatransfer.FlavorListener)}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#removeFlavorListener(java.awt.datatransfer.FlavorListener)
     * public synchronized void
     * java.awt.datatransfer.Clipboard.removeFlavorListener(java.awt.datatransfer.FlavorListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.Clipboard#removeFlavorListener(java.awt.datatransfer.FlavorListener) public
     *      synchronized void java.awt.datatransfer.Clipboard.removeFlavorListener(java.awt.datatransfer.FlavorListener)
     *      (the hereby targeted method-under-test)
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
     * {@link java.awt.datatransfer.Clipboard#setContents(java.awt.datatransfer.Transferable, java.awt.datatransfer.ClipboardOwner)
     * public synchronized void
     * java.awt.datatransfer.Clipboard.setContents(java.awt.datatransfer.Transferable,java.awt.datatransfer.ClipboardOwner)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.Clipboard#setContents(java.awt.datatransfer.Transferable, java.awt.datatransfer.ClipboardOwner)
     * public synchronized void
     * java.awt.datatransfer.Clipboard.setContents(java.awt.datatransfer.Transferable,java.awt.datatransfer.ClipboardOwner)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.Clipboard#setContents(java.awt.datatransfer.Transferable,
     *      java.awt.datatransfer.ClipboardOwner) public synchronized void
     *      java.awt.datatransfer.Clipboard.setContents(java.awt.datatransfer.Transferable,java.awt.datatransfer.
     *      ClipboardOwner) (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getData(java.awt.datatransfer.DataFlavor) public
     * java.lang.Object java.awt.datatransfer.Clipboard.getData(java.awt.datatransfer.DataFlavor) throws
     * java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.Clipboard#getData(java.awt.datatransfer.DataFlavor) public
     * java.lang.Object java.awt.datatransfer.Clipboard.getData(java.awt.datatransfer.DataFlavor) throws
     * java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.Clipboard#getData(java.awt.datatransfer.DataFlavor) public java.lang.Object
     *      java.awt.datatransfer.Clipboard.getData(java.awt.datatransfer.DataFlavor) throws
     *      java.awt.datatransfer.UnsupportedFlavorException,java.io.IOException (the hereby targeted method-under-test)
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

}
