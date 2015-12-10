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
public class DesktopTest
implements org.j8unit.repository.java.awt.DesktopTests<java.awt.Desktop> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ActionTest
    implements org.j8unit.repository.java.awt.DesktopTests.ActionTests<java.awt.Desktop.Action> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.awt.Desktop.Action.class);
        }

        @Parameter(0)
        public java.awt.Desktop.Action sut;

        @Override
        public java.awt.Desktop.Action createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public java.awt.Desktop createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.awt.Desktop] available.");
    }

}
