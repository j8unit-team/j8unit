package org.j8unit.repository.javax.swing.undo;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.undo.StateEdit class javax.swing.undo.StateEdit}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link StateEditClassTests}.
 * </p>
 *
 * @see javax.swing.undo.StateEdit class javax.swing.undo.StateEdit (the hereby targeted class-under-test class)
 * @see StateEditClassTests StateEditClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StateEditTests<SUT extends javax.swing.undo.StateEdit>
extends AbstractUndoableEditTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.undo.StateEdit#redo() public void javax.swing.undo.StateEdit.redo()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.StateEdit#redo() public void javax.swing.undo.StateEdit.redo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.StateEdit#redo() public void javax.swing.undo.StateEdit.redo() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_redo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.StateEdit#end() public void javax.swing.undo.StateEdit.end()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.StateEdit#end() public void javax.swing.undo.StateEdit.end()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.StateEdit#end() public void javax.swing.undo.StateEdit.end() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_end()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.StateEdit#undo() public void javax.swing.undo.StateEdit.undo()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.StateEdit#undo() public void javax.swing.undo.StateEdit.undo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.StateEdit#undo() public void javax.swing.undo.StateEdit.undo() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_undo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.StateEdit#getPresentationName() public java.lang.String
     * javax.swing.undo.StateEdit.getPresentationName()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.StateEdit#getPresentationName() public java.lang.String
     * javax.swing.undo.StateEdit.getPresentationName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.StateEdit#getPresentationName() public java.lang.String
     *      javax.swing.undo.StateEdit.getPresentationName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPresentationName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
