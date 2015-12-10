package org.j8unit.repository.java.awt.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PageFormatTest
implements org.j8unit.repository.java.awt.print.PageFormatTests<java.awt.print.PageFormat> {

    @Override
    public java.awt.print.PageFormat createNewSUT() {
        return new java.awt.print.PageFormat();
    }

}
