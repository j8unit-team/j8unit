package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SequenceInputStreamClassTest
implements org.j8unit.repository.java.io.SequenceInputStreamClassTests<java.io.SequenceInputStream> {

    @Override
    public Class<java.io.SequenceInputStream> createNewSUT() {
        return java.io.SequenceInputStream.class;
    }

}
