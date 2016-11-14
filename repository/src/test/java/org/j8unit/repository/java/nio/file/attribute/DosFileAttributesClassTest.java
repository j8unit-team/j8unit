package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DosFileAttributes} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.DosFileAttributesClassTests}).
 */

@RunWith(J8Unit4.class)
public class DosFileAttributesClassTest
implements DosFileAttributesClassTests<DosFileAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.DosFileAttributes]

    @Override
    public Class<DosFileAttributes> createNewSUT() {
        return DosFileAttributes.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.DosFileAttributes]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.DosFileAttributes]

}
