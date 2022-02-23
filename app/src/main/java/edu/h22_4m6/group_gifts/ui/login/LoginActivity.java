package edu.h22_4m6.group_gifts.ui.login;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import edu.h22_4m6.group_gifts.R;

public class LoginActivity extends AppCompatActivity {

    private static final @IdRes int frame_layout_id = R.id.frg_login_layout;
    Fragment current_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SignInFragment signInFragment = new SignInFragment();
        changeFragment(signInFragment);

    }

    protected void changeFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (current_fragment!=null) {
            fragmentTransaction.remove(current_fragment);
        }
        current_fragment = fragment;
        fragmentTransaction.add(frame_layout_id, fragment);
        fragmentTransaction.commit();
    }
}