package org.j8unit.repository.javax.activation;

import javax.activation.DataContentHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DataContentHandler} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.activation.DataContentHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class DataContentHandlerClassTest
implements DataContentHandlerClassTests<DataContentHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.DataContentHandler]

    @Override
    public Class<DataContentHandler> createNewSUT() {
        return DataContentHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.DataContentHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.DataContentHandler]

}
