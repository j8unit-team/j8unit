package org.j8unit.repository.javax.management.openmbean;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.management.openmbean.SimpleType;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SimpleType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.openmbean.SimpleTypeTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SimpleTypeTest<T>
implements SimpleTypeTests<SimpleType<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.SimpleType]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SimpleType.OBJECTNAME, //
                                SimpleType.FLOAT, //
                                SimpleType.SHORT, //
                                SimpleType.BIGDECIMAL, //
                                SimpleType.BOOLEAN, //
                                SimpleType.BYTE, //
                                SimpleType.DATE, //
                                SimpleType.INTEGER, //
                                SimpleType.LONG, //
                                SimpleType.VOID, //
                                SimpleType.DOUBLE, //
                                SimpleType.CHARACTER, //
                                SimpleType.STRING, //
                                SimpleType.BIGINTEGER);
    }

    @Parameter(0)
    public SimpleType<T> sut;

    @Override
    public SimpleType<T> createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.SimpleType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.SimpleType]

}
