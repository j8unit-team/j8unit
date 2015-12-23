package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class JAXBElementClassTest
implements org.j8unit.repository.javax.xml.bind.JAXBElementClassTests<javax.xml.bind.JAXBElement> {

    @Override
    public Class<javax.xml.bind.JAXBElement> createNewSUT() {
        return javax.xml.bind.JAXBElement.class;
    }

    @RunWith(J8Unit4.class)
    public static class GlobalScopeClassTest
    implements org.j8unit.repository.javax.xml.bind.JAXBElementClassTests.GlobalScopeClassTests<javax.xml.bind.JAXBElement.GlobalScope> {

        @Override
        public Class<javax.xml.bind.JAXBElement.GlobalScope> createNewSUT() {
            return javax.xml.bind.JAXBElement.GlobalScope.class;
        }

    }

}
