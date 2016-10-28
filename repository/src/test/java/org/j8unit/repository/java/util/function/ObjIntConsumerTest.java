package org.j8unit.repository.java.util.function;

import java.util.function.ObjIntConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjIntConsumerTest<T>
implements org.j8unit.repository.java.util.function.ObjIntConsumerTests<ObjIntConsumer<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ObjIntConsumer]

    @Override
    public ObjIntConsumer<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.ObjIntConsumer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ObjIntConsumer]

}
