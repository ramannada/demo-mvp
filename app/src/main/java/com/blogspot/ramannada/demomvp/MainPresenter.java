package com.blogspot.ramannada.demomvp;

/**
 * Created by ramannada on 1/9/2018.
 */

public interface MainPresenter {
    void onResume();

    void onItemClicked(int position);

    void onDestroy();
}
