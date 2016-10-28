package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ConcurrentNavigableMap;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConcurrentNavigableMapClassTest
implements org.j8unit.repository.java.util.concurrent.ConcurrentNavigableMapClassTests<ConcurrentNavigableMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ConcurrentNavigableMap]

    @Override
    public Class<ConcurrentNavigableMap> createNewSUT() {
        return ConcurrentNavigableMap.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ConcurrentNavigableMap]

}
