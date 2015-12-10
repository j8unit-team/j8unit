package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScrollbarClassTest
implements org.j8unit.repository.java.awt.ScrollbarClassTests<java.awt.Scrollbar> {

    @Override
    public Class<java.awt.Scrollbar> createNewSUT() {
        return java.awt.Scrollbar.class;
    }

}
