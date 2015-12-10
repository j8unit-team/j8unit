package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MenuClassTest
implements org.j8unit.repository.java.awt.MenuClassTests<java.awt.Menu> {

    @Override
    public Class<java.awt.Menu> createNewSUT() {
        return java.awt.Menu.class;
    }

}
