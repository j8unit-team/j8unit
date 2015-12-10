package org.j8unit.repository.java.lang.annotation;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ElementTypeTest
implements org.j8unit.repository.java.lang.annotation.ElementTypeTests<java.lang.annotation.ElementType> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.lang.annotation.ElementType.class);
    }

    @Parameter(0)
    public java.lang.annotation.ElementType sut;

    @Override
    public java.lang.annotation.ElementType createNewSUT() {
        return this.sut;
    }

}
