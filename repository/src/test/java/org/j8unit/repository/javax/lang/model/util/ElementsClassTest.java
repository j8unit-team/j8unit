package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.Elements;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ElementsClassTest
implements org.j8unit.repository.javax.lang.model.util.ElementsClassTests<Elements> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.Elements]

    @Override
    public Class<Elements> createNewSUT() {
        return Elements.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.Elements]

}
