package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintStreamClassTest
implements org.j8unit.repository.java.io.PrintStreamClassTests<java.io.PrintStream> {

    @Override
    public Class<java.io.PrintStream> createNewSUT() {
        return java.io.PrintStream.class;
    }

}
