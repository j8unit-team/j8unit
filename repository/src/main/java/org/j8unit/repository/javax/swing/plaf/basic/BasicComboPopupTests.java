package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicComboPopup class
 * javax.swing.plaf.basic.BasicComboPopup}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicComboPopupTests<SUT extends javax.swing.plaf.basic.BasicComboPopup>
extends org.j8unit.repository.javax.swing.plaf.basic.ComboPopupTests<SUT>, org.j8unit.repository.javax.swing.JPopupMenuTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler class
     * javax.swing.plaf.basic.BasicComboPopup$InvocationKeyHandler}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests.InvocationKeyHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupClassTests.InvocationKeyHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InvocationKeyHandlerTests<SUT extends javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler>
    extends org.j8unit.repository.java.awt.event.KeyAdapterTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler#keyReleased(java.awt.event.KeyEvent)
         * public void javax.swing.plaf.basic.BasicComboPopup$InvocationKeyHandler.keyReleased(java.awt.event.KeyEvent)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler#keyReleased(java.awt.event.KeyEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_keyReleased_KeyEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicComboPopup.ListDataHandler class
     * javax.swing.plaf.basic.BasicComboPopup$ListDataHandler}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests.ListDataHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupClassTests.ListDataHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup.ListDataHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ListDataHandlerTests<SUT extends javax.swing.plaf.basic.BasicComboPopup.ListDataHandler>
    extends org.j8unit.repository.javax.swing.event.ListDataListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicComboPopup.ListDataHandler#contentsChanged(javax.swing.event.ListDataEvent)
         * public void
         * javax.swing.plaf.basic.BasicComboPopup$ListDataHandler.contentsChanged(javax.swing.event.ListDataEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup.ListDataHandler#contentsChanged(javax.swing.event.
         *             ListDataEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_contentsChanged_ListDataEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicComboPopup.ListDataHandler#intervalAdded(javax.swing.event.ListDataEvent)
         * public void
         * javax.swing.plaf.basic.BasicComboPopup$ListDataHandler.intervalAdded(javax.swing.event.ListDataEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup.ListDataHandler#intervalAdded(javax.swing.event.
         *             ListDataEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_intervalAdded_ListDataEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicComboPopup.ListDataHandler#intervalRemoved(javax.swing.event.ListDataEvent)
         * public void
         * javax.swing.plaf.basic.BasicComboPopup$ListDataHandler.intervalRemoved(javax.swing.event.ListDataEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup.ListDataHandler#intervalRemoved(javax.swing.event.
         *             ListDataEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_intervalRemoved_ListDataEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboPopup#getAccessibleContext() public
     * javax.accessibility.AccessibleContext javax.swing.plaf.basic.BasicComboPopup.getAccessibleContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup#getAccessibleContext()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAccessibleContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboPopup#getKeyListener() public java.awt.event.KeyListener
     * javax.swing.plaf.basic.BasicComboPopup.getKeyListener()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup#getKeyListener()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getKeyListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboPopup#getList() public javax.swing.JList
     * javax.swing.plaf.basic.BasicComboPopup.getList()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup#getList()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboPopup#getMouseListener() public
     * java.awt.event.MouseListener javax.swing.plaf.basic.BasicComboPopup.getMouseListener()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup#getMouseListener()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMouseListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboPopup#getMouseMotionListener() public
     * java.awt.event.MouseMotionListener javax.swing.plaf.basic.BasicComboPopup.getMouseMotionListener()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup#getMouseMotionListener()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMouseMotionListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboPopup#hide() public void
     * javax.swing.plaf.basic.BasicComboPopup.hide()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup#hide()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_hide()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboPopup#isFocusTraversable() public boolean
     * javax.swing.plaf.basic.BasicComboPopup.isFocusTraversable()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup#isFocusTraversable()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isFocusTraversable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface javax.swing.plaf.basic.ComboPopup</li>
     * <li>class javax.swing.JPopupMenu</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isVisible()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboPopup#show() public void
     * javax.swing.plaf.basic.BasicComboPopup.show()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup#show()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_show()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboPopup#uninstallingUI() public void
     * javax.swing.plaf.basic.BasicComboPopup.uninstallingUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicComboPopup#uninstallingUI()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_uninstallingUI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
