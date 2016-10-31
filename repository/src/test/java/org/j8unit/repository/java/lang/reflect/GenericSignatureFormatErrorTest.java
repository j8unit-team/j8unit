package org.j8unit.repository.java.lang.reflect;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.lang.reflect.GenericSignatureFormatError;
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
public class GenericSignatureFormatErrorTest
implements FactoryBasedJ8UnitTest<GenericSignatureFormatError>,
org.j8unit.repository.java.lang.reflect.GenericSignatureFormatErrorTests<GenericSignatureFormatError> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.GenericSignatureFormatError]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(GenericSignatureFormatError::new);
    }

    @Parameter(0)
    public Callable<GenericSignatureFormatError> sutFactory;

    @Override
    public Callable<GenericSignatureFormatError> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.GenericSignatureFormatError]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.GenericSignatureFormatError]

}
