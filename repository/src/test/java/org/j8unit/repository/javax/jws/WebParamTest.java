package org.j8unit.repository.javax.jws;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class WebParamTest
implements org.j8unit.repository.javax.jws.WebParamTests<WebParam> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.WebParam]

    @Override
    public WebParam createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.WebParam], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.WebParam]

    @RunWith(J8Unit4.class)
    public static class ModeTest
    implements org.j8unit.repository.javax.jws.WebParamTests.ModeTests<Mode> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.WebParam$Mode]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Mode.class);
        }

        @Parameter(0)
        public Mode sut;

        @Override
        public Mode createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.WebParam$Mode]

    }

}
