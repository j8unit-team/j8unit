package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.ErrorListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ErrorListener} (by simply reusing the
 * J8Unit test interface {@link ErrorListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ErrorListenerClassTest
implements ErrorListenerClassTests<ErrorListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.ErrorListener]

    @Override
    public Class<ErrorListener> createNewSUT() {
        return ErrorListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.ErrorListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.ErrorListener]

}
