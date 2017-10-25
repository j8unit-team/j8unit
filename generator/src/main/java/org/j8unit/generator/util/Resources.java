package org.j8unit.generator.util;

import static java.lang.String.format;
import static java.nio.file.FileSystems.newFileSystem;
import static java.util.Arrays.stream;
import static java.util.Collections.emptyMap;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.MissingResourceException;

public enum Resources {
    ;

    public static final <E extends Enum<E> & Map.Entry<?, ?>> Object[][] asResourcePairs(final Class<? extends E> clazz) {
        return stream(clazz.getEnumConstants()).map(c -> new Object[] { c.getKey(), c.getValue() }).toArray(Object[][]::new);
    }

    private static final String MISSING_RESOURCE = "Cannot find resource for %s via %s.";

    private static final String UNLOADABLE_RESOURCE = "Cannot load resource for %s via %s.";

    public static final Path resolveResource(final Object reference, final String name)
    throws MissingResourceException {
        final Class<?> base = reference.getClass();
        final URI uri;
        try {
            uri = base.getResource(name).toURI();
        } catch (final NullPointerException missingResource) {
            final MissingResourceException miss = new MissingResourceException(format(MISSING_RESOURCE, name, base), name, "");
            miss.initCause(missingResource);
            throw miss;
        } catch (final URISyntaxException malformedURL) {
            final MissingResourceException miss = new MissingResourceException(format(UNLOADABLE_RESOURCE, name, base), name, "");
            miss.initCause(malformedURL);
            throw miss;
        }
        try {
            return Paths.get(uri);
        } catch (final FileSystemNotFoundException jarFileOrSimilar) {
            try {
                return newFileSystem(uri, emptyMap()).provider().getPath(uri);
            } catch (final IOException uncreatableFileSystem) {
                uncreatableFileSystem.addSuppressed(jarFileOrSimilar);
                final MissingResourceException miss = new MissingResourceException(format(UNLOADABLE_RESOURCE, name, base), name, "");
                miss.initCause(uncreatableFileSystem);
                throw miss;
            }
        }
    }

}
