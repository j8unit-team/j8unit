package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.lang.ProcessBuilder.Redirect;
import java.lang.ProcessBuilder.Redirect.Type;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ProcessBuilder} (by simply reusing
 * the J8Unit test interface {@link ProcessBuilderTests}).
 */

@RunWith(J8Unit4.class)
public class ProcessBuilderTest
implements ProcessBuilderTests<ProcessBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ProcessBuilder]

    @Override
    public ProcessBuilder createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.ProcessBuilder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.ProcessBuilder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.ProcessBuilder]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Redirect} (by simply reusing the
     * J8Unit test interface {@link RedirectTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class RedirectTest
    implements RedirectTests<Redirect> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ProcessBuilder$Redirect]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(Redirect.INHERIT, //
                                    Redirect.PIPE);
        }

        @Parameter(0)
        public Redirect sut;

        @Override
        public Redirect createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.ProcessBuilder$Redirect]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.ProcessBuilder$Redirect]

        /**
         * Specific JUnit test class to proof the instance relevant aspects of type {@link Type} (by simply reusing the
         * J8Unit test interface {@link org.j8unit.repository.java.lang.ProcessBuilderTests.RedirectTests.TypeTests}).
         */

        @RunWith(J8Parameterized.class)
        @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
        public static class TypeTest
        implements org.j8unit.repository.java.lang.ProcessBuilderTests.RedirectTests.TypeTests<Type> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ProcessBuilder$Redirect$Type]

            @Parameters(name = "{index}: {0}")
            public static Iterable<Object[]> sutData() {
                return testParametersOfEnumClass(Type.class);
            }

            @Parameter(0)
            public Type sut;

            @Override
            public Type createNewSUT() {
                return this.sut;
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.ProcessBuilder$Redirect$Type]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.ProcessBuilder$Redirect$Type]

        }

    }

}
