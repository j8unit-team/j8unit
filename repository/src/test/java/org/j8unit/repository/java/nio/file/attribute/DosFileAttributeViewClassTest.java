package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributeView;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DosFileAttributeView} (by simply reusing
 * the J8Unit test interface {@link DosFileAttributeViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class DosFileAttributeViewClassTest
implements DosFileAttributeViewClassTests<DosFileAttributeView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.DosFileAttributeView]

    @Override
    public Class<DosFileAttributeView> createNewSUT() {
        return DosFileAttributeView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.DosFileAttributeView]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.DosFileAttributeView]

}
