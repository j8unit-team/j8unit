package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilterReaderClassTest
implements org.j8unit.repository.java.io.FilterReaderClassTests<java.io.FilterReader> {

    @Override
    public Class<java.io.FilterReader> createNewSUT() {
        return java.io.FilterReader.class;
    }

}
