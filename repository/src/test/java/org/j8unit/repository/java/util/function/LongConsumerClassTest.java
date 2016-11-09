package org.j8unit.repository.java.util.function;

import java.util.function.LongConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LongConsumer} (by simply reusing the
 * J8Unit test interface {@link LongConsumerClassTests}).
 */

@RunWith(J8Unit4.class)
public class LongConsumerClassTest
implements LongConsumerClassTests<LongConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.LongConsumer]

    @Override
    public Class<LongConsumer> createNewSUT() {
        return LongConsumer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.LongConsumer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.LongConsumer]

}
