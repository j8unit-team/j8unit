package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSValue;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSValue} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.css.CSSValueClassTests}).
 */
@RunWith(J8Unit4.class)
public class CSSValueClassTest
implements CSSValueClassTests<CSSValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSValue]

    @Override
    public Class<CSSValue> createNewSUT() {
        return CSSValue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSValue]

}
