package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilterWriterClassTest
implements org.j8unit.repository.java.io.FilterWriterClassTests<java.io.FilterWriter> {

    @Override
    public Class<java.io.FilterWriter> createNewSUT() {
        return java.io.FilterWriter.class;
    }

}
