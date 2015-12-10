package org.j8unit.repository.javax.net.ssl;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class SSLEngineResultTest
implements org.j8unit.repository.javax.net.ssl.SSLEngineResultTests<javax.net.ssl.SSLEngineResult> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class HandshakeStatusTest
    implements org.j8unit.repository.javax.net.ssl.SSLEngineResultTests.HandshakeStatusTests<javax.net.ssl.SSLEngineResult.HandshakeStatus> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(javax.net.ssl.SSLEngineResult.HandshakeStatus.class);
        }

        @Parameter(0)
        public javax.net.ssl.SSLEngineResult.HandshakeStatus sut;

        @Override
        public javax.net.ssl.SSLEngineResult.HandshakeStatus createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class StatusTest
    implements org.j8unit.repository.javax.net.ssl.SSLEngineResultTests.StatusTests<javax.net.ssl.SSLEngineResult.Status> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(javax.net.ssl.SSLEngineResult.Status.class);
        }

        @Parameter(0)
        public javax.net.ssl.SSLEngineResult.Status sut;

        @Override
        public javax.net.ssl.SSLEngineResult.Status createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public javax.net.ssl.SSLEngineResult createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.net.ssl.SSLEngineResult] available.");
    }

}
