package org.j8unit.repository.java.nio.file;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.nio.file.LinkOption;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class LinkOptionTest
implements org.j8unit.repository.java.nio.file.LinkOptionTests<LinkOption> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.LinkOption]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(LinkOption.class);
    }

    @Parameter(0)
    public LinkOption sut;

    @Override
    public LinkOption createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.LinkOption]

}
