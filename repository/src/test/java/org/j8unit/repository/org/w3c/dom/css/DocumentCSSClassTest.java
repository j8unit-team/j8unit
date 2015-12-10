package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentCSSClassTest
implements org.j8unit.repository.org.w3c.dom.css.DocumentCSSClassTests<org.w3c.dom.css.DocumentCSS> {

    @Override
    public Class<org.w3c.dom.css.DocumentCSS> createNewSUT() {
        return org.w3c.dom.css.DocumentCSS.class;
    }

}
