package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSStyleDeclaration;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSStyleDeclaration} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.CSSStyleDeclarationClassTests}).
 */

@RunWith(J8Unit4.class)
public class CSSStyleDeclarationClassTest
implements CSSStyleDeclarationClassTests<CSSStyleDeclaration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSStyleDeclaration]

    @Override
    public Class<CSSStyleDeclaration> createNewSUT() {
        return CSSStyleDeclaration.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSStyleDeclaration]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSStyleDeclaration]

}
