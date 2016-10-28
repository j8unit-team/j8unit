package org.j8unit.repository.java.time.chrono;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.chrono.ThaiBuddhistEra;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ThaiBuddhistEraTest
implements org.j8unit.repository.java.time.chrono.ThaiBuddhistEraTests<ThaiBuddhistEra> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.ThaiBuddhistEra]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(ThaiBuddhistEra.class);
    }

    @Parameter(0)
    public ThaiBuddhistEra sut;

    @Override
    public ThaiBuddhistEra createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.ThaiBuddhistEra]

}
