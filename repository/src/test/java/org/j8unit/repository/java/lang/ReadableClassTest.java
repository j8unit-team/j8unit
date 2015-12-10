package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReadableClassTest
implements org.j8unit.repository.java.lang.ReadableClassTests<java.lang.Readable> {

    @Override
    public Class<java.lang.Readable> createNewSUT() {
        return java.lang.Readable.class;
    }

}
