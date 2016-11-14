package org.j8unit.repository.java.sql;

import java.sql.ParameterMetaData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ParameterMetaData} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.sql.ParameterMetaDataClassTests}).
 */

@RunWith(J8Unit4.class)
public class ParameterMetaDataClassTest
implements ParameterMetaDataClassTests<ParameterMetaData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.ParameterMetaData]

    @Override
    public Class<ParameterMetaData> createNewSUT() {
        return ParameterMetaData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.ParameterMetaData]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.ParameterMetaData]

}
