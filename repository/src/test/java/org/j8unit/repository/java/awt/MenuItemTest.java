package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MenuItemTest
implements org.j8unit.repository.java.awt.MenuItemTests<java.awt.MenuItem> {

    @Override
    public java.awt.MenuItem createNewSUT() {
        return new java.awt.MenuItem();
    }

}
