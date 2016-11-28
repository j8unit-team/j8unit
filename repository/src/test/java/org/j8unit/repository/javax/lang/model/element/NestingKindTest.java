package org.j8unit.repository.javax.lang.model.element;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.lang.model.element.NestingKind;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NestingKind} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.element.NestingKindTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NestingKindTest
implements NestingKindTests<NestingKind> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.NestingKind]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOfEnumClass(NestingKind.class);
    }

    @Parameter(0)
    public NestingKind sut;

    @Override
    public NestingKind createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.element.NestingKind]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.element.NestingKind]

}
