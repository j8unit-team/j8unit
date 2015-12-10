package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteClassTest
implements org.j8unit.repository.java.lang.ByteClassTests<java.lang.Byte> {

    @Override
    public Class<java.lang.Byte> createNewSUT() {
        return java.lang.Byte.class;
    }

}
