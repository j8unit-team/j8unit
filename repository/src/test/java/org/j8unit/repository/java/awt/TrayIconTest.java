package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TrayIcon} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.TrayIconTests}).
 */

@RunWith(J8Unit4.class)
public class TrayIconTest
implements TrayIconTests<TrayIcon> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.TrayIcon]

    @Override
    public TrayIcon createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.TrayIcon], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.TrayIcon]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.TrayIcon]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link MessageType} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.java.awt.TrayIconTests.MessageTypeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MessageTypeTest
    implements MessageTypeTests<MessageType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.TrayIcon$MessageType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(MessageType.class);
        }

        @Parameter(0)
        public MessageType sut;

        @Override
        public MessageType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.TrayIcon$MessageType]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.TrayIcon$MessageType]

    }

}
