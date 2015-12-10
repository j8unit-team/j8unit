package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormatterClosedExceptionClassTest
implements org.j8unit.repository.java.util.FormatterClosedExceptionClassTests<java.util.FormatterClosedException> {

    @Override
    public Class<java.util.FormatterClosedException> createNewSUT() {
        return java.util.FormatterClosedException.class;
    }

}
