package com.protech.ascension.gui;

import android.support.v4.app.Fragment;

/**
 * Created with IntelliJ IDEA.
 * User: BNengel
 * Date: 5/21/12
 * Time: 4:02 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PageFragment extends Fragment {
    protected abstract int getTouchMode();

    protected abstract int getCaptionListId();
}
