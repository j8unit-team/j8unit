package org.j8unit.repository.java.util;

import java.util.AbstractQueue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractQueueClassTest
implements org.j8unit.repository.java.util.AbstractQueueClassTests<AbstractQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractQueue]

    @Override
    public Class<AbstractQueue> createNewSUT() {
        return AbstractQueue.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractQueue]

}
