package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ButtonTest
implements org.j8unit.repository.java.awt.ButtonTests<java.awt.Button> {

    @Override
    public java.awt.Button createNewSUT() {
        return new java.awt.Button();
    }

}
