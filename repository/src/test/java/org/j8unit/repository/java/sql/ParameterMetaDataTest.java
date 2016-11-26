package org.j8unit.repository.java.sql;

import java.sql.ParameterMetaData;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ParameterMetaData} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.sql.ParameterMetaDataTests}).
 */
@RunWith(J8Unit4.class)
public class ParameterMetaDataTest
implements ParameterMetaDataTests<ParameterMetaData> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.ParameterMetaData]

    @Override
    public ParameterMetaData createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.ParameterMetaData], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.ParameterMetaData]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.ParameterMetaData]

}
