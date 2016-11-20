package org.j8unit.repository.java.nio.file;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.file.FileSystemNotFoundException;
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
public class FileSystemNotFoundExceptionTest
implements FactoryBasedJ8UnitTest<FileSystemNotFoundException>, FileSystemNotFoundExceptionTests<FileSystemNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileSystemNotFoundException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(FileSystemNotFoundException::new);
    }

    @Parameter(0)
    public Callable<FileSystemNotFoundException> sutFactory;

    @Override
    public Callable<FileSystemNotFoundException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.FileSystemNotFoundException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.FileSystemNotFoundException]

}
