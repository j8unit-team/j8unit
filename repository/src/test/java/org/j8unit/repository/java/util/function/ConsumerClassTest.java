package org.j8unit.repository.java.util.function;

import java.util.function.Consumer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Consumer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.function.ConsumerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConsumerClassTest
implements ConsumerClassTests<Consumer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.Consumer]

    @Override
    public Class<Consumer> createNewSUT() {
        return Consumer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.Consumer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.Consumer]

}
