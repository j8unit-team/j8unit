package org.j8unit.repository.java.nio.file;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class StandardCopyOptionTest
implements org.j8unit.repository.java.nio.file.StandardCopyOptionTests<java.nio.file.StandardCopyOption> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.nio.file.StandardCopyOption.class);
    }

    @Parameter(0)
    public java.nio.file.StandardCopyOption sut;

    @Override
    public java.nio.file.StandardCopyOption createNewSUT() {
        return this.sut;
    }

}
