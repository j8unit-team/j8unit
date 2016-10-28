package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXAddressable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXAddressableTest
implements org.j8unit.repository.javax.management.remote.JMXAddressableTests<JMXAddressable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXAddressable]

    @Override
    public JMXAddressable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.JMXAddressable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXAddressable]

}
