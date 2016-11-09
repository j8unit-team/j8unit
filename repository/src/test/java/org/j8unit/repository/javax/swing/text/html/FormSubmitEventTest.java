package org.j8unit.repository.javax.swing.text.html;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.swing.text.html.FormSubmitEvent;
import javax.swing.text.html.FormSubmitEvent.MethodType;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FormSubmitEvent} (by simply reusing
 * the J8Unit test interface {@link FormSubmitEventTests}).
 */

@RunWith(J8Unit4.class)
public class FormSubmitEventTest
implements FormSubmitEventTests<FormSubmitEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.FormSubmitEvent]

    @Override
    public FormSubmitEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.FormSubmitEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.FormSubmitEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.FormSubmitEvent]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link MethodType} (by simply reusing
     * the J8Unit test interface {@link MethodTypeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MethodTypeTest
    implements MethodTypeTests<MethodType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.FormSubmitEvent$MethodType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(MethodType.class);
        }

        @Parameter(0)
        public MethodType sut;

        @Override
        public MethodType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.FormSubmitEvent$MethodType]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.FormSubmitEvent$MethodType]

    }

}
