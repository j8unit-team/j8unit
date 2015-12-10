package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OutputStreamClassTest
implements org.j8unit.repository.java.io.OutputStreamClassTests<java.io.OutputStream> {

    @Override
    public Class<java.io.OutputStream> createNewSUT() {
        return java.io.OutputStream.class;
    }

}
