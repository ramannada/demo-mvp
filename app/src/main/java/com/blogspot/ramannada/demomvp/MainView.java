package com.blogspot.ramannada.demomvp;

import java.util.List;

/**
 * Created by ramannada on 1/9/2018.
 */

public interface MainView {
    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
