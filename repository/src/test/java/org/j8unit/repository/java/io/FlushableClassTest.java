package org.j8unit.repository.java.io;

import java.io.Flushable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FlushableClassTest
implements org.j8unit.repository.java.io.FlushableClassTests<Flushable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.Flushable]

    @Override
    public Class<Flushable> createNewSUT() {
        return Flushable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.Flushable]

}
