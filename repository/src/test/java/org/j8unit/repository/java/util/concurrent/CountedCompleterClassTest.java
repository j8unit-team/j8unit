package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CountedCompleter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CountedCompleter} (by simply reusing the
 * J8Unit test interface {@link CountedCompleterClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CountedCompleterClassTest
implements CountedCompleterClassTests<CountedCompleter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.CountedCompleter]

    @Override
    public Class<CountedCompleter> createNewSUT() {
        return CountedCompleter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.CountedCompleter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.CountedCompleter]

}
