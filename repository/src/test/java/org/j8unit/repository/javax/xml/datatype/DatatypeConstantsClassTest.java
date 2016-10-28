package org.j8unit.repository.javax.xml.datatype;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeConstants.Field;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatatypeConstantsClassTest
implements org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests<DatatypeConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.datatype.DatatypeConstants]

    @Override
    public Class<DatatypeConstants> createNewSUT() {
        return DatatypeConstants.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.datatype.DatatypeConstants]

    @RunWith(J8Unit4.class)
    public static class FieldClassTest
    implements org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests.FieldClassTests<Field> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.datatype.DatatypeConstants$Field]

        @Override
        public Class<Field> createNewSUT() {
            return Field.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.datatype.DatatypeConstants$Field]

    }

}
