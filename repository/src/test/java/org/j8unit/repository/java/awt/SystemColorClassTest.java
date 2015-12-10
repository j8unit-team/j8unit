package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SystemColorClassTest
implements org.j8unit.repository.java.awt.SystemColorClassTests<java.awt.SystemColor> {

    @Override
    public Class<java.awt.SystemColor> createNewSUT() {
        return java.awt.SystemColor.class;
    }

}
