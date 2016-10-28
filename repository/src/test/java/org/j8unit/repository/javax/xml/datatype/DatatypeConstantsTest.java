package org.j8unit.repository.javax.xml.datatype;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeConstants.Field;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatatypeConstantsTest
implements org.j8unit.repository.javax.xml.datatype.DatatypeConstantsTests<DatatypeConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants]

    @Override
    public DatatypeConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.datatype.DatatypeConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants]

    @RunWith(J8Unit4.class)
    public static class FieldTest
    implements org.j8unit.repository.javax.xml.datatype.DatatypeConstantsTests.FieldTests<Field> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants$Field]

        @Override
        public Field createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.datatype.DatatypeConstants.Field], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.DatatypeConstants$Field]

    }

}
