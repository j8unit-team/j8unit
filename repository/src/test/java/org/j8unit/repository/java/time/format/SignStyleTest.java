package org.j8unit.repository.java.time.format;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.format.SignStyle;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class SignStyleTest
implements org.j8unit.repository.java.time.format.SignStyleTests<SignStyle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.format.SignStyle]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(SignStyle.class);
    }

    @Parameter(0)
    public SignStyle sut;

    @Override
    public SignStyle createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.format.SignStyle]

}
