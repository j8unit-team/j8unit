package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FontClassTest
implements org.j8unit.repository.java.awt.FontClassTests<java.awt.Font> {

    @Override
    public Class<java.awt.Font> createNewSUT() {
        return java.awt.Font.class;
    }

}
