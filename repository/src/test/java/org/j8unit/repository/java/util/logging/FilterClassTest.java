package org.j8unit.repository.java.util.logging;

import java.util.logging.Filter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilterClassTest
implements org.j8unit.repository.java.util.logging.FilterClassTests<Filter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.Filter]

    @Override
    public Class<Filter> createNewSUT() {
        return Filter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.Filter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.Filter]

}
