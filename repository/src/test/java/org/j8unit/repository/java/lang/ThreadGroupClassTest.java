package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadGroupClassTest
implements org.j8unit.repository.java.lang.ThreadGroupClassTests<java.lang.ThreadGroup> {

    @Override
    public Class<java.lang.ThreadGroup> createNewSUT() {
        return java.lang.ThreadGroup.class;
    }

}
