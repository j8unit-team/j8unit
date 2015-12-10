package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransparencyClassTest
implements org.j8unit.repository.java.awt.TransparencyClassTests<java.awt.Transparency> {

    @Override
    public Class<java.awt.Transparency> createNewSUT() {
        return java.awt.Transparency.class;
    }

}
