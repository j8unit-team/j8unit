package org.j8unit.repository.java.awt;

import java.awt.FileDialog;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileDialog} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.FileDialogTests}).
 */
@RunWith(J8Unit4.class)
public class FileDialogTest
implements FileDialogTests<FileDialog> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.FileDialog]

    @Override
    public FileDialog createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.FileDialog], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.FileDialog]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.FileDialog]

}
