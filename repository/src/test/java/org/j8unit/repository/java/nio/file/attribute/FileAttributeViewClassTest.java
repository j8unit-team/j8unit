package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileAttributeView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.FileAttributeViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileAttributeViewClassTest
implements FileAttributeViewClassTests<FileAttributeView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.FileAttributeView]

    @Override
    public Class<FileAttributeView> createNewSUT() {
        return FileAttributeView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.FileAttributeView]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.FileAttributeView]

}
