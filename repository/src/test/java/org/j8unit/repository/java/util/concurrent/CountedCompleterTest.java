package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CountedCompleter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CountedCompleter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.CountedCompleterTests}).
 */

@RunWith(J8Unit4.class)
public class CountedCompleterTest<T>
implements CountedCompleterTests<CountedCompleter<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CountedCompleter]

    @Override
    public CountedCompleter<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.CountedCompleter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.CountedCompleter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.CountedCompleter]

}
