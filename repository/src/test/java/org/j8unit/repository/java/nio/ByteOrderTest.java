package org.j8unit.repository.java.nio;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.ByteOrder;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ByteOrder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.ByteOrderTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ByteOrderTest
implements ByteOrderTests<ByteOrder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.ByteOrder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ByteOrder.BIG_ENDIAN, //
                                ByteOrder.LITTLE_ENDIAN);
    }

    @Parameter(0)
    public ByteOrder sut;

    @Override
    public ByteOrder createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.ByteOrder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.ByteOrder]

}
