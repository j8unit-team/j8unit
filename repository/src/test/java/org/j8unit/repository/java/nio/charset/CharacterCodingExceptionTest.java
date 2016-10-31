package org.j8unit.repository.java.nio.charset;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.charset.CharacterCodingException;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CharacterCodingExceptionTest
implements FactoryBasedJ8UnitTest<CharacterCodingException>, org.j8unit.repository.java.nio.charset.CharacterCodingExceptionTests<CharacterCodingException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.CharacterCodingException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CharacterCodingException::new);
    }

    @Parameter(0)
    public Callable<CharacterCodingException> sutFactory;

    @Override
    public Callable<CharacterCodingException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.CharacterCodingException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.CharacterCodingException]

}
