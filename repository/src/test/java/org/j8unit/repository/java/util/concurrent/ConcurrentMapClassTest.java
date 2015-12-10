package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ConcurrentMapClassTest
implements org.j8unit.repository.java.util.concurrent.ConcurrentMapClassTests<java.util.concurrent.ConcurrentMap> {

    @Override
    public Class<java.util.concurrent.ConcurrentMap> createNewSUT() {
        return java.util.concurrent.ConcurrentMap.class;
    }

}
