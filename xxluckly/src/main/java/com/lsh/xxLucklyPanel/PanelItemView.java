package com.lsh.xxLucklyPanel;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jeanboy on 2017/4/20.
 */

public class PanelItemView extends FrameLayout implements ItemView {

    private View overlay;
    private TextView tv_content;
    private ImageView iv_content;

    public PanelItemView(Context context) {
        this(context, null);
    }

    public PanelItemView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PanelItemView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.view_panel_item, this);
        overlay = findViewById(R.id.overlay);
        tv_content = (TextView) findViewById(R.id.tv_content);
        iv_content = (ImageView) findViewById(R.id.iv_content);
        iv_content.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public ImageView getImageView() {
        return iv_content;
    }

    @Override
    public void setTextGone() {
        tv_content.setVisibility(GONE);
        iv_content.setVisibility(VISIBLE);
    }

    @Override
    public void setImageGone() {
        iv_content.setVisibility(GONE);
        tv_content.setVisibility(VISIBLE);
    }

    @Override
    public void setFocus(boolean isFocused) {
        if (overlay != null) {
            overlay.setVisibility(isFocused ? INVISIBLE : VISIBLE);
        }
    }

    @Override
    public void setTextContent(String textContet) {
        iv_content.setVisibility(GONE);
        tv_content.setVisibility(VISIBLE);
        tv_content.setText(textContet);
    }

    @Override
    public void setImageContent(Bitmap bitmap) {
        iv_content.setImageBitmap(bitmap);
        iv_content.setVisibility(VISIBLE);
        tv_content.setVisibility(GONE);
    }

}
