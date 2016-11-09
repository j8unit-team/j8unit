package org.j8unit.repository.javax.xml.datatype;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeConstants.Field;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DatatypeConstants} (by simply reusing
 * the J8Unit test interface {@link DatatypeConstantsTests}).
 */

@RunWith(J8Unit4.class)
public class DatatypeConstantsTest
implements DatatypeConstantsTests<DatatypeConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants]

    @Override
    public DatatypeConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.datatype.DatatypeConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Field} (by simply reusing the
     * J8Unit test interface {@link FieldTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FieldTest
    implements FieldTests<Field> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants$Field]

        @Override
        public Field createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.datatype.DatatypeConstants.Field], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants$Field]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants$Field]

    }

}
