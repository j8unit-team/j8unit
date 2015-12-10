package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PaintClassTest
implements org.j8unit.repository.java.awt.PaintClassTests<java.awt.Paint> {

    @Override
    public Class<java.awt.Paint> createNewSUT() {
        return java.awt.Paint.class;
    }

}
