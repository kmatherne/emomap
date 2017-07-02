package matherne.kaleb.emotionalbitmap;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by kaleb on 7/2/2017.
 */

public class ColorButton {

    private int color;
    private ImageButton button;

    public ColorButton(final ImageView pImageView, ImageButton imageButton, String hexColor) {
        this.color = Color.parseColor(hexColor);
        this.button = imageButton;
        button.setColorFilter(color);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pImageView.setColorFilter(color);
            }
        });
    }
}
