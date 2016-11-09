package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.DomHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DomHandler} (by simply reusing the J8Unit
 * test interface {@link DomHandlerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DomHandlerClassTest
implements DomHandlerClassTests<DomHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.DomHandler]

    @Override
    public Class<DomHandler> createNewSUT() {
        return DomHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.DomHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.DomHandler]

}
