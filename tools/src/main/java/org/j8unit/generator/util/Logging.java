package org.j8unit.generator.util;

import static java.lang.System.getProperty;
import static java.util.Objects.isNull;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.LogManager.getLogManager;
import static java.util.logging.Logger.getAnonymousLogger;
import java.io.IOException;
import java.io.InputStream;

public enum Logging {
    ;

    public static final void configureJavaLogging() {
        // Skip configuring if {@code -Djava.util.logging.config.file=...} is specified.
        if (isNull(getProperty("java.util.logging.config.file"))) {
            try (final InputStream config = Logging.class.getResourceAsStream("/logging.properties")) {
                getLogManager().readConfiguration(config);
            } catch (final IOException | NullPointerException any) {
                getAnonymousLogger().log(SEVERE, "Could not load default logging.properties file", any);
            }
        }
    }

}
