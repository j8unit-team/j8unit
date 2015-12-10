package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileInputStreamTest
implements org.j8unit.repository.java.io.FileInputStreamTests<java.io.FileInputStream> {

    @Override
    public java.io.FileInputStream createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.io.FileInputStream] available.");
    }

}
