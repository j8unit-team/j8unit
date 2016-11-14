package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.stylesheets.StyleSheet;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StyleSheet} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.stylesheets.StyleSheetClassTests}).
 */

@RunWith(J8Unit4.class)
public class StyleSheetClassTest
implements StyleSheetClassTests<StyleSheet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.stylesheets.StyleSheet]

    @Override
    public Class<StyleSheet> createNewSUT() {
        return StyleSheet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.stylesheets.StyleSheet]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.stylesheets.StyleSheet]

}
