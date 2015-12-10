package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToolClassTest
implements org.j8unit.repository.javax.tools.ToolClassTests<javax.tools.Tool> {

    @Override
    public Class<javax.tools.Tool> createNewSUT() {
        return javax.tools.Tool.class;
    }

}
