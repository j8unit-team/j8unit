package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextFieldTest
implements org.j8unit.repository.java.awt.TextFieldTests<java.awt.TextField> {

    @Override
    public java.awt.TextField createNewSUT() {
        return new java.awt.TextField();
    }

}
