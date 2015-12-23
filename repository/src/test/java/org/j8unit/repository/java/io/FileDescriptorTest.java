package org.j8unit.repository.java.io;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class FileDescriptorTest
implements org.j8unit.repository.java.io.FileDescriptorTests<java.io.FileDescriptor> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.io.FileDescriptor.in, //
                                java.io.FileDescriptor.err, //
                                java.io.FileDescriptor.out);
    }

    @Parameter(0)
    public java.io.FileDescriptor sut;

    @Override
    public java.io.FileDescriptor createNewSUT() {
        return this.sut;
    }

}
