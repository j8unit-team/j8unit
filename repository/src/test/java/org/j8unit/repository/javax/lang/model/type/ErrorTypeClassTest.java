package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.ErrorType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ErrorType} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.lang.model.type.ErrorTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class ErrorTypeClassTest
implements ErrorTypeClassTests<ErrorType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.ErrorType]

    @Override
    public Class<ErrorType> createNewSUT() {
        return ErrorType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.ErrorType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.ErrorType]

}
