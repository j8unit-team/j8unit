package org.j8unit.maven.plugin;

import static org.j8unit.generator.util.Resources.asResourcePairs;
import java.util.ListResourceBundle;
import org.j8unit.generator.util.NameBasedCharSequence;
import org.j8unit.generator.util.NamedElement;

/**
 * Root resource bundle of this Mojo's log/error messages. Note, all message keys are enumerated by
 * {@link Messages.Keys}.
 */
public class Messages
extends ListResourceBundle {

    public static enum Keys
    implements NameBasedCharSequence, NamedElement<String> {
        ADD_SOURCE_ROOT("Adding source test directory %1$s to project's test compile pathes."),
        AVOIDABLE_EXCEPTION("I am awfully sorry! The current exception should have been avoided by the plug-in's programmer: %1$s"),
        GENERATE_SOURCE_CODE("Generating the test source code for package %1$s and classes %2$s."),
        MISSING_COMPILER("You need to run build with JDK or have 'tools.jar' on the class-path. (If this occurs during Eclipse build, make sure you run Eclipse under JDK as well."),
        OMIT_SOURCE_ROOT("Skip adding source test directory %1$s to project's test compile pathes."),
        SKIP_MOJO_CLI("Skipping the command-linely invoked execution (ID: '%2$s') of Maven plug-in '%1$s' and goal '%3$s'."),
        SKIP_MOJO_LIFECYCLE("Skipping the execution (ID: '%2$s') of Maven plug-in '%1$s' at life-cycle phase '%4$s' and goal '%3$s'."),
        SOURCE_ROOT("Folder for generated test sources is: %1$s");

        private final String pattern;

        private Keys(final String pattern) {
            this.pattern = pattern;
        }

        @Override
        public final String getValue() {
            return this.pattern;
        }

    }

    @Override
    protected Object[][] getContents() {
        return asResourcePairs(Keys.class);
    }

}
