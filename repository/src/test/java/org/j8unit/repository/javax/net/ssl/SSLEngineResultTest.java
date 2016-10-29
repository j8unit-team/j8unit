package org.j8unit.repository.javax.net.ssl;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class SSLEngineResultTest
implements org.j8unit.repository.javax.net.ssl.SSLEngineResultTests<SSLEngineResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLEngineResult]

    @Override
    public SSLEngineResult createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.SSLEngineResult], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLEngineResult]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class StatusTest
    implements org.j8unit.repository.javax.net.ssl.SSLEngineResultTests.StatusTests<Status> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLEngineResult$Status]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Status.class);
        }

        @Parameter(0)
        public Status sut;

        @Override
        public Status createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLEngineResult$Status]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class HandshakeStatusTest
    implements org.j8unit.repository.javax.net.ssl.SSLEngineResultTests.HandshakeStatusTests<HandshakeStatus> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLEngineResult$HandshakeStatus]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOfEnumClass(HandshakeStatus.class);
        }

        @Parameter(0)
        public HandshakeStatus sut;

        @Override
        public HandshakeStatus createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLEngineResult$HandshakeStatus]

    }

}
