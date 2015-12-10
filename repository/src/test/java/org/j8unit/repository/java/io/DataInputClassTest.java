package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataInputClassTest
implements org.j8unit.repository.java.io.DataInputClassTests<java.io.DataInput> {

    @Override
    public Class<java.io.DataInput> createNewSUT() {
        return java.io.DataInput.class;
    }

}
