package org.j8unit.repository.javax.lang.model;

import javax.lang.model.UnknownEntityException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnknownEntityException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.UnknownEntityExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnknownEntityExceptionClassTest
implements UnknownEntityExceptionClassTests<UnknownEntityException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.UnknownEntityException]

    @Override
    public Class<UnknownEntityException> createNewSUT() {
        return UnknownEntityException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.UnknownEntityException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.UnknownEntityException]

}
