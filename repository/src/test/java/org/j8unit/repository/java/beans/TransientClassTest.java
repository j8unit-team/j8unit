package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransientClassTest
implements org.j8unit.repository.java.beans.TransientClassTests<java.beans.Transient> {

    @Override
    public Class<java.beans.Transient> createNewSUT() {
        return java.beans.Transient.class;
    }

}
