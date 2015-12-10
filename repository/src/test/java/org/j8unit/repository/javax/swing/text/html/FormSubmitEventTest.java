package org.j8unit.repository.javax.swing.text.html;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class FormSubmitEventTest
implements org.j8unit.repository.javax.swing.text.html.FormSubmitEventTests<javax.swing.text.html.FormSubmitEvent> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MethodTypeTest
    implements org.j8unit.repository.javax.swing.text.html.FormSubmitEventTests.MethodTypeTests<javax.swing.text.html.FormSubmitEvent.MethodType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(javax.swing.text.html.FormSubmitEvent.MethodType.class);
        }

        @Parameter(0)
        public javax.swing.text.html.FormSubmitEvent.MethodType sut;

        @Override
        public javax.swing.text.html.FormSubmitEvent.MethodType createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public javax.swing.text.html.FormSubmitEvent createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.swing.text.html.FormSubmitEvent] available.");
    }

}
