package org.j8unit.repository.javax.activation;

import javax.activation.DataContentHandlerFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DataContentHandlerFactory} (by simply
 * reusing the J8Unit test interface {@link DataContentHandlerFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class DataContentHandlerFactoryClassTest
implements DataContentHandlerFactoryClassTests<DataContentHandlerFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.DataContentHandlerFactory]

    @Override
    public Class<DataContentHandlerFactory> createNewSUT() {
        return DataContentHandlerFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.DataContentHandlerFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.DataContentHandlerFactory]

}
