package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScrollPaneTest
implements org.j8unit.repository.java.awt.ScrollPaneTests<java.awt.ScrollPane> {

    @Override
    public java.awt.ScrollPane createNewSUT() {
        return new java.awt.ScrollPane();
    }

}
