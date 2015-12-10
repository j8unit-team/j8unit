package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilterInputStreamClassTest
implements org.j8unit.repository.java.io.FilterInputStreamClassTests<java.io.FilterInputStream> {

    @Override
    public Class<java.io.FilterInputStream> createNewSUT() {
        return java.io.FilterInputStream.class;
    }

}
