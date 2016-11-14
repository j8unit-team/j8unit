package org.j8unit.repository.java.util.logging;

import java.util.logging.Formatter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Formatter} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.logging.FormatterClassTests}).
 */

@RunWith(J8Unit4.class)
public class FormatterClassTest
implements FormatterClassTests<Formatter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.Formatter]

    @Override
    public Class<Formatter> createNewSUT() {
        return Formatter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.Formatter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.Formatter]

}
