package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class CountedCompleterClassTest
implements org.j8unit.repository.java.util.concurrent.CountedCompleterClassTests<java.util.concurrent.CountedCompleter> {

    @Override
    public Class<java.util.concurrent.CountedCompleter> createNewSUT() {
        return java.util.concurrent.CountedCompleter.class;
    }

}
