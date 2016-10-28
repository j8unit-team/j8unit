package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConcurrentMapClassTest
implements org.j8unit.repository.java.util.concurrent.ConcurrentMapClassTests<ConcurrentMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ConcurrentMap]

    @Override
    public Class<ConcurrentMap> createNewSUT() {
        return ConcurrentMap.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ConcurrentMap]

}
