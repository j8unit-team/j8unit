package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CSSValueClassTest
implements org.j8unit.repository.org.w3c.dom.css.CSSValueClassTests<org.w3c.dom.css.CSSValue> {

    @Override
    public Class<org.w3c.dom.css.CSSValue> createNewSUT() {
        return org.w3c.dom.css.CSSValue.class;
    }

}
