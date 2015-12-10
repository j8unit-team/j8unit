package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FlushableClassTest
implements org.j8unit.repository.java.io.FlushableClassTests<java.io.Flushable> {

    @Override
    public Class<java.io.Flushable> createNewSUT() {
        return java.io.Flushable.class;
    }

}
