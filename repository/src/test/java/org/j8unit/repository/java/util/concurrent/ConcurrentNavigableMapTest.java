package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ConcurrentNavigableMap;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConcurrentNavigableMapTest<K, V>
implements org.j8unit.repository.java.util.concurrent.ConcurrentNavigableMapTests<ConcurrentNavigableMap<K, V>, K, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ConcurrentNavigableMap]

    @Override
    public ConcurrentNavigableMap<K, V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.ConcurrentNavigableMap], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ConcurrentNavigableMap]

}
