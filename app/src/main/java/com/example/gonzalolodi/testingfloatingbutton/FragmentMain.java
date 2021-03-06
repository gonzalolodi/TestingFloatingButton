package com.example.gonzalolodi.testingfloatingbutton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.software.shell.fab.ActionButton;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentMain extends Fragment {

    RelativeLayout relativeLayout;

    public FragmentMain() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        final ActionButton actionButton = (ActionButton) rootView.findViewById(R.id.action_button);
        actionButton.setShowAnimation(ActionButton.Animations.ROLL_FROM_RIGHT);
        actionButton.setHideAnimation(ActionButton.Animations.ROLL_TO_DOWN);
        relativeLayout = (RelativeLayout) rootView.findViewById(R.id.relative_layout);
        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    actionButton.hide();
                }else{
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        actionButton.show();
                    }
                }
                return true;
            }
        });

        return rootView;
    }
}
