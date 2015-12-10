package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MouseInfoClassTest
implements org.j8unit.repository.java.awt.MouseInfoClassTests<java.awt.MouseInfo> {

    @Override
    public Class<java.awt.MouseInfo> createNewSUT() {
        return java.awt.MouseInfo.class;
    }

}
