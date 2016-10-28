package org.j8unit.repository.javax.lang.model;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.lang.model.SourceVersion;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class SourceVersionTest
implements org.j8unit.repository.javax.lang.model.SourceVersionTests<SourceVersion> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.SourceVersion]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(SourceVersion.class);
    }

    @Parameter(0)
    public SourceVersion sut;

    @Override
    public SourceVersion createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.SourceVersion]

}
