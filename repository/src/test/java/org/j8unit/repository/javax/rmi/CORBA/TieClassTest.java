package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.Tie;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TieClassTest
implements org.j8unit.repository.javax.rmi.CORBA.TieClassTests<Tie> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.CORBA.Tie]

    @Override
    public Class<Tie> createNewSUT() {
        return Tie.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.CORBA.Tie]

}
