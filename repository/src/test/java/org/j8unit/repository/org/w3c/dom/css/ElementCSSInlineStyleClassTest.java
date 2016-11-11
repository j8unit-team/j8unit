package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.ElementCSSInlineStyle;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ElementCSSInlineStyle} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.ElementCSSInlineStyleClassTests}).
 */

@RunWith(J8Unit4.class)
public class ElementCSSInlineStyleClassTest
implements ElementCSSInlineStyleClassTests<ElementCSSInlineStyle> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.ElementCSSInlineStyle]

    @Override
    public Class<ElementCSSInlineStyle> createNewSUT() {
        return ElementCSSInlineStyle.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.ElementCSSInlineStyle]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.ElementCSSInlineStyle]

}
