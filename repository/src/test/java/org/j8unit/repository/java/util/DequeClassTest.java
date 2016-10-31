package org.j8unit.repository.java.util;

import java.util.Deque;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DequeClassTest
implements org.j8unit.repository.java.util.DequeClassTests<Deque> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Deque]

    @Override
    public Class<Deque> createNewSUT() {
        return Deque.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Deque]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Deque]

}
