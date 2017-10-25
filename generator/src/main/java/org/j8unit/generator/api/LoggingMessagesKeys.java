package org.j8unit.generator.api;

import org.j8unit.generator.util.NameBasedCharSequence;
import org.j8unit.generator.util.NameBasedSupplier;

public enum LoggingMessagesKeys
implements NameBasedCharSequence, NameBasedSupplier<String> {
    ABORT_FILE,
    CREATE_FILE,
    DEFER_TYPE,
    ENVELOPED_TYPES,
    FINISH_ENTITY,
    FINISH_GENERATOR,
    MERGE_METHODS,
    METHODS_UNDER_TEST,
    SKIP_FILE,
    SKIP_SYNTHETIC_METHOD,
    SKIP_TYPE,
    START_ENTITY,
    START_GENERATOR;

    public static final String LOGGING_MESSAGES_BUNDLE = LoggingMessagesKeys.class.getPackage().getName() + ".LoggingMessages";

}
