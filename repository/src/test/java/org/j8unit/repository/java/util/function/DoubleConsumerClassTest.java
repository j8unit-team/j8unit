package org.j8unit.repository.java.util.function;

import java.util.function.DoubleConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DoubleConsumer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.DoubleConsumerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DoubleConsumerClassTest
implements DoubleConsumerClassTests<DoubleConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.DoubleConsumer]

    @Override
    public Class<DoubleConsumer> createNewSUT() {
        return DoubleConsumer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.DoubleConsumer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.DoubleConsumer]

}
