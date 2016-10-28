package org.j8unit.repository.java.nio;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.ByteOrder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ByteOrderTest
implements org.j8unit.repository.java.nio.ByteOrderTests<ByteOrder> {

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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.ByteOrder]

}
