package com.blogspot.ramannada.demomvp;

import java.util.List;

/**
 * Created by ramannada on 1/9/2018.
 */

public interface FindItemsInteractor {
    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener onFinishedListener);

}
