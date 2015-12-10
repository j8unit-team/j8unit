package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProcessClassTest
implements org.j8unit.repository.java.lang.ProcessClassTests<java.lang.Process> {

    @Override
    public Class<java.lang.Process> createNewSUT() {
        return java.lang.Process.class;
    }

}
