package org.j8unit.repository.java.nio.file;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.nio.file.StandardOpenOption;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class StandardOpenOptionTest
implements org.j8unit.repository.java.nio.file.StandardOpenOptionTests<StandardOpenOption> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.StandardOpenOption]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(StandardOpenOption.class);
    }

    @Parameter(0)
    public StandardOpenOption sut;

    @Override
    public StandardOpenOption createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.StandardOpenOption]

}
