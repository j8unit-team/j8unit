package org.j8unit.repository.java.sql;

import java.sql.ParameterMetaData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterMetaDataClassTest
implements org.j8unit.repository.java.sql.ParameterMetaDataClassTests<ParameterMetaData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.ParameterMetaData]

    @Override
    public Class<ParameterMetaData> createNewSUT() {
        return ParameterMetaData.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.ParameterMetaData]

}
