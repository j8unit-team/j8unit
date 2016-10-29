package org.j8unit.repository.java.awt.font;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.font.TransformAttribute;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
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
