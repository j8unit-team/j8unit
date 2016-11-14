package org.j8unit.repository.javax.print;

import javax.print.ServiceUIFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ServiceUIFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.ServiceUIFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class ServiceUIFactoryTest
implements ServiceUIFactoryTests<ServiceUIFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.ServiceUIFactory]

    @Override
    public ServiceUIFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.ServiceUIFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.ServiceUIFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.ServiceUIFactory]

}
