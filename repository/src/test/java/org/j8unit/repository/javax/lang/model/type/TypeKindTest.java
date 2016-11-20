package org.j8unit.repository.javax.lang.model.type;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.lang.model.type.TypeKind;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TypeKind} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.TypeKindTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TypeKindTest
implements TypeKindTests<TypeKind> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.TypeKind]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOfEnumClass(TypeKind.class);
    }

    @Parameter(0)
    public TypeKind sut;

    @Override
    public TypeKind createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.type.TypeKind]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.type.TypeKind]

}
