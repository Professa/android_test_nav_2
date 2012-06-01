package com.protech.ascension.provider;

import com.protech.ascension.R;
import com.protech.ascension.util.ImageWorker.ImageWorkerAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: BNengel
 * Date: 6/1/12
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Images {
    public final static Integer[] PAGE_LIST = new Integer[] {
            R.drawable.image8,
            R.drawable.image5,
            R.drawable.image1
    };

    /**
     * Simple static adapter to use for images.
     */
    public final static ImageWorkerAdapter imageWorkerUrlsAdapter = new ImageWorkerAdapter() {
        @Override
        public Object getItem(int num) {
            return Images.PAGE_LIST[num];
        }

        @Override
        public int getSize() {
            return Images.PAGE_LIST.length;
        }
    };
}
