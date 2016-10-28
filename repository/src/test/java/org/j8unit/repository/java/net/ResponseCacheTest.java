package org.j8unit.repository.java.net;

import java.net.ResponseCache;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResponseCacheTest
implements org.j8unit.repository.java.net.ResponseCacheTests<ResponseCache> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.ResponseCache]

    @Override
    public ResponseCache createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.ResponseCache], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.ResponseCache]

}
