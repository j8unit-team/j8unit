package org.j8unit.repository.javax.management;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.management.ImmutableDescriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ImmutableDescriptorTest
implements org.j8unit.repository.javax.management.ImmutableDescriptorTests<ImmutableDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.ImmutableDescriptor]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ImmutableDescriptor.EMPTY_DESCRIPTOR);
    }

    @Parameter(0)
    public ImmutableDescriptor sut;

    @Override
    public ImmutableDescriptor createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.ImmutableDescriptor]

}
