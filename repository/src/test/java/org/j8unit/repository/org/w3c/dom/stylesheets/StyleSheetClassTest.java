package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StyleSheetClassTest
implements org.j8unit.repository.org.w3c.dom.stylesheets.StyleSheetClassTests<org.w3c.dom.stylesheets.StyleSheet> {

    @Override
    public Class<org.w3c.dom.stylesheets.StyleSheet> createNewSUT() {
        return org.w3c.dom.stylesheets.StyleSheet.class;
    }

}
