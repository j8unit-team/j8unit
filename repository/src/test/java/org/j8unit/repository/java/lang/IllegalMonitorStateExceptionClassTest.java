package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalMonitorStateExceptionClassTest
implements org.j8unit.repository.java.lang.IllegalMonitorStateExceptionClassTests<java.lang.IllegalMonitorStateException> {

    @Override
    public Class<java.lang.IllegalMonitorStateException> createNewSUT() {
        return java.lang.IllegalMonitorStateException.class;
    }

}
