package org.j8unit.repository.java.util.function;

import java.util.function.IntConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IntConsumer} (by simply reusing the
 * J8Unit test interface {@link IntConsumerClassTests}).
 */

@RunWith(J8Unit4.class)
public class IntConsumerClassTest
implements IntConsumerClassTests<IntConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.IntConsumer]

    @Override
    public Class<IntConsumer> createNewSUT() {
        return IntConsumer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.IntConsumer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.IntConsumer]

}
