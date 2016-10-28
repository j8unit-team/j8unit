package org.j8unit.repository.java.beans;

import java.beans.Transient;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransientClassTest
implements org.j8unit.repository.java.beans.TransientClassTests<Transient> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.Transient]

    @Override
    public Class<Transient> createNewSUT() {
        return Transient.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.Transient]

}
