package org.j8unit.repository.java.awt.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PageFormatClassTest
implements org.j8unit.repository.java.awt.print.PageFormatClassTests<java.awt.print.PageFormat> {

    @Override
    public Class<java.awt.print.PageFormat> createNewSUT() {
        return java.awt.print.PageFormat.class;
    }

}
