package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadLocalRandomClassTest
implements org.j8unit.repository.java.util.concurrent.ThreadLocalRandomClassTests<java.util.concurrent.ThreadLocalRandom> {

    @Override
    public Class<java.util.concurrent.ThreadLocalRandom> createNewSUT() {
        return java.util.concurrent.ThreadLocalRandom.class;
    }

}
