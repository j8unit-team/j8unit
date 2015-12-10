package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StackTraceElementClassTest
implements org.j8unit.repository.java.lang.StackTraceElementClassTests<java.lang.StackTraceElement> {

    @Override
    public Class<java.lang.StackTraceElement> createNewSUT() {
        return java.lang.StackTraceElement.class;
    }

}
