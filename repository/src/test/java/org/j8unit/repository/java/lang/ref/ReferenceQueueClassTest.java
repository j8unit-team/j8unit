package org.j8unit.repository.java.lang.ref;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ReferenceQueueClassTest
implements org.j8unit.repository.java.lang.ref.ReferenceQueueClassTests<java.lang.ref.ReferenceQueue> {

    @Override
    public Class<java.lang.ref.ReferenceQueue> createNewSUT() {
        return java.lang.ref.ReferenceQueue.class;
    }

}
