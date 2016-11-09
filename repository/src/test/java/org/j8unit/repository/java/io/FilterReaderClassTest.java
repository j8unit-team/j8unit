package org.j8unit.repository.java.io;

import java.io.FilterReader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FilterReader} (by simply reusing the
 * J8Unit test interface {@link FilterReaderClassTests}).
 */

@RunWith(J8Unit4.class)
public class FilterReaderClassTest
implements FilterReaderClassTests<FilterReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FilterReader]

    @Override
    public Class<FilterReader> createNewSUT() {
        return FilterReader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.FilterReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FilterReader]

}
