package com.example.gonzalolodi.testingfloatingbutton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.software.shell.fab.ActionButton;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentMain extends Fragment {

    Button mButtonShow;
    Button mButtonHide;


    public FragmentMain() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        final ActionButton actionButton = (ActionButton) rootView.findViewById(R.id.action_button);
        actionButton.setShowAnimation(ActionButton.Animations.ROLL_FROM_RIGHT);
        actionButton.setHideAnimation(ActionButton.Animations.ROLL_TO_RIGHT);
        mButtonShow = (Button) rootView.findViewById(R.id.button_show);
        mButtonHide = (Button) rootView.findViewById(R.id.button_hide);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_show:
                        actionButton.show();
                        break;
                    case R.id.button_hide:
                        actionButton.hide();
                        break;

                }
            }
        };
        mButtonShow.setOnClickListener(listener);
        mButtonHide.setOnClickListener(listener);
        actionButton.setShowAnimation(ActionButton.Animations.ROLL_FROM_RIGHT);
        return rootView;
    }
}
