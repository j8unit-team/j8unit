package org.j8unit.repository.java.io;

import java.io.FilterWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FilterWriter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.FilterWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class FilterWriterClassTest
implements FilterWriterClassTests<FilterWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FilterWriter]

    @Override
    public Class<FilterWriter> createNewSUT() {
        return FilterWriter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.FilterWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FilterWriter]

}
