package org.j8unit.repository.java.awt;

import java.awt.TextComponent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TextComponent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.TextComponentClassTests}).
 */

@RunWith(J8Unit4.class)
public class TextComponentClassTest
implements TextComponentClassTests<TextComponent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.TextComponent]

    @Override
    public Class<TextComponent> createNewSUT() {
        return TextComponent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.TextComponent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.TextComponent]

}
