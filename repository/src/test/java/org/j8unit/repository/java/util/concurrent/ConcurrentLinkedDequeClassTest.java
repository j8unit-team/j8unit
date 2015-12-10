package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ConcurrentLinkedDequeClassTest
implements org.j8unit.repository.java.util.concurrent.ConcurrentLinkedDequeClassTests<java.util.concurrent.ConcurrentLinkedDeque> {

    @Override
    public Class<java.util.concurrent.ConcurrentLinkedDeque> createNewSUT() {
        return java.util.concurrent.ConcurrentLinkedDeque.class;
    }

}
