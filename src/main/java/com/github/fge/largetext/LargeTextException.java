/*
 * Copyright (c) 2014, Francis Galiegue (fgaliegue@gmail.com)
 *
 * This software is dual-licensed under:
 *
 * - the Lesser General Public License (LGPL) version 3.0 or, at your option, any
 *   later version;
 * - the Apache Software License (ASL) version 2.0.
 *
 * The text of both licenses is available under the src/resources/ directory of
 * this project (under the names LGPL-3.0.txt and ASL-2.0.txt respectively).
 *
 * Direct link to the sources:
 *
 * - LGPL 3.0: https://www.gnu.org/licenses/lgpl-3.0.txt
 * - ASL 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 */

package com.github.fge.largetext;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;

/**
 * {@link RuntimeException} specific to this package
 *
 * <p>This is the exception thrown on decoding errors, interruptions etc.</p>
 *
 * <p>It is pretty much required, because {@link CharSequence} does not account
 * for potential interruptions (we cannot throw an {@link InterruptedException})
 * or failures (we can fail to decode a file).</p>
 */
@Immutable
@ParametersAreNonnullByDefault
public final class LargeTextException
    extends RuntimeException
{
    public LargeTextException(final String message, final Throwable cause)
    {
        super(message, cause);
    }
}
