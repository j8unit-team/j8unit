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
public class FileVisitOptionTest
implements org.j8unit.repository.java.nio.file.FileVisitOptionTests<java.nio.file.FileVisitOption> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.nio.file.FileVisitOption.class);
    }

    @Parameter(0)
    public java.nio.file.FileVisitOption sut;

    @Override
    public java.nio.file.FileVisitOption createNewSUT() {
        return this.sut;
    }

}
