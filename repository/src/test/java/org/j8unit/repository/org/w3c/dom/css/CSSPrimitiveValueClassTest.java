package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSPrimitiveValue;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSPrimitiveValue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.CSSPrimitiveValueClassTests}).
 */

@RunWith(J8Unit4.class)
public class CSSPrimitiveValueClassTest
implements CSSPrimitiveValueClassTests<CSSPrimitiveValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSPrimitiveValue]

    @Override
    public Class<CSSPrimitiveValue> createNewSUT() {
        return CSSPrimitiveValue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSPrimitiveValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSPrimitiveValue]

}
