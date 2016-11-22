package org.j8unit.repository.javax.xml.crypto;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.crypto.URIReferenceException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class URIReferenceExceptionTest
implements FactoryBasedJ8UnitTest<URIReferenceException>, URIReferenceExceptionTests<URIReferenceException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.URIReferenceException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(URIReferenceException::new);
    }

    @Parameter(0)
    public Callable<URIReferenceException> sutFactory;

    @Override
    public Callable<URIReferenceException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.URIReferenceException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.URIReferenceException]

}
