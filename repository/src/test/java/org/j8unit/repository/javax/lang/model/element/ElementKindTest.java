package org.j8unit.repository.javax.lang.model.element;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.lang.model.element.ElementKind;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ElementKind} (by simply reusing the
 * J8Unit test interface {@link ElementKindTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ElementKindTest
implements ElementKindTests<ElementKind> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.ElementKind]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(ElementKind.class);
    }

    @Parameter(0)
    public ElementKind sut;

    @Override
    public ElementKind createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.element.ElementKind]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.element.ElementKind]

}
