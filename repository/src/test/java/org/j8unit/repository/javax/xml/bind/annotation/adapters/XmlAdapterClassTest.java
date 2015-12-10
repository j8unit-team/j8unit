package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class XmlAdapterClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlAdapterClassTests<javax.xml.bind.annotation.adapters.XmlAdapter> {

    @Override
    public Class<javax.xml.bind.annotation.adapters.XmlAdapter> createNewSUT() {
        return javax.xml.bind.annotation.adapters.XmlAdapter.class;
    }

}
