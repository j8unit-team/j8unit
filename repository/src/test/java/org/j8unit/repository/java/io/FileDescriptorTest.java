package org.j8unit.repository.java.io;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.io.FileDescriptor;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileDescriptor} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.io.FileDescriptorTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class FileDescriptorTest
implements FileDescriptorTests<FileDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FileDescriptor]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(FileDescriptor.in, //
                                FileDescriptor.err, //
                                FileDescriptor.out);
    }

    @Parameter(0)
    public FileDescriptor sut;

    @Override
    public FileDescriptor createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.FileDescriptor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.FileDescriptor]

}
