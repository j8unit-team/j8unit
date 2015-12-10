package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToolkitClassTest
implements org.j8unit.repository.java.awt.ToolkitClassTests<java.awt.Toolkit> {

    @Override
    public Class<java.awt.Toolkit> createNewSUT() {
        return java.awt.Toolkit.class;
    }

}
