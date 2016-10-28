package org.j8unit.repository.java.time.format;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.format.TextStyle;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class TextStyleTest
implements org.j8unit.repository.java.time.format.TextStyleTests<TextStyle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.format.TextStyle]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(TextStyle.class);
    }

    @Parameter(0)
    public TextStyle sut;

    @Override
    public TextStyle createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.format.TextStyle]

}
