package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WriterClassTest
implements org.j8unit.repository.java.io.WriterClassTests<java.io.Writer> {

    @Override
    public Class<java.io.Writer> createNewSUT() {
        return java.io.Writer.class;
    }

}
