package org.j8unit.repository.java.lang.annotation;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.lang.annotation.ElementType;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ElementType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.annotation.ElementTypeTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ElementTypeTest
implements ElementTypeTests<ElementType> {

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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.annotation.ElementType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.annotation.ElementType]

}
