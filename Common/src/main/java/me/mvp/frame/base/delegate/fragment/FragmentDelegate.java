package me.mvp.frame.base.delegate.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

/**
 * {@link Fragment} 生命周期代理接口
 */
public interface FragmentDelegate{

    String FRAGMENT_DELEGATE = "FRAGMENT_DELEGATE";

    void onAttach(@NonNull Context context);

    void onCreate(@NonNull Bundle savedInstanceState);

    void onCreateView(@NonNull View view, @NonNull Bundle savedInstanceState);

    void onActivityCreated(@NonNull Bundle savedInstanceState);

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroyView();

    void onDestroy();

    void onDetach();

    void onSaveInstanceState(@NonNull Bundle outState);

    /**
     * Return true if the fragment is currently added to its activity.
     */
    boolean isAdded();
}