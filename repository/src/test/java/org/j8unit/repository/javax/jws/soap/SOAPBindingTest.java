package org.j8unit.repository.javax.jws.soap;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SOAPBinding} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPBindingTest
implements org.j8unit.repository.javax.jws.soap.SOAPBindingTests<SOAPBinding> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPBinding]

    @Override
    public SOAPBinding createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.soap.SOAPBinding], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.soap.SOAPBinding]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.soap.SOAPBinding]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ParameterStyle} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.ParameterStyleTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ParameterStyleTest
    implements ParameterStyleTests<ParameterStyle> {

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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.soap.SOAPBinding$ParameterStyle]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.soap.SOAPBinding$ParameterStyle]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Use} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.UseTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class UseTest
    implements UseTests<Use> {

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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Use]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Use]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Style} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.StyleTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Style]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.soap.SOAPBinding$Style]

    }

}
