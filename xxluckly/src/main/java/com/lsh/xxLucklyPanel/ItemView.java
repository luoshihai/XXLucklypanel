package com.lsh.xxLucklyPanel;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by jeanboy on 2017/4/25.
 */

public interface ItemView {

    void setFocus(boolean isFocused);

    void setTextContent(String textContet);

    void setImageContent(Bitmap bitmap);

    ImageView getImageView();

    void setTextGone();

    void setImageGone();
}
