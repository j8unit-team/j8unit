package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileOwnerAttributeView} (by simply
 * reusing the J8Unit test interface {@link FileOwnerAttributeViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileOwnerAttributeViewClassTest
implements FileOwnerAttributeViewClassTests<FileOwnerAttributeView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.FileOwnerAttributeView]

    @Override
    public Class<FileOwnerAttributeView> createNewSUT() {
        return FileOwnerAttributeView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.FileOwnerAttributeView]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.FileOwnerAttributeView]

}
