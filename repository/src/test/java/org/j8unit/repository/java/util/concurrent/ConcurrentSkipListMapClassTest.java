package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ConcurrentSkipListMapClassTest
implements org.j8unit.repository.java.util.concurrent.ConcurrentSkipListMapClassTests<java.util.concurrent.ConcurrentSkipListMap> {

    @Override
    public Class<java.util.concurrent.ConcurrentSkipListMap> createNewSUT() {
        return java.util.concurrent.ConcurrentSkipListMap.class;
    }

}
