package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLEngine;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLEngineTest
implements org.j8unit.repository.javax.net.ssl.SSLEngineTests<SSLEngine> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLEngine]

    @Override
    public SSLEngine createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.SSLEngine], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLEngine]

}
