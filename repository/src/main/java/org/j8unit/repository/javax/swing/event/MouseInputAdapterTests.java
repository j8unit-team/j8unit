package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.MouseInputAdapter class
 * javax.swing.event.MouseInputAdapter}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MouseInputAdapterClassTests}.
 * </p>
 *
 * @see javax.swing.event.MouseInputAdapter class javax.swing.event.MouseInputAdapter (the hereby targeted
 *      class-under-test class)
 * @see MouseInputAdapterClassTests MouseInputAdapterClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MouseInputAdapterTests<SUT extends javax.swing.event.MouseInputAdapter>
extends MouseInputListenerTests<SUT>, org.j8unit.repository.java.awt.event.MouseAdapterTests<SUT> {

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.awt.event.MouseAdapter#mouseMoved(java.awt.event.MouseEvent) class
     * java.awt.event.MouseAdapter}</li>
     * <li>{@linkplain java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent) interface
     * java.awt.event.MouseMotionListener}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_mouseMoved_MouseEvent()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.awt.event.MouseAdapter#mousePressed(java.awt.event.MouseEvent) class
     * java.awt.event.MouseAdapter}</li>
     * <li>{@linkplain java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent) interface
     * java.awt.event.MouseListener}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_mousePressed_MouseEvent()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.awt.event.MouseAdapter#mouseReleased(java.awt.event.MouseEvent) class
     * java.awt.event.MouseAdapter}</li>
     * <li>{@linkplain java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent) interface
     * java.awt.event.MouseListener}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_mouseReleased_MouseEvent()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.awt.event.MouseAdapter#mouseDragged(java.awt.event.MouseEvent) class
     * java.awt.event.MouseAdapter}</li>
     * <li>{@linkplain java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent) interface
     * java.awt.event.MouseMotionListener}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_mouseDragged_MouseEvent()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent) class
     * java.awt.event.MouseAdapter}</li>
     * <li>{@linkplain java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent) interface
     * java.awt.event.MouseListener}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_mouseExited_MouseEvent()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.awt.event.MouseAdapter#mouseEntered(java.awt.event.MouseEvent) class
     * java.awt.event.MouseAdapter}</li>
     * <li>{@linkplain java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent) interface
     * java.awt.event.MouseListener}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_mouseEntered_MouseEvent()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.awt.event.MouseAdapter#mouseClicked(java.awt.event.MouseEvent) class
     * java.awt.event.MouseAdapter}</li>
     * <li>{@linkplain java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent) interface
     * java.awt.event.MouseListener}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_mouseClicked_MouseEvent()
    throws Exception {
    }

}
