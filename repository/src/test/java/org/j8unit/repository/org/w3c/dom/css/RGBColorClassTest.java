package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RGBColorClassTest
implements org.j8unit.repository.org.w3c.dom.css.RGBColorClassTests<org.w3c.dom.css.RGBColor> {

    @Override
    public Class<org.w3c.dom.css.RGBColor> createNewSUT() {
        return org.w3c.dom.css.RGBColor.class;
    }

}
