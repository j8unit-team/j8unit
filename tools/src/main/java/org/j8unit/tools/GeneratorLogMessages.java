package org.j8unit.tools;

public abstract interface GeneratorLogMessages {

    public static final String START_MAIN = "Starting to generate test classes for [%1$s].";

    public static final String FINISH_MAIN = "Finished to generate test classes for [%1$s].";

    public static final String HANDLE_TYPE = "Handling [%1$s].";

    public static final String FINISH_TYPE = "Finished [%1$s].";

    public static final String CREATE_PACKAGE_INFOFILE_CONTENT = "Creating JavaDoc content of a package info file for [%1$s].";

    public static final String CREATE_PACKAGE_INFOFILE = "Creating package info file for [%1$s].";

    public static final String SKIP_PACKAGE_INFOFILE = "Skipping overwriting of an already existing package info file for [%1$s].";

    public static final String DEFER_TYPE = "Defer [%1$s] because it is not top-level.";

    public static final String SKIP_TYPE = "Skipping [%1$s] by current setup.";

    public static final String CREATE_J8UNIT_TESTINTERFACE_CONTENT = "Creating content of (%2$s scoped) J8Unit test interface for [%1$s].";

    public static final String CREATE_FILE = "Creating/Overwriting file for [%1$s].";

    public static final String SKIP_FILE = "Skipping overwriting of an already existing file for [%1$s].";

    public static final String ABORT_FILE = "Skipping creation of a file for [%1$s] by exceptional reason!";

    public static final String J8UNIT_TESTINTERFACE_REUSED_SUPERS = "The (%2$s scoped) test class of [%1$s] extends the test behaviour of the following types: %3$s.";

    public static final String J8UNIT_TESTINTERFACE_AIMED_CONSTRUCTORS = "The (%2$s scoped) test class of [%1$s] will create test methods for the following constructors: %3$s.";

    public static final String J8UNIT_TESTINTERFACE_AIMED_METHODS = "The (%2$s scoped) test class of [%1$s] will create test methods for the following methods: %3$s.";

    public static final String J8UNIT_TESTINTERFACE_MERGE_METHOD_CANDIDATES = "The (%2$s scoped) test class of [%1$s] will potentially merge the following methods: %3$s.";

    public static final String ENVELOPED_TYPES = "The [%1$s] contains the following enclosed classes: %2$s.";

    public static final String SKIP_TYPE_METHODS = "The following method of [%1$s] will be skipped (because is synthetic, is bridge, ...): %2$s.";

    public static final String SKIP_TYPE_CONSTRUCTORS = "The following constructor of [%1$s] will be skipped (because is synthetic, ...): %2$s.";

    public static final String SKIP_SUPER_INTERFACE = "The following super(-super*) interface of [%1$s] will be skipped: %2$s.";

    public static final String SKIP_SUPER_CLASS = "The following super(-super*) class of [%1$s] will be skipped: %2$s.";

}
