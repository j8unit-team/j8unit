package org.j8unit.repository.javax.xml.validation;

import javax.xml.validation.ValidatorHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValidatorHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.validation.ValidatorHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValidatorHandlerClassTest
implements ValidatorHandlerClassTests<ValidatorHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.validation.ValidatorHandler]

    @Override
    public Class<ValidatorHandler> createNewSUT() {
        return ValidatorHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.validation.ValidatorHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.validation.ValidatorHandler]

}
