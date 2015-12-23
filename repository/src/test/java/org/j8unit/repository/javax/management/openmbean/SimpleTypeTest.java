package org.j8unit.repository.javax.management.openmbean;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SimpleTypeTest<T>
implements org.j8unit.repository.javax.management.openmbean.SimpleTypeTests<javax.management.openmbean.SimpleType<T>, T> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.management.openmbean.SimpleType.OBJECTNAME, //
                                javax.management.openmbean.SimpleType.FLOAT, //
                                javax.management.openmbean.SimpleType.SHORT, //
                                javax.management.openmbean.SimpleType.BIGDECIMAL, //
                                javax.management.openmbean.SimpleType.BOOLEAN, //
                                javax.management.openmbean.SimpleType.BYTE, //
                                javax.management.openmbean.SimpleType.DATE, //
                                javax.management.openmbean.SimpleType.INTEGER, //
                                javax.management.openmbean.SimpleType.LONG, //
                                javax.management.openmbean.SimpleType.VOID, //
                                javax.management.openmbean.SimpleType.DOUBLE, //
                                javax.management.openmbean.SimpleType.CHARACTER, //
                                javax.management.openmbean.SimpleType.STRING, //
                                javax.management.openmbean.SimpleType.BIGINTEGER);
    }

    @Parameter(0)
    public javax.management.openmbean.SimpleType<T> sut;

    @Override
    public javax.management.openmbean.SimpleType<T> createNewSUT() {
        return this.sut;
    }

}
