package com.blogspot.ramannada.demomvp;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;


/**
 * Created by ramannada on 1/9/2018.
 */

public class FindItemsInteractorImpl implements FindItemsInteractor {

    @Override
    public void findItems(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(createArrayList());
            }
        }, 1000);
    }

    private List<String> createArrayList() {
        return Arrays.asList(
                "item 1",
                "item 2",
                "item 3",
                "item 4",
                "item 5",
                "item 6"
        );
    }
}
