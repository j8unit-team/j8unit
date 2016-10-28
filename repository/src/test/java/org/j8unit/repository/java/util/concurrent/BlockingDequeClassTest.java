package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.BlockingDeque;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BlockingDequeClassTest
implements org.j8unit.repository.java.util.concurrent.BlockingDequeClassTests<BlockingDeque> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.BlockingDeque]

    @Override
    public Class<BlockingDeque> createNewSUT() {
        return BlockingDeque.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.BlockingDeque]

}
