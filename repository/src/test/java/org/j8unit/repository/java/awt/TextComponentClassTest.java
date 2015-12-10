package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextComponentClassTest
implements org.j8unit.repository.java.awt.TextComponentClassTests<java.awt.TextComponent> {

    @Override
    public Class<java.awt.TextComponent> createNewSUT() {
        return java.awt.TextComponent.class;
    }

}
