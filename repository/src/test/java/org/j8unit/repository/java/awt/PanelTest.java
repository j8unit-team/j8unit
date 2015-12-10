package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PanelTest
implements org.j8unit.repository.java.awt.PanelTests<java.awt.Panel> {

    @Override
    public java.awt.Panel createNewSUT() {
        return new java.awt.Panel();
    }

}
