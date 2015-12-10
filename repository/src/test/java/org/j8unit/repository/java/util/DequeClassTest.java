package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class DequeClassTest
implements org.j8unit.repository.java.util.DequeClassTests<java.util.Deque> {

    @Override
    public Class<java.util.Deque> createNewSUT() {
        return java.util.Deque.class;
    }

}
