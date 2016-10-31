package org.j8unit.repository.javax.xml.crypto.dsig;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.crypto.dsig.TransformException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TransformExceptionTest
implements FactoryBasedJ8UnitTest<TransformException>, org.j8unit.repository.javax.xml.crypto.dsig.TransformExceptionTests<TransformException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.TransformException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TransformException::new);
    }

    @Parameter(0)
    public Callable<TransformException> sutFactory;

    @Override
    public Callable<TransformException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.TransformException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.TransformException]

}
