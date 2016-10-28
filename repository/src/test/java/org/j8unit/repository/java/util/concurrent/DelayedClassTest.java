package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Delayed;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DelayedClassTest
implements org.j8unit.repository.java.util.concurrent.DelayedClassTests<Delayed> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Delayed]

    @Override
    public Class<Delayed> createNewSUT() {
        return Delayed.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Delayed]

}
