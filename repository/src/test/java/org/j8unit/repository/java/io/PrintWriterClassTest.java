package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintWriterClassTest
implements org.j8unit.repository.java.io.PrintWriterClassTests<java.io.PrintWriter> {

    @Override
    public Class<java.io.PrintWriter> createNewSUT() {
        return java.io.PrintWriter.class;
    }

}
