package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.HostnameVerifier;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HostnameVerifier} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.HostnameVerifierTests}).
 */
@RunWith(J8Unit4.class)
public class HostnameVerifierTest
implements HostnameVerifierTests<HostnameVerifier> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.HostnameVerifier]

    @Override
    public HostnameVerifier createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.HostnameVerifier], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.HostnameVerifier]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.HostnameVerifier]

}
