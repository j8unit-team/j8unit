package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ViewCSSClassTest
implements org.j8unit.repository.org.w3c.dom.css.ViewCSSClassTests<org.w3c.dom.css.ViewCSS> {

    @Override
    public Class<org.w3c.dom.css.ViewCSS> createNewSUT() {
        return org.w3c.dom.css.ViewCSS.class;
    }

}
