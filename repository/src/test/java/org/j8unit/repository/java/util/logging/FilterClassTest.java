package org.j8unit.repository.java.util.logging;

import java.util.logging.Filter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Filter} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.logging.FilterClassTests}).
 */
@RunWith(J8Unit4.class)
public class FilterClassTest
implements FilterClassTests<Filter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.Filter]

    @Override
    public Class<Filter> createNewSUT() {
        return Filter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.Filter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.Filter]

}
