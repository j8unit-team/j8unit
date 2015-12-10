package org.j8unit.repository.javax.lang.model.type;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TypeKindTest
implements org.j8unit.repository.javax.lang.model.type.TypeKindTests<javax.lang.model.type.TypeKind> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(javax.lang.model.type.TypeKind.class);
    }

    @Parameter(0)
    public javax.lang.model.type.TypeKind sut;

    @Override
    public javax.lang.model.type.TypeKind createNewSUT() {
        return this.sut;
    }

}
