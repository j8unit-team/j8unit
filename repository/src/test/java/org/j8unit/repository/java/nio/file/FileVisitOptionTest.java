package org.j8unit.repository.java.nio.file;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.nio.file.FileVisitOption;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class FileVisitOptionTest
implements org.j8unit.repository.java.nio.file.FileVisitOptionTests<FileVisitOption> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileVisitOption]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(FileVisitOption.class);
    }

    @Parameter(0)
    public FileVisitOption sut;

    @Override
    public FileVisitOption createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileVisitOption]

}
