package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.ManagerFactoryParameters;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ManagerFactoryParameters} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.ManagerFactoryParametersTests}).
 */

@RunWith(J8Unit4.class)
public class ManagerFactoryParametersTest
implements ManagerFactoryParametersTests<ManagerFactoryParameters> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.ManagerFactoryParameters]

    @Override
    public ManagerFactoryParameters createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.ManagerFactoryParameters], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.ManagerFactoryParameters]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.ManagerFactoryParameters]

}
