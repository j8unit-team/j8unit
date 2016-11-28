package org.j8unit.repository.java.nio.file;

import java.nio.file.OpenOption;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OpenOption} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.nio.file.OpenOptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class OpenOptionClassTest
implements OpenOptionClassTests<OpenOption> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.OpenOption]

    @Override
    public Class<OpenOption> createNewSUT() {
        return OpenOption.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.OpenOption]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.OpenOption]

}
