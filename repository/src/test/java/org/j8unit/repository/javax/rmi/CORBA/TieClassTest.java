package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.Tie;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Tie} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.rmi.CORBA.TieClassTests}).
 */

@RunWith(J8Unit4.class)
public class TieClassTest
implements TieClassTests<Tie> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.CORBA.Tie]

    @Override
    public Class<Tie> createNewSUT() {
        return Tie.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.rmi.CORBA.Tie]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.CORBA.Tie]

}
