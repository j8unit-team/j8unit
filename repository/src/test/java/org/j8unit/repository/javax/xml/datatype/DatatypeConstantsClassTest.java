package org.j8unit.repository.javax.xml.datatype;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeConstants.Field;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DatatypeConstants} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests}).
 */

@RunWith(J8Unit4.class)
public class DatatypeConstantsClassTest
implements DatatypeConstantsClassTests<DatatypeConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.datatype.DatatypeConstants]

    @Override
    public Class<DatatypeConstants> createNewSUT() {
        return DatatypeConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.datatype.DatatypeConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.datatype.DatatypeConstants]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Field} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests.FieldClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FieldClassTest
    implements FieldClassTests<Field> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.datatype.DatatypeConstants$Field]

        @Override
        public Class<Field> createNewSUT() {
            return Field.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.datatype.DatatypeConstants$Field]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.datatype.DatatypeConstants$Field]

    }

}
