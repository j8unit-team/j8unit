package org.j8unit.repository.java.util.function;

import java.util.function.IntConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntConsumerClassTest
implements org.j8unit.repository.java.util.function.IntConsumerClassTests<IntConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.IntConsumer]

    @Override
    public Class<IntConsumer> createNewSUT() {
        return IntConsumer.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.IntConsumer]

}
