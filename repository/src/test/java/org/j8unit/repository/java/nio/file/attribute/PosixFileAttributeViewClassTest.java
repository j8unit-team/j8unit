package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributeView;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PosixFileAttributeView} (by simply
 * reusing the J8Unit test interface {@link PosixFileAttributeViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class PosixFileAttributeViewClassTest
implements PosixFileAttributeViewClassTests<PosixFileAttributeView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.PosixFileAttributeView]

    @Override
    public Class<PosixFileAttributeView> createNewSUT() {
        return PosixFileAttributeView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.PosixFileAttributeView]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.PosixFileAttributeView]

}
