package org.j8unit.repository.java.util.zip;

import java.util.zip.Checksum;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Checksum} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.zip.ChecksumClassTests}).
 */
@RunWith(J8Unit4.class)
public class ChecksumClassTest
implements ChecksumClassTests<Checksum> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.Checksum]

    @Override
    public Class<Checksum> createNewSUT() {
        return Checksum.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.zip.Checksum]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.Checksum]

}
