package org.j8unit.repository.javax.tools;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JavaFileObject} (by simply reusing
 * the J8Unit test interface {@link JavaFileObjectTests}).
 */

@RunWith(J8Unit4.class)
public class JavaFileObjectTest
implements JavaFileObjectTests<JavaFileObject> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.JavaFileObject]

    @Override
    public JavaFileObject createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.JavaFileObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.JavaFileObject]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.JavaFileObject]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Kind} (by simply reusing the
     * J8Unit test interface {@link KindTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class KindTest
    implements KindTests<Kind> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.JavaFileObject$Kind]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Kind.class);
        }

        @Parameter(0)
        public Kind sut;

        @Override
        public Kind createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.JavaFileObject$Kind]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.JavaFileObject$Kind]

    }

}
