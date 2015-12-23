package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class TrayIconTest
implements org.j8unit.repository.java.awt.TrayIconTests<java.awt.TrayIcon> {

    @Override
    public java.awt.TrayIcon createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.awt.TrayIcon] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MessageTypeTest
    implements org.j8unit.repository.java.awt.TrayIconTests.MessageTypeTests<java.awt.TrayIcon.MessageType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.awt.TrayIcon.MessageType.class);
        }

        @Parameter(0)
        public java.awt.TrayIcon.MessageType sut;

        @Override
        public java.awt.TrayIcon.MessageType createNewSUT() {
            return this.sut;
        }

    }

}
