package org.j8unit.repository.javax.activation;

import javax.activation.CommandInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CommandInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.activation.CommandInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class CommandInfoClassTest
implements CommandInfoClassTests<CommandInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.CommandInfo]

    @Override
    public Class<CommandInfo> createNewSUT() {
        return CommandInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.CommandInfo#CommandInfo(String, String) public
     * javax.activation.CommandInfo(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_CommandInfo_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CommandInfo sut = null; // = new CommandInfo(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.CommandInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.CommandInfo]

}
