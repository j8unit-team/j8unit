package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeoutExceptionClassTest
implements org.j8unit.repository.java.util.concurrent.TimeoutExceptionClassTests<java.util.concurrent.TimeoutException> {

    @Override
    public Class<java.util.concurrent.TimeoutException> createNewSUT() {
        return java.util.concurrent.TimeoutException.class;
    }

}
