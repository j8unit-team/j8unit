package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlAdapterTest<ValueType, BoundType>
implements org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlAdapterTests<XmlAdapter<ValueType, BoundType>, ValueType, BoundType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.adapters.XmlAdapter]

    @Override
    public XmlAdapter<ValueType, BoundType> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.adapters.XmlAdapter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.adapters.XmlAdapter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.adapters.XmlAdapter]

}
