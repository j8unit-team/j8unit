package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DelayedClassTest
implements org.j8unit.repository.java.util.concurrent.DelayedClassTests<java.util.concurrent.Delayed> {

    @Override
    public Class<java.util.concurrent.Delayed> createNewSUT() {
        return java.util.concurrent.Delayed.class;
    }

}
