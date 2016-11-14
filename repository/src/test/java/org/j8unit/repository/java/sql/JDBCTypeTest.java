package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.sql.JDBCType;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JDBCType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.sql.JDBCTypeTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JDBCTypeTest
implements JDBCTypeTests<JDBCType> {

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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.JDBCType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.JDBCType]

}
