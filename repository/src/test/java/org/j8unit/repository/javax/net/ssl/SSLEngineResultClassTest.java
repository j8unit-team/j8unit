package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLEngineResultClassTest
implements org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests<javax.net.ssl.SSLEngineResult> {

    @RunWith(J8Unit4.class)
    public static class HandshakeStatusClassTest
    implements org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests.HandshakeStatusClassTests<javax.net.ssl.SSLEngineResult.HandshakeStatus> {

        @Override
        public Class<javax.net.ssl.SSLEngineResult.HandshakeStatus> createNewSUT() {
            return javax.net.ssl.SSLEngineResult.HandshakeStatus.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class StatusClassTest
    implements org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests.StatusClassTests<javax.net.ssl.SSLEngineResult.Status> {

        @Override
        public Class<javax.net.ssl.SSLEngineResult.Status> createNewSUT() {
            return javax.net.ssl.SSLEngineResult.Status.class;
        }

    }

    @Override
    public Class<javax.net.ssl.SSLEngineResult> createNewSUT() {
        return javax.net.ssl.SSLEngineResult.class;
    }

}
