package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.AWTEventMulticaster class java.awt.AWTEventMulticaster},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.AWTEventMulticasterTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.AWTEventMulticasterTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.AWTEventMulticaster
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AWTEventMulticasterClassTests<SUT extends java.awt.AWTEventMulticaster>
extends org.j8unit.repository.java.awt.event.ComponentListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.ContainerListenerClassTests<SUT>,
org.j8unit.repository.java.awt.event.FocusListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.KeyListenerClassTests<SUT>,
org.j8unit.repository.java.awt.event.MouseListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.MouseMotionListenerClassTests<SUT>,
org.j8unit.repository.java.awt.event.WindowListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.WindowFocusListenerClassTests<SUT>,
org.j8unit.repository.java.awt.event.WindowStateListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.ActionListenerClassTests<SUT>,
org.j8unit.repository.java.awt.event.ItemListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.AdjustmentListenerClassTests<SUT>,
org.j8unit.repository.java.awt.event.TextListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.InputMethodListenerClassTests<SUT>,
org.j8unit.repository.java.awt.event.HierarchyListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.HierarchyBoundsListenerClassTests<SUT>,
org.j8unit.repository.java.awt.event.MouseWheelListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.ActionListener, java.awt.event.ActionListener) public
     * static java.awt.event.ActionListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.ActionListener,java.awt.event.ActionListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.ActionListener, java.awt.event.ActionListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_ActionListener_ActionListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.AdjustmentListener, java.awt.event.AdjustmentListener)
     * public static java.awt.event.AdjustmentListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.AdjustmentListener,java.awt.event.AdjustmentListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.AdjustmentListener,
     *             java.awt.event.AdjustmentListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_AdjustmentListener_AdjustmentListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.ComponentListener, java.awt.event.ComponentListener)
     * public static java.awt.event.ComponentListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.ComponentListener,java.awt.event.ComponentListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.ComponentListener, java.awt.event.ComponentListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_ComponentListener_ComponentListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.ContainerListener, java.awt.event.ContainerListener)
     * public static java.awt.event.ContainerListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.ContainerListener,java.awt.event.ContainerListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.ContainerListener, java.awt.event.ContainerListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_ContainerListener_ContainerListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.FocusListener, java.awt.event.FocusListener) public static
     * java.awt.event.FocusListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.FocusListener,java.awt.event.FocusListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.FocusListener, java.awt.event.FocusListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_FocusListener_FocusListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.HierarchyBoundsListener, java.awt.event.HierarchyBoundsListener)
     * public static java.awt.event.HierarchyBoundsListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.HierarchyBoundsListener,java.awt.event.HierarchyBoundsListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.HierarchyBoundsListener,
     *             java.awt.event.HierarchyBoundsListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_HierarchyBoundsListener_HierarchyBoundsListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.HierarchyListener, java.awt.event.HierarchyListener)
     * public static java.awt.event.HierarchyListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.HierarchyListener,java.awt.event.HierarchyListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.HierarchyListener, java.awt.event.HierarchyListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_HierarchyListener_HierarchyListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.InputMethodListener, java.awt.event.InputMethodListener)
     * public static java.awt.event.InputMethodListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.InputMethodListener,java.awt.event.InputMethodListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.InputMethodListener,
     *             java.awt.event.InputMethodListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_InputMethodListener_InputMethodListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.AWTEventMulticaster#add(java.awt.event.ItemListener, java.awt.event.ItemListener)
     * public static java.awt.event.ItemListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.ItemListener,java.awt.event.ItemListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.ItemListener, java.awt.event.ItemListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_ItemListener_ItemListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.AWTEventMulticaster#add(java.awt.event.KeyListener, java.awt.event.KeyListener)
     * public static java.awt.event.KeyListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.KeyListener,java.awt.event.KeyListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.KeyListener, java.awt.event.KeyListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_KeyListener_KeyListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.MouseListener, java.awt.event.MouseListener) public static
     * java.awt.event.MouseListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.MouseListener,java.awt.event.MouseListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.MouseListener, java.awt.event.MouseListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_MouseListener_MouseListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.MouseMotionListener, java.awt.event.MouseMotionListener)
     * public static java.awt.event.MouseMotionListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.MouseMotionListener,java.awt.event.MouseMotionListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.MouseMotionListener,
     *             java.awt.event.MouseMotionListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_MouseMotionListener_MouseMotionListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.MouseWheelListener, java.awt.event.MouseWheelListener)
     * public static java.awt.event.MouseWheelListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.MouseWheelListener,java.awt.event.MouseWheelListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.MouseWheelListener,
     *             java.awt.event.MouseWheelListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_MouseWheelListener_MouseWheelListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.AWTEventMulticaster#add(java.awt.event.TextListener, java.awt.event.TextListener)
     * public static java.awt.event.TextListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.TextListener,java.awt.event.TextListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.TextListener, java.awt.event.TextListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_TextListener_TextListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.WindowFocusListener, java.awt.event.WindowFocusListener)
     * public static java.awt.event.WindowFocusListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.WindowFocusListener,java.awt.event.WindowFocusListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.WindowFocusListener,
     *             java.awt.event.WindowFocusListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_WindowFocusListener_WindowFocusListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.WindowListener, java.awt.event.WindowListener) public
     * static java.awt.event.WindowListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.WindowListener,java.awt.event.WindowListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.WindowListener, java.awt.event.WindowListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_WindowListener_WindowListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#add(java.awt.event.WindowStateListener, java.awt.event.WindowStateListener)
     * public static java.awt.event.WindowStateListener
     * java.awt.AWTEventMulticaster.add(java.awt.event.WindowStateListener,java.awt.event.WindowStateListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#add(java.awt.event.WindowStateListener,
     *             java.awt.event.WindowStateListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_WindowStateListener_WindowStateListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.AWTEventMulticaster#getListeners(java.util.EventListener, java.lang.Class) public
     * static java.util.EventListener[]
     * java.awt.AWTEventMulticaster.getListeners(java.util.EventListener,java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#getListeners(java.util.EventListener, java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getListeners_EventListener_Class()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.ActionListener, java.awt.event.ActionListener) public
     * static java.awt.event.ActionListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.ActionListener,java.awt.event.ActionListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.ActionListener, java.awt.event.ActionListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_ActionListener_ActionListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.AdjustmentListener, java.awt.event.AdjustmentListener)
     * public static java.awt.event.AdjustmentListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.AdjustmentListener,java.awt.event.AdjustmentListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.AdjustmentListener,
     *             java.awt.event.AdjustmentListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_AdjustmentListener_AdjustmentListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.ComponentListener, java.awt.event.ComponentListener)
     * public static java.awt.event.ComponentListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.ComponentListener,java.awt.event.ComponentListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.ComponentListener,
     *             java.awt.event.ComponentListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_ComponentListener_ComponentListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.ContainerListener, java.awt.event.ContainerListener)
     * public static java.awt.event.ContainerListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.ContainerListener,java.awt.event.ContainerListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.ContainerListener,
     *             java.awt.event.ContainerListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_ContainerListener_ContainerListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.FocusListener, java.awt.event.FocusListener) public
     * static java.awt.event.FocusListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.FocusListener,java.awt.event.FocusListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.FocusListener, java.awt.event.FocusListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_FocusListener_FocusListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.HierarchyBoundsListener, java.awt.event.HierarchyBoundsListener)
     * public static java.awt.event.HierarchyBoundsListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.HierarchyBoundsListener,java.awt.event.HierarchyBoundsListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.HierarchyBoundsListener,
     *             java.awt.event.HierarchyBoundsListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_HierarchyBoundsListener_HierarchyBoundsListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.HierarchyListener, java.awt.event.HierarchyListener)
     * public static java.awt.event.HierarchyListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.HierarchyListener,java.awt.event.HierarchyListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.HierarchyListener,
     *             java.awt.event.HierarchyListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_HierarchyListener_HierarchyListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.InputMethodListener, java.awt.event.InputMethodListener)
     * public static java.awt.event.InputMethodListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.InputMethodListener,java.awt.event.InputMethodListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.InputMethodListener,
     *             java.awt.event.InputMethodListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_InputMethodListener_InputMethodListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.ItemListener, java.awt.event.ItemListener) public
     * static java.awt.event.ItemListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.ItemListener,java.awt.event.ItemListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.ItemListener, java.awt.event.ItemListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_ItemListener_ItemListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.KeyListener, java.awt.event.KeyListener) public static
     * java.awt.event.KeyListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.KeyListener,java.awt.event.KeyListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.KeyListener, java.awt.event.KeyListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_KeyListener_KeyListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.MouseListener, java.awt.event.MouseListener) public
     * static java.awt.event.MouseListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.MouseListener,java.awt.event.MouseListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.MouseListener, java.awt.event.MouseListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_MouseListener_MouseListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.MouseMotionListener, java.awt.event.MouseMotionListener)
     * public static java.awt.event.MouseMotionListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.MouseMotionListener,java.awt.event.MouseMotionListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.MouseMotionListener,
     *             java.awt.event.MouseMotionListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_MouseMotionListener_MouseMotionListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.MouseWheelListener, java.awt.event.MouseWheelListener)
     * public static java.awt.event.MouseWheelListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.MouseWheelListener,java.awt.event.MouseWheelListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.MouseWheelListener,
     *             java.awt.event.MouseWheelListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_MouseWheelListener_MouseWheelListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.TextListener, java.awt.event.TextListener) public
     * static java.awt.event.TextListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.TextListener,java.awt.event.TextListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.TextListener, java.awt.event.TextListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_TextListener_TextListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.WindowFocusListener, java.awt.event.WindowFocusListener)
     * public static java.awt.event.WindowFocusListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.WindowFocusListener,java.awt.event.WindowFocusListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.WindowFocusListener,
     *             java.awt.event.WindowFocusListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_WindowFocusListener_WindowFocusListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.WindowListener, java.awt.event.WindowListener) public
     * static java.awt.event.WindowListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.WindowListener,java.awt.event.WindowListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.WindowListener, java.awt.event.WindowListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_WindowListener_WindowListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.AWTEventMulticaster#remove(java.awt.event.WindowStateListener, java.awt.event.WindowStateListener)
     * public static java.awt.event.WindowStateListener
     * java.awt.AWTEventMulticaster.remove(java.awt.event.WindowStateListener,java.awt.event.WindowStateListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#remove(java.awt.event.WindowStateListener,
     *             java.awt.event.WindowStateListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_WindowStateListener_WindowStateListener()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.awt.AWTEventMulticaster#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.AWTEventMulticaster.class.isAssignableFrom(sut));
    }

}
