package org.j8unit.repository.java.awt.font;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.font.TransformAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class TransformAttributeTest
implements org.j8unit.repository.java.awt.font.TransformAttributeTests<TransformAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.TransformAttribute]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TransformAttribute.IDENTITY);
    }

    @Parameter(0)
    public TransformAttribute sut;

    @Override
    public TransformAttribute createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.TransformAttribute]

}
