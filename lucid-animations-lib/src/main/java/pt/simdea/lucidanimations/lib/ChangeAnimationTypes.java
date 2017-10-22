/*
 * Copyright (c) 2017. Simdea.
 */

package pt.simdea.lucidanimations.lib;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import lombok.AllArgsConstructor;

/**
 * Magic Constant Annotation Enum containing the possible animation options.
 *
 * Created by Paulo Ribeiro on 22/10/2017.
 * Simdea © All Rights Reserved.
 * paulo.ribeiro@simdea.pt
 */
@SuppressWarnings({"WeakerAccess", "unused"})
@AllArgsConstructor
public class ChangeAnimationTypes {

    /* Constants */

    /** ROTATION representing a rotation animation. */
    public static final int ROTATION = 0;

    // Declare the @StringDef for these constants
    @IntDef({ ROTATION })
    @Retention(RetentionPolicy.SOURCE)
    public @interface ChangeAnimationTypesConstants { /* Do nothing here ... */ }

}
