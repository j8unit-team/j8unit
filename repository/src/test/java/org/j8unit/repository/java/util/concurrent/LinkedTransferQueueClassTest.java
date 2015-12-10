package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class LinkedTransferQueueClassTest
implements org.j8unit.repository.java.util.concurrent.LinkedTransferQueueClassTests<java.util.concurrent.LinkedTransferQueue> {

    @Override
    public Class<java.util.concurrent.LinkedTransferQueue> createNewSUT() {
        return java.util.concurrent.LinkedTransferQueue.class;
    }

}
