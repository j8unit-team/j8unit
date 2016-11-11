package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.FileStoreAttributeView;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileStoreAttributeView} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.file.attribute.FileStoreAttributeViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileStoreAttributeViewClassTest
implements FileStoreAttributeViewClassTests<FileStoreAttributeView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.FileStoreAttributeView]

    @Override
    public Class<FileStoreAttributeView> createNewSUT() {
        return FileStoreAttributeView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.FileStoreAttributeView]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.FileStoreAttributeView]

}
