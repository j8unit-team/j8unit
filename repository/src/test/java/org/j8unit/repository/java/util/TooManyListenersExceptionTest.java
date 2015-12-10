package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TooManyListenersExceptionTest
implements org.j8unit.repository.java.util.TooManyListenersExceptionTests<java.util.TooManyListenersException> {

    @Override
    public java.util.TooManyListenersException createNewSUT() {
        return new java.util.TooManyListenersException();
    }

}
