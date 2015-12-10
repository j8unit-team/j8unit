package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AbstractQueueClassTest
implements org.j8unit.repository.java.util.AbstractQueueClassTests<java.util.AbstractQueue> {

    @Override
    public Class<java.util.AbstractQueue> createNewSUT() {
        return java.util.AbstractQueue.class;
    }

}
