package org.j8unit.repository.javax.jws;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WebParam} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.jws.WebParamTests}).
 */

@RunWith(J8Unit4.class)
public class WebParamTest
implements WebParamTests<WebParam> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.WebParam]

    @Override
    public WebParam createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.WebParam], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.WebParam]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.WebParam]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Mode} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.jws.WebParamTests.ModeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ModeTest
    implements ModeTests<Mode> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.WebParam$Mode]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(Mode.class);
        }

        @Parameter(0)
        public Mode sut;

        @Override
        public Mode createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.WebParam$Mode]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.WebParam$Mode]

    }

}
