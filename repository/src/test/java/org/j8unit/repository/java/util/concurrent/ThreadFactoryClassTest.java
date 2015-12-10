package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadFactoryClassTest
implements org.j8unit.repository.java.util.concurrent.ThreadFactoryClassTests<java.util.concurrent.ThreadFactory> {

    @Override
    public Class<java.util.concurrent.ThreadFactory> createNewSUT() {
        return java.util.concurrent.ThreadFactory.class;
    }

}
