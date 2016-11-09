package org.j8unit.repository.java.nio.file;

import java.nio.file.CopyOption;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CopyOption} (by simply reusing the J8Unit
 * test interface {@link CopyOptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class CopyOptionClassTest
implements CopyOptionClassTests<CopyOption> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.CopyOption]

    @Override
    public Class<CopyOption> createNewSUT() {
        return CopyOption.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.CopyOption]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.CopyOption]

}
