package org.j8unit.repository.java.util.function;

import java.util.function.ObjDoubleConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjDoubleConsumer} (by simply reusing the
 * J8Unit test interface {@link ObjDoubleConsumerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ObjDoubleConsumerClassTest
implements ObjDoubleConsumerClassTests<ObjDoubleConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.ObjDoubleConsumer]

    @Override
    public Class<ObjDoubleConsumer> createNewSUT() {
        return ObjDoubleConsumer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.ObjDoubleConsumer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.ObjDoubleConsumer]

}
