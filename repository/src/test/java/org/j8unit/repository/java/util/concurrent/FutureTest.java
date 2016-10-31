package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Future;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FutureTest<V>
implements org.j8unit.repository.java.util.concurrent.FutureTests<Future<V>, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.Future]

    @Override
    public Future<V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.Future], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.Future]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.Future]

}
