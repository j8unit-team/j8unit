package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataOutputClassTest
implements org.j8unit.repository.java.io.DataOutputClassTests<java.io.DataOutput> {

    @Override
    public Class<java.io.DataOutput> createNewSUT() {
        return java.io.DataOutput.class;
    }

}
