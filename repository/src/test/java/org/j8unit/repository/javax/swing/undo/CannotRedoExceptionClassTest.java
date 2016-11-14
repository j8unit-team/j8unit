package org.j8unit.repository.javax.swing.undo;

import javax.swing.undo.CannotRedoException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CannotRedoException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.undo.CannotRedoExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class CannotRedoExceptionClassTest
implements CannotRedoExceptionClassTests<CannotRedoException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.undo.CannotRedoException]

    @Override
    public Class<CannotRedoException> createNewSUT() {
        return CannotRedoException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.undo.CannotRedoException#CannotRedoException() public javax.swing.undo.CannotRedoException()}.
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
    public void create_CannotRedoException()
    throws Exception {
        // create new instance
        final CannotRedoException sut = new CannotRedoException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.undo.CannotRedoException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.undo.CannotRedoException]

}
