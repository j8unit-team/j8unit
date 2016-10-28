package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.ElementVisitor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ElementVisitorClassTest
implements org.j8unit.repository.javax.lang.model.element.ElementVisitorClassTests<ElementVisitor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.ElementVisitor]

    @Override
    public Class<ElementVisitor> createNewSUT() {
        return ElementVisitor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.ElementVisitor]

}
