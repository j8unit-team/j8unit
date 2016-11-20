package org.j8unit.repository.javax.xml.crypto;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.crypto.NoSuchMechanismException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NoSuchMechanismExceptionTest
implements FactoryBasedJ8UnitTest<NoSuchMechanismException>, NoSuchMechanismExceptionTests<NoSuchMechanismException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.NoSuchMechanismException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(NoSuchMechanismException::new);
    }

    @Parameter(0)
    public Callable<NoSuchMechanismException> sutFactory;

    @Override
    public Callable<NoSuchMechanismException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.NoSuchMechanismException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.NoSuchMechanismException]

}
