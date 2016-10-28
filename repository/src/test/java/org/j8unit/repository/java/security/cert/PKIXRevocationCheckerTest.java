package org.j8unit.repository.java.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.PKIXRevocationChecker.Option;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class PKIXRevocationCheckerTest
implements org.j8unit.repository.java.security.cert.PKIXRevocationCheckerTests<PKIXRevocationChecker> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXRevocationChecker]

    @Override
    public PKIXRevocationChecker createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.PKIXRevocationChecker], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXRevocationChecker]

    @RunWith(J8Unit4.class)
    public static class OptionTest
    implements org.j8unit.repository.java.security.cert.PKIXRevocationCheckerTests.OptionTests<Option> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXRevocationChecker$Option]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Option.class);
        }

        @Parameter(0)
        public Option sut;

        @Override
        public Option createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXRevocationChecker$Option]

    }

}
