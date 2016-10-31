package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.Binder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BinderTest<XmlNode>
implements org.j8unit.repository.javax.xml.bind.BinderTests<Binder<XmlNode>, XmlNode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.Binder]

    @Override
    public Binder<XmlNode> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.Binder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.Binder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.Binder]

}
