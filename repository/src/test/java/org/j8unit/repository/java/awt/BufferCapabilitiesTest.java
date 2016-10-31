package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.BufferCapabilities;
import java.awt.BufferCapabilities.FlipContents;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class BufferCapabilitiesTest
implements org.j8unit.repository.java.awt.BufferCapabilitiesTests<BufferCapabilities> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.BufferCapabilities]

    @Override
    public BufferCapabilities createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.BufferCapabilities], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.BufferCapabilities]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.BufferCapabilities]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FlipContentsTest
    implements org.j8unit.repository.java.awt.BufferCapabilitiesTests.FlipContentsTests<FlipContents> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.BufferCapabilities$FlipContents]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(FlipContents.UNDEFINED, //
                                    FlipContents.PRIOR, //
                                    FlipContents.COPIED, //
                                    FlipContents.BACKGROUND);
        }

        @Parameter(0)
        public FlipContents sut;

        @Override
        public FlipContents createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.BufferCapabilities$FlipContents]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.BufferCapabilities$FlipContents]

    }

}
