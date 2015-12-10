package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilterOutputStreamClassTest
implements org.j8unit.repository.java.io.FilterOutputStreamClassTests<java.io.FilterOutputStream> {

    @Override
    public Class<java.io.FilterOutputStream> createNewSUT() {
        return java.io.FilterOutputStream.class;
    }

}
