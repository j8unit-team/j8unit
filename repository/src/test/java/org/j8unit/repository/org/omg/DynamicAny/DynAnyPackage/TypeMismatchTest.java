package org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.DynamicAny.DynAnyPackage.TypeMismatch;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TypeMismatchTest
implements FactoryBasedJ8UnitTest<TypeMismatch>, org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage.TypeMismatchTests<TypeMismatch> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.DynAnyPackage.TypeMismatch]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TypeMismatch::new);
    }

    @Parameter(0)
    public Callable<TypeMismatch> sutFactory;

    @Override
    public Callable<TypeMismatch> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.DynAnyPackage.TypeMismatch]

}
