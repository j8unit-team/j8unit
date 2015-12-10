package org.j8unit.repository.javax.xml.datatype;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatatypeConstantsClassTest
implements org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests<javax.xml.datatype.DatatypeConstants> {

    @RunWith(J8Unit4.class)
    public static class FieldClassTest
    implements org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests.FieldClassTests<javax.xml.datatype.DatatypeConstants.Field> {

        @Override
        public Class<javax.xml.datatype.DatatypeConstants.Field> createNewSUT() {
            return javax.xml.datatype.DatatypeConstants.Field.class;
        }

    }

    @Override
    public Class<javax.xml.datatype.DatatypeConstants> createNewSUT() {
        return javax.xml.datatype.DatatypeConstants.class;
    }

}
