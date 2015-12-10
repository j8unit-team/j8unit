package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class TransferQueueClassTest
implements org.j8unit.repository.java.util.concurrent.TransferQueueClassTests<java.util.concurrent.TransferQueue> {

    @Override
    public Class<java.util.concurrent.TransferQueue> createNewSUT() {
        return java.util.concurrent.TransferQueue.class;
    }

}
