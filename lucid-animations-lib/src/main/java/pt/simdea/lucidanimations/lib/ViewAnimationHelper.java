/*
 * Copyright (c) 2017. Simdea.
 */

package pt.simdea.lucidanimations.lib;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.annotation.NonNull;
import android.view.View;

import static pt.simdea.lucidanimations.lib.utilities.LucidAnimationsConstants.ASSERTION_ERROR;

/**
 * Auxiliary class meant to provide an easy way to create animations that can be applied to any {@link View}.
 *
 * Created by Paulo Ribeiro on 22/10/2017.
 * Simdea © All Rights Reserved.
 * paulo.ribeiro@simdea.pt
 */
public final class ViewAnimationHelper {

    /**
     * Instantiates a new ViewAnimationHelper.
     * Private to prevent instantiation.
     */
    private ViewAnimationHelper() {
        throw new AssertionError(ASSERTION_ERROR);  // Throw an exception if this *is* ever called
    }

    /**
     * Procedure meant to prepare a Rotation along the X-Axis for a target View.
     * @param itemView the target {@link View} for tor the animation to be applied.
     * @return the resulting {@link AnimatorSet} for the intented animation.
     */
    public static AnimatorSet runTestRotationAnimation(@NonNull final View itemView) {
        final ObjectAnimator oldTextRotate = ObjectAnimator.ofFloat(itemView, View.ROTATION_X, 0, 90);
        final ObjectAnimator newTextRotate = ObjectAnimator.ofFloat(itemView, View.ROTATION_X, -90, 0);
        final AnimatorSet textAnim = new AnimatorSet();
        textAnim.playSequentially(oldTextRotate, newTextRotate);
        return textAnim;
    }

}
