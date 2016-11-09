package org.j8unit.repository.javax.rmi.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.rmi.CORBA.ClassDesc;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ClassDescTest
implements FactoryBasedJ8UnitTest<ClassDesc>, ClassDescTests<ClassDesc> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.CORBA.ClassDesc]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ClassDesc::new);
    }

    @Parameter(0)
    public Callable<ClassDesc> sutFactory;

    @Override
    public Callable<ClassDesc> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.rmi.CORBA.ClassDesc]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.rmi.CORBA.ClassDesc]

}
