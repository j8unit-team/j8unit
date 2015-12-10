package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class WindowTest
implements org.j8unit.repository.java.awt.WindowTests<java.awt.Window> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TypeTest
    implements org.j8unit.repository.java.awt.WindowTests.TypeTests<java.awt.Window.Type> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.awt.Window.Type.class);
        }

        @Parameter(0)
        public java.awt.Window.Type sut;

        @Override
        public java.awt.Window.Type createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public java.awt.Window createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.awt.Window] available.");
    }

}
