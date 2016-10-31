package org.j8unit.repository.java.io;

import java.io.Writer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WriterClassTest
implements org.j8unit.repository.java.io.WriterClassTests<Writer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.Writer]

    @Override
    public Class<Writer> createNewSUT() {
        return Writer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.Writer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.Writer]

}
