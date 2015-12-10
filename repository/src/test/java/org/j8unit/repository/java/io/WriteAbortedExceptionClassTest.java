package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WriteAbortedExceptionClassTest
implements org.j8unit.repository.java.io.WriteAbortedExceptionClassTests<java.io.WriteAbortedException> {

    @Override
    public Class<java.io.WriteAbortedException> createNewSUT() {
        return java.io.WriteAbortedException.class;
    }

}
