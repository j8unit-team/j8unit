package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintWriterTest
implements org.j8unit.repository.java.io.PrintWriterTests<java.io.PrintWriter> {

    @Override
    public java.io.PrintWriter createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.io.PrintWriter] available.");
    }

}
