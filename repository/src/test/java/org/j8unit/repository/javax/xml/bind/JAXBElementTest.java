package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAXBElementTest<T>
implements org.j8unit.repository.javax.xml.bind.JAXBElementTests<javax.xml.bind.JAXBElement<T>, T> {

    @RunWith(J8Unit4.class)
    public static class GlobalScopeTest
    implements org.j8unit.repository.javax.xml.bind.JAXBElementTests.GlobalScopeTests<javax.xml.bind.JAXBElement.GlobalScope> {

        @Override
        public javax.xml.bind.JAXBElement.GlobalScope createNewSUT() {
            return new javax.xml.bind.JAXBElement.GlobalScope();
        }

    }

    @Override
    public javax.xml.bind.JAXBElement<T> createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.bind.JAXBElement] available.");
    }

}
