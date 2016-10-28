package org.j8unit.repository.javax.management.openmbean;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.management.openmbean.SimpleType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class SimpleTypeTest<T>
implements org.j8unit.repository.javax.management.openmbean.SimpleTypeTests<SimpleType<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.SimpleType]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.SimpleType]

}
