package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.stylesheets.StyleSheetList;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StyleSheetList} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.stylesheets.StyleSheetListClassTests}).
 */

@RunWith(J8Unit4.class)
public class StyleSheetListClassTest
implements StyleSheetListClassTests<StyleSheetList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.stylesheets.StyleSheetList]

    @Override
    public Class<StyleSheetList> createNewSUT() {
        return StyleSheetList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.stylesheets.StyleSheetList]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.stylesheets.StyleSheetList]

}
