package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CSSStyleSheetClassTest
implements org.j8unit.repository.org.w3c.dom.css.CSSStyleSheetClassTests<org.w3c.dom.css.CSSStyleSheet> {

    @Override
    public Class<org.w3c.dom.css.CSSStyleSheet> createNewSUT() {
        return org.w3c.dom.css.CSSStyleSheet.class;
    }

}
