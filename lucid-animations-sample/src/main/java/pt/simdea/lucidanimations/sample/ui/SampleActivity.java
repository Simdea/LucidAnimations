/*
 * Copyright (c) 2017. Simdea.
 */

package pt.simdea.lucidanimations.sample.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import pt.simdea.lucidanimations.lib.ViewAnimationHelper;
import pt.simdea.lucidanimations.sample.R;

/**
 * Class responsible for the Sample Screen for the (GMLRVA) library.
 *
 * Created by Paulo Ribeiro on 7/16/2017.
 * Simdea © All Rights Reserved.
 * paulo.ribeiro@simdea.pt
 */
@SuppressWarnings("unchecked")
public class SampleActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mHelloText;
    private ImageButton mAnimationTrigger;

    /**
     * Starter procedure for SampleActivity.
     * @param context the application's current context.
     */
    public static void start(@NonNull final Context context) {
        final Intent starter = new Intent(context, SampleActivity.class);
        context.startActivity(starter);
    }

    /**
     * Called when SampleActivity is first created.
     * @param savedInstanceState Bundle object containing the activity's previously saved state.
     */
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lucidanimations_activity_sample);
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        bindSampleActivityViews();
        bindSampleActivityListeners();
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
    }

    /** {@inheritDoc} */
    @Override
    public void onClick(@NonNull final View v) {
        if (v.getId() == R.id.ibAnimationTrigger) {
            final AnimatorSet anim = ViewAnimationHelper.runTestRotationAnimation(mHelloText);
            anim.start();
        }
    }

    /** Procedure meant to bind this activity's views. */
    private void bindSampleActivityViews() {
        mHelloText = (TextView) findViewById(R.id.tvHello);
        mAnimationTrigger = (ImageButton) findViewById(R.id.ibAnimationTrigger);
    }

    /** Procedure meant to bind this activity's listeners. */
    private void bindSampleActivityListeners() {
        mAnimationTrigger.setOnClickListener(this);
    }

}
