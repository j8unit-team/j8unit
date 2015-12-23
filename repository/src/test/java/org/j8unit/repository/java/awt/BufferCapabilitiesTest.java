package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
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
implements org.j8unit.repository.java.awt.BufferCapabilitiesTests<java.awt.BufferCapabilities> {

    @Override
    public java.awt.BufferCapabilities createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.awt.BufferCapabilities] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FlipContentsTest
    implements org.j8unit.repository.java.awt.BufferCapabilitiesTests.FlipContentsTests<java.awt.BufferCapabilities.FlipContents> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.awt.BufferCapabilities.FlipContents.UNDEFINED, //
                                    java.awt.BufferCapabilities.FlipContents.PRIOR, //
                                    java.awt.BufferCapabilities.FlipContents.COPIED, //
                                    java.awt.BufferCapabilities.FlipContents.BACKGROUND);
        }

        @Parameter(0)
        public java.awt.BufferCapabilities.FlipContents sut;

        @Override
        public java.awt.BufferCapabilities.FlipContents createNewSUT() {
            return this.sut;
        }

    }

}
