/*
 * Copyright (c) 2017. Simdea.
 */

package pt.simdea.lucidanimations.lib.utilities;

/**
 * Utility class meant to hold all constants for the LucidAnimations library.
 *
 * Created Paulo Ribeiro on 22/10/2017.
 * Simdea © All Rights Reserved.
 * paulo.ribeiro@simdea.pt
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public final class LucidAnimationsConstants {

    /** Exception Messages */
    public static final String ASSERTION_ERROR = "Instantiating utility class.";
    public static final String UNSUPPORTED_ERROR = "Unsupported operation.";

    /**
     * Instantiates a new LucidAnimationsConstants.
     * Private to prevent instantiation.
     */
    private LucidAnimationsConstants() {
        throw new AssertionError(ASSERTION_ERROR); // Throw an exception if this *is* ever called
    }

}
