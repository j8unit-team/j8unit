package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragSource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.io.SerializableTests;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link DragSource
 * public class java.awt.dnd.DragSource}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.awt.dnd.DragSourceClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DragSourceTests<SUT extends DragSource>
extends SerializableTests<SUT>, ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.DragSource]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.dnd.DragSource#addDragSourceMotionListener(java.awt.dnd.DragSourceMotionListener) public void
     * java.awt.dnd.DragSource.addDragSourceMotionListener(java.awt.dnd.DragSourceMotionListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addDragSourceMotionListener_DragSourceMotionListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.dnd.DragSource#createDragGestureRecognizer(Class, java.awt.Component, int, java.awt.dnd.DragGestureListener)
     * public <T> T
     * java.awt.dnd.DragSource.createDragGestureRecognizer(java.lang.Class<T>,java.awt.Component,int,java.awt.dnd.DragGestureListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDragGestureRecognizer_Class_Component_int_DragGestureListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.dnd.DragSource#createDefaultDragGestureRecognizer(java.awt.Component, int, java.awt.dnd.DragGestureListener)
     * public java.awt.dnd.DragGestureRecognizer
     * java.awt.dnd.DragSource.createDefaultDragGestureRecognizer(java.awt.Component,int,java.awt.dnd.DragGestureListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDefaultDragGestureRecognizer_Component_int_DragGestureListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.dnd.DragSource#getListeners(Class) public
     * <T> T[] java.awt.dnd.DragSource.getListeners(java.lang.Class<T>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getListeners_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.dnd.DragSource#removeDragSourceListener(java.awt.dnd.DragSourceListener) public void
     * java.awt.dnd.DragSource.removeDragSourceListener(java.awt.dnd.DragSourceListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeDragSourceListener_DragSourceListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.dnd.DragSource#addDragSourceListener(java.awt.dnd.DragSourceListener) public void
     * java.awt.dnd.DragSource.addDragSourceListener(java.awt.dnd.DragSourceListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addDragSourceListener_DragSourceListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.dnd.DragSource#getDragSourceMotionListeners() public java.awt.dnd.DragSourceMotionListener[]
     * java.awt.dnd.DragSource.getDragSourceMotionListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDragSourceMotionListeners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.dnd.DragSource#getFlavorMap() public
     * java.awt.datatransfer.FlavorMap java.awt.dnd.DragSource.getFlavorMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlavorMap()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.dnd.DragSource#removeDragSourceMotionListener(java.awt.dnd.DragSourceMotionListener) public void
     * java.awt.dnd.DragSource.removeDragSourceMotionListener(java.awt.dnd.DragSourceMotionListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeDragSourceMotionListener_DragSourceMotionListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.dnd.DragSource#getDragSourceListeners()
     * public java.awt.dnd.DragSourceListener[] java.awt.dnd.DragSource.getDragSourceListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDragSourceListeners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.dnd.DragSource#startDrag(java.awt.dnd.DragGestureEvent, java.awt.Cursor, java.awt.Image, java.awt.Point, java.awt.datatransfer.Transferable, java.awt.dnd.DragSourceListener)
     * public void
     * java.awt.dnd.DragSource.startDrag(java.awt.dnd.DragGestureEvent,java.awt.Cursor,java.awt.Image,java.awt.Point,java.awt.datatransfer.Transferable,java.awt.dnd.DragSourceListener)
     * throws java.awt.dnd.InvalidDnDOperationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_startDrag_DragGestureEvent_Cursor_Image_Point_Transferable_DragSourceListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.dnd.DragSource#startDrag(java.awt.dnd.DragGestureEvent, java.awt.Cursor, java.awt.Image, java.awt.Point, java.awt.datatransfer.Transferable, java.awt.dnd.DragSourceListener, java.awt.datatransfer.FlavorMap)
     * public void
     * java.awt.dnd.DragSource.startDrag(java.awt.dnd.DragGestureEvent,java.awt.Cursor,java.awt.Image,java.awt.Point,java.awt.datatransfer.Transferable,java.awt.dnd.DragSourceListener,java.awt.datatransfer.FlavorMap)
     * throws java.awt.dnd.InvalidDnDOperationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_startDrag_DragGestureEvent_Cursor_Image_Point_Transferable_DragSourceListener_FlavorMap()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.dnd.DragSource#startDrag(java.awt.dnd.DragGestureEvent, java.awt.Cursor, java.awt.datatransfer.Transferable, java.awt.dnd.DragSourceListener, java.awt.datatransfer.FlavorMap)
     * public void
     * java.awt.dnd.DragSource.startDrag(java.awt.dnd.DragGestureEvent,java.awt.Cursor,java.awt.datatransfer.Transferable,java.awt.dnd.DragSourceListener,java.awt.datatransfer.FlavorMap)
     * throws java.awt.dnd.InvalidDnDOperationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_startDrag_DragGestureEvent_Cursor_Transferable_DragSourceListener_FlavorMap()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.dnd.DragSource#startDrag(java.awt.dnd.DragGestureEvent, java.awt.Cursor, java.awt.datatransfer.Transferable, java.awt.dnd.DragSourceListener)
     * public void
     * java.awt.dnd.DragSource.startDrag(java.awt.dnd.DragGestureEvent,java.awt.Cursor,java.awt.datatransfer.Transferable,java.awt.dnd.DragSourceListener)
     * throws java.awt.dnd.InvalidDnDOperationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_startDrag_DragGestureEvent_Cursor_Transferable_DragSourceListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.dnd.DragSource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.dnd.DragSource]

}
