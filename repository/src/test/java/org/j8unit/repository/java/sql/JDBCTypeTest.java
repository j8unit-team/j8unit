package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.sql.JDBCType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class JDBCTypeTest
implements org.j8unit.repository.java.sql.JDBCTypeTests<JDBCType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.JDBCType]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(JDBCType.class);
    }

    @Parameter(0)
    public JDBCType sut;

    @Override
    public JDBCType createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.JDBCType]

}
