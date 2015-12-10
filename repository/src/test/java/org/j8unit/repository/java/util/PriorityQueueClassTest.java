package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class PriorityQueueClassTest
implements org.j8unit.repository.java.util.PriorityQueueClassTests<java.util.PriorityQueue> {

    @Override
    public Class<java.util.PriorityQueue> createNewSUT() {
        return java.util.PriorityQueue.class;
    }

}
