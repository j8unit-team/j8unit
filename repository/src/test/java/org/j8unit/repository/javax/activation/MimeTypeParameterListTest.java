package org.j8unit.repository.javax.activation;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.activation.MimeTypeParameterList;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MimeTypeParameterListTest
implements FactoryBasedJ8UnitTest<MimeTypeParameterList>, org.j8unit.repository.javax.activation.MimeTypeParameterListTests<MimeTypeParameterList> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.MimeTypeParameterList]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MimeTypeParameterList::new);
    }

    @Parameter(0)
    public Callable<MimeTypeParameterList> sutFactory;

    @Override
    public Callable<MimeTypeParameterList> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.MimeTypeParameterList]

}
