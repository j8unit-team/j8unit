package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataOutputStreamClassTest
implements org.j8unit.repository.java.io.DataOutputStreamClassTests<java.io.DataOutputStream> {

    @Override
    public Class<java.io.DataOutputStream> createNewSUT() {
        return java.io.DataOutputStream.class;
    }

}
