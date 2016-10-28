package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ExcC14NParameterSpecTest
implements FactoryBasedJ8UnitTest<ExcC14NParameterSpec>, org.j8unit.repository.javax.xml.crypto.dsig.spec.ExcC14NParameterSpecTests<ExcC14NParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.spec.ExcC14NParameterSpec]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ExcC14NParameterSpec::new);
    }

    @Parameter(0)
    public Callable<ExcC14NParameterSpec> sutFactory;

    @Override
    public Callable<ExcC14NParameterSpec> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.spec.ExcC14NParameterSpec]

}
