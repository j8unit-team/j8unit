package org.j8unit.repository.javax.tools;

import javax.tools.Tool;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToolClassTest
implements org.j8unit.repository.javax.tools.ToolClassTests<Tool> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.Tool]

    @Override
    public Class<Tool> createNewSUT() {
        return Tool.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.Tool]

}
