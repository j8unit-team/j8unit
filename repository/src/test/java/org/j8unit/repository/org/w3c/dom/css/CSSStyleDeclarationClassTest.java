package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CSSStyleDeclarationClassTest
implements org.j8unit.repository.org.w3c.dom.css.CSSStyleDeclarationClassTests<org.w3c.dom.css.CSSStyleDeclaration> {

    @Override
    public Class<org.w3c.dom.css.CSSStyleDeclaration> createNewSUT() {
        return org.w3c.dom.css.CSSStyleDeclaration.class;
    }

}
