package org.j8unit.repository.java.awt.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PaperTest
implements org.j8unit.repository.java.awt.print.PaperTests<java.awt.print.Paper> {

    @Override
    public java.awt.print.Paper createNewSUT() {
        return new java.awt.print.Paper();
    }

}
