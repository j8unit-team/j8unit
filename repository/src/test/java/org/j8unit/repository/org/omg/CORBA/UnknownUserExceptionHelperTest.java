package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.UnknownUserExceptionHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UnknownUserExceptionHelper} (by
 * simply reusing the J8Unit test interface {@link UnknownUserExceptionHelperTests}).
 */

@RunWith(J8Unit4.class)
public class UnknownUserExceptionHelperTest
implements UnknownUserExceptionHelperTests<UnknownUserExceptionHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.UnknownUserExceptionHelper]

    @Override
    public UnknownUserExceptionHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.UnknownUserExceptionHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.UnknownUserExceptionHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.UnknownUserExceptionHelper]

}
