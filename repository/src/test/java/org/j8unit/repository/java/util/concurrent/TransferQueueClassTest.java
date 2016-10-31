package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.TransferQueue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class TransferQueueClassTest
implements org.j8unit.repository.java.util.concurrent.TransferQueueClassTests<TransferQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.TransferQueue]

    @Override
    public Class<TransferQueue> createNewSUT() {
        return TransferQueue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.TransferQueue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.TransferQueue]

}
