package org.j8unit.repository.java.awt.font;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TransformAttributeTest
implements org.j8unit.repository.java.awt.font.TransformAttributeTests<java.awt.font.TransformAttribute> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.awt.font.TransformAttribute.IDENTITY);
    }

    @Parameter(0)
    public java.awt.font.TransformAttribute sut;

    @Override
    public java.awt.font.TransformAttribute createNewSUT() {
        return this.sut;
    }

}
