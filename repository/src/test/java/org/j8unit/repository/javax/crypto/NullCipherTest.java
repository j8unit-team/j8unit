package org.j8unit.repository.javax.crypto;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.crypto.NullCipher;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NullCipherTest
implements FactoryBasedJ8UnitTest<NullCipher>, NullCipherTests<NullCipher> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.NullCipher]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(NullCipher::new);
    }

    @Parameter(0)
    public Callable<NullCipher> sutFactory;

    @Override
    public Callable<NullCipher> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.NullCipher]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.NullCipher]

}
