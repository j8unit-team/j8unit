package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragSource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DragSource} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.dnd.DragSourceClassTests}).
 */
@RunWith(J8Unit4.class)
public class DragSourceClassTest
implements DragSourceClassTests<DragSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DragSource]

    @Override
    public Class<DragSource> createNewSUT() {
        return DragSource.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.dnd.DragSource#DragSource() public
     * java.awt.dnd.DragSource() throws java.awt.HeadlessException}.
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
    public void create_DragSource()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DragSource sut = new DragSource();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.dnd.DragSource#isDragImageSupported()
     * public static boolean java.awt.dnd.DragSource.isDragImageSupported()}.
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
    public void test_isDragImageSupported()
    throws Exception {
        // write some test for {@link java.awt.dnd.DragSource#isDragImageSupported()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.dnd.DragSource#getDragThreshold() public
     * static int java.awt.dnd.DragSource.getDragThreshold()}.
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
    public void test_getDragThreshold()
    throws Exception {
        // write some test for {@link java.awt.dnd.DragSource#getDragThreshold()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.dnd.DragSource#getDefaultDragSource()
     * public static java.awt.dnd.DragSource java.awt.dnd.DragSource.getDefaultDragSource()}.
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
    public void test_getDefaultDragSource()
    throws Exception {
        // write some test for {@link java.awt.dnd.DragSource#getDefaultDragSource()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DragSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DragSource]

}
