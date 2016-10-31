package org.j8unit.repository.javax.swing.undo;

import javax.swing.undo.AbstractUndoableEdit;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractUndoableEditClassTest
implements org.j8unit.repository.javax.swing.undo.AbstractUndoableEditClassTests<AbstractUndoableEdit> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.undo.AbstractUndoableEdit]

    @Override
    public Class<AbstractUndoableEdit> createNewSUT() {
        return AbstractUndoableEdit.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.undo.AbstractUndoableEdit#AbstractUndoableEdit() public
     * javax.swing.undo.AbstractUndoableEdit()}.
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
    public void create_AbstractUndoableEdit()
    throws Exception {
        // create new instance
        final AbstractUndoableEdit sut = new AbstractUndoableEdit();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.undo.AbstractUndoableEdit]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.undo.AbstractUndoableEdit]

}
