package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.TableColumnModelEvent class
 * javax.swing.event.TableColumnModelEvent}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link TableColumnModelEventClassTests}.
 * </p>
 *
 * @see javax.swing.event.TableColumnModelEvent class javax.swing.event.TableColumnModelEvent (the hereby targeted
 *      class-under-test class)
 * @see TableColumnModelEventClassTests TableColumnModelEventClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TableColumnModelEventTests<SUT extends javax.swing.event.TableColumnModelEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.TableColumnModelEvent#getFromIndex() public int
     * javax.swing.event.TableColumnModelEvent.getFromIndex()}.
     *
     * <p>
     * Test method for {@link javax.swing.event.TableColumnModelEvent#getFromIndex() public int
     * javax.swing.event.TableColumnModelEvent.getFromIndex()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.TableColumnModelEvent#getFromIndex() public int
     *      javax.swing.event.TableColumnModelEvent.getFromIndex() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFromIndex()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.TableColumnModelEvent#getToIndex() public int
     * javax.swing.event.TableColumnModelEvent.getToIndex()}.
     *
     * <p>
     * Test method for {@link javax.swing.event.TableColumnModelEvent#getToIndex() public int
     * javax.swing.event.TableColumnModelEvent.getToIndex()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.TableColumnModelEvent#getToIndex() public int
     *      javax.swing.event.TableColumnModelEvent.getToIndex() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getToIndex()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
