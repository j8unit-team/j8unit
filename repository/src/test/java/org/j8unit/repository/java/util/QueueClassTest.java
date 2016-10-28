package org.j8unit.repository.java.util;

import java.util.Queue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class QueueClassTest
implements org.j8unit.repository.java.util.QueueClassTests<Queue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Queue]

    @Override
    public Class<Queue> createNewSUT() {
        return Queue.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Queue]

}
