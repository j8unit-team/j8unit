package org.j8unit.repository.java.lang.annotation;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.lang.annotation.ElementType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ElementTypeTest
implements org.j8unit.repository.java.lang.annotation.ElementTypeTests<ElementType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.ElementType]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(ElementType.class);
    }

    @Parameter(0)
    public ElementType sut;

    @Override
    public ElementType createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.ElementType]

}
