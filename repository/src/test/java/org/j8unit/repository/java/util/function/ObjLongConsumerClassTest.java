package org.j8unit.repository.java.util.function;

import java.util.function.ObjLongConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjLongConsumer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.ObjLongConsumerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ObjLongConsumerClassTest
implements ObjLongConsumerClassTests<ObjLongConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.ObjLongConsumer]

    @Override
    public Class<ObjLongConsumer> createNewSUT() {
        return ObjLongConsumer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.ObjLongConsumer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.ObjLongConsumer]

}
