package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlAdapter} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlAdapterClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class XmlAdapterClassTest
implements XmlAdapterClassTests<XmlAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.adapters.XmlAdapter]

    @Override
    public Class<XmlAdapter> createNewSUT() {
        return XmlAdapter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.adapters.XmlAdapter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.adapters.XmlAdapter]

}
