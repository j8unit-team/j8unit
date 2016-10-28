package org.j8unit.repository.javax.tools;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.tools.StandardLocation;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class StandardLocationTest
implements org.j8unit.repository.javax.tools.StandardLocationTests<StandardLocation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.StandardLocation]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(StandardLocation.class);
    }

    @Parameter(0)
    public StandardLocation sut;

    @Override
    public StandardLocation createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.StandardLocation]

}
