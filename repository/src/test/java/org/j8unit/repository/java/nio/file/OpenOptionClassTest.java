package org.j8unit.repository.java.nio.file;

import java.nio.file.OpenOption;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OpenOptionClassTest
implements org.j8unit.repository.java.nio.file.OpenOptionClassTests<OpenOption> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.OpenOption]

    @Override
    public Class<OpenOption> createNewSUT() {
        return OpenOption.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.OpenOption]

}
