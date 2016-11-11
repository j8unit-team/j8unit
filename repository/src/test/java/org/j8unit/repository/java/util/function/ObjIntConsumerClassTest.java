package org.j8unit.repository.java.util.function;

import java.util.function.ObjIntConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjIntConsumer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.ObjIntConsumerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ObjIntConsumerClassTest
implements ObjIntConsumerClassTests<ObjIntConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.ObjIntConsumer]

    @Override
    public Class<ObjIntConsumer> createNewSUT() {
        return ObjIntConsumer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.ObjIntConsumer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.ObjIntConsumer]

}
