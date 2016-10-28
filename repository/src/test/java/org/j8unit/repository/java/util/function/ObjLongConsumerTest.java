package org.j8unit.repository.java.util.function;

import java.util.function.ObjLongConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjLongConsumerTest<T>
implements org.j8unit.repository.java.util.function.ObjLongConsumerTests<ObjLongConsumer<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ObjLongConsumer]

    @Override
    public ObjLongConsumer<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.ObjLongConsumer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ObjLongConsumer]

}
