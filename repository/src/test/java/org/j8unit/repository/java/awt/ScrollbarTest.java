package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScrollbarTest
implements org.j8unit.repository.java.awt.ScrollbarTests<java.awt.Scrollbar> {

    @Override
    public java.awt.Scrollbar createNewSUT() {
        return new java.awt.Scrollbar();
    }

}
