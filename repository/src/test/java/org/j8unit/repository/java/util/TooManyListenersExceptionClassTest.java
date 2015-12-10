package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TooManyListenersExceptionClassTest
implements org.j8unit.repository.java.util.TooManyListenersExceptionClassTests<java.util.TooManyListenersException> {

    @Override
    public Class<java.util.TooManyListenersException> createNewSUT() {
        return java.util.TooManyListenersException.class;
    }

}
