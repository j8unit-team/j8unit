package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ThreadFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadFactoryClassTest
implements org.j8unit.repository.java.util.concurrent.ThreadFactoryClassTests<ThreadFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ThreadFactory]

    @Override
    public Class<ThreadFactory> createNewSUT() {
        return ThreadFactory.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadFactory]

}
