package org.j8unit.repository.javax.swing.undo;

import javax.swing.undo.UndoManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UndoManagerClassTest
implements org.j8unit.repository.javax.swing.undo.UndoManagerClassTests<UndoManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.undo.UndoManager]

    @Override
    public Class<UndoManager> createNewSUT() {
        return UndoManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.undo.UndoManager#UndoManager()
     * public javax.swing.undo.UndoManager()}.
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
    public void create_UndoManager()
    throws Exception {
        // create new instance
        final UndoManager sut = new UndoManager();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.undo.UndoManager]

}
