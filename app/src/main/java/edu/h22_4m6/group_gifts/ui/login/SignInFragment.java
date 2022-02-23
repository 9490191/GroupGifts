package edu.h22_4m6.group_gifts.ui.login;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import edu.h22_4m6.group_gifts.R;

import edu.h22_4m6.group_gifts.utils.*;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SignInFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class SignInFragment extends Fragment implements View.OnClickListener {

    private EditText txt_sign_in_mail;
    private EditText txt_sign_in_password;
    private Button btn_sign_in;
    private Button btn_sign_on;

    private Fragment _current_fragment;

    public SignInFragment() {
        // Required empty public constructor
    }

    public static SignInFragment newInstance() {
        SignInFragment fragment = new SignInFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sing_in, container, false);

        txt_sign_in_mail = view.findViewById(R.id.txt_sing_in_email);
        txt_sign_in_password = view.findViewById(R.id.txt_sing_in_password);
        btn_sign_in = view.findViewById(R.id.btn_sing_in);
        btn_sign_on = view.findViewById(R.id.btn_sing_on);

        btn_sign_in.setOnClickListener(this);
        btn_sign_on.setOnClickListener(this);

        return view;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_sing_in:
                // TODO Method implementation
                String message = "Connexion";
                Utilities.showToast(getContext(), message);
                break;
            case R.id.btn_sing_on:
                changeFragment(new SignOnFragment());
                break;
            default:
                Utilities.showToast(getContext(),"---INVALID---");
                break;
        }

    }

    protected void changeFragment(Fragment fragment){

        FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
        if (_current_fragment!=null) {
            fragmentTransaction.remove(_current_fragment);
        }
        _current_fragment = fragment;
        fragmentTransaction.add(R.id.frg_login_layout, fragment);
        fragmentTransaction.commit();
    }
}