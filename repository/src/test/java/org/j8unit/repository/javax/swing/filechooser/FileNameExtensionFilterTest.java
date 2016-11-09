package org.j8unit.repository.javax.swing.filechooser;

import javax.swing.filechooser.FileNameExtensionFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileNameExtensionFilter} (by simply
 * reusing the J8Unit test interface {@link FileNameExtensionFilterTests}).
 */

@RunWith(J8Unit4.class)
public class FileNameExtensionFilterTest
implements FileNameExtensionFilterTests<FileNameExtensionFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.filechooser.FileNameExtensionFilter]

    @Override
    public FileNameExtensionFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.filechooser.FileNameExtensionFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.filechooser.FileNameExtensionFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.filechooser.FileNameExtensionFilter]

}
