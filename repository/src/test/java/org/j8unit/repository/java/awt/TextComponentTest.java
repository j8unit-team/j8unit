package org.j8unit.repository.java.awt;

import java.awt.TextComponent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextComponentTest
implements org.j8unit.repository.java.awt.TextComponentTests<TextComponent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.TextComponent]

    @Override
    public TextComponent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.TextComponent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.TextComponent]

}
