package org.j8unit.repository.javax.xml.datatype;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatatypeConstantsTest
implements org.j8unit.repository.javax.xml.datatype.DatatypeConstantsTests<javax.xml.datatype.DatatypeConstants> {

    @Override
    public javax.xml.datatype.DatatypeConstants createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.datatype.DatatypeConstants] available.");
    }

    @RunWith(J8Unit4.class)
    public static class FieldTest
    implements org.j8unit.repository.javax.xml.datatype.DatatypeConstantsTests.FieldTests<javax.xml.datatype.DatatypeConstants.Field> {

        @Override
        public javax.xml.datatype.DatatypeConstants.Field createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.xml.datatype.DatatypeConstants.Field] available.");
        }

    }

}
