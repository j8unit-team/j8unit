package org.j8unit.repository.javax.activation;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.activation.MimeType;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MimeTypeTest
implements FactoryBasedJ8UnitTest<MimeType>, MimeTypeTests<MimeType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.MimeType]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(MimeType::new);
    }

    @Parameter(0)
    public Callable<MimeType> sutFactory;

    @Override
    public Callable<MimeType> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.activation.MimeType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.activation.MimeType]

}
