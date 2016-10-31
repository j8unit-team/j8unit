package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CountedCompleter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CountedCompleterClassTest
implements org.j8unit.repository.java.util.concurrent.CountedCompleterClassTests<CountedCompleter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.CountedCompleter]

    @Override
    public Class<CountedCompleter> createNewSUT() {
        return CountedCompleter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.CountedCompleter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.CountedCompleter]

}
