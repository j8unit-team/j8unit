package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.stylesheets.StyleSheet;

@RunWith(J8Unit4.class)
public class StyleSheetClassTest
implements org.j8unit.repository.org.w3c.dom.stylesheets.StyleSheetClassTests<StyleSheet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.stylesheets.StyleSheet]

    @Override
    public Class<StyleSheet> createNewSUT() {
        return StyleSheet.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.stylesheets.StyleSheet]

}
