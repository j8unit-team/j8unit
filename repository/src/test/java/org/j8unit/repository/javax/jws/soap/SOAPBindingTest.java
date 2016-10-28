package org.j8unit.repository.javax.jws.soap;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import org.j8unit.runners.J8Unit4;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class SOAPBindingTest
implements org.j8unit.repository.javax.jws.soap.SOAPBindingTests<SOAPBinding> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding]

    @Override
    public SOAPBinding createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.soap.SOAPBinding], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding]

    @RunWith(J8Unit4.class)
    public static class ParameterStyleTest
    implements org.j8unit.repository.javax.jws.soap.SOAPBindingTests.ParameterStyleTests<ParameterStyle> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding$ParameterStyle]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(ParameterStyle.class);
        }

        @Parameter(0)
        public ParameterStyle sut;

        @Override
        public ParameterStyle createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding$ParameterStyle]

    }

    @RunWith(J8Unit4.class)
    public static class StyleTest
    implements org.j8unit.repository.javax.jws.soap.SOAPBindingTests.StyleTests<Style> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Style]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOfEnumClass(Style.class);
        }

        @Parameter(0)
        public Style sut;

        @Override
        public Style createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Style]

    }

    @RunWith(J8Unit4.class)
    public static class UseTest
    implements org.j8unit.repository.javax.jws.soap.SOAPBindingTests.UseTests<Use> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Use]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOfEnumClass(Use.class);
        }

        @Parameter(0)
        public Use sut;

        @Override
        public Use createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Use]

    }

}
