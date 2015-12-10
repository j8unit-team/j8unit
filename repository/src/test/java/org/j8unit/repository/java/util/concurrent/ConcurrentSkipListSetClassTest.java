package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ConcurrentSkipListSetClassTest
implements org.j8unit.repository.java.util.concurrent.ConcurrentSkipListSetClassTests<java.util.concurrent.ConcurrentSkipListSet> {

    @Override
    public Class<java.util.concurrent.ConcurrentSkipListSet> createNewSUT() {
        return java.util.concurrent.ConcurrentSkipListSet.class;
    }

}
