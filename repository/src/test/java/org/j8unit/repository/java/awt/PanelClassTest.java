package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PanelClassTest
implements org.j8unit.repository.java.awt.PanelClassTests<java.awt.Panel> {

    @Override
    public Class<java.awt.Panel> createNewSUT() {
        return java.awt.Panel.class;
    }

}
