package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReadableClassTest
implements org.j8unit.repository.java.lang.ReadableClassTests<Readable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Readable]

    @Override
    public Class<Readable> createNewSUT() {
        return Readable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Readable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Readable]

}
