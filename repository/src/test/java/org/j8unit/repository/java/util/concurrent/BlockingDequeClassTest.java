package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class BlockingDequeClassTest
implements org.j8unit.repository.java.util.concurrent.BlockingDequeClassTests<java.util.concurrent.BlockingDeque> {

    @Override
    public Class<java.util.concurrent.BlockingDeque> createNewSUT() {
        return java.util.concurrent.BlockingDeque.class;
    }

}
