package matherne.kaleb.emotionalbitmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView choice = (ImageView) findViewById(R.id.imageView);
        ColorButton button1 = new ColorButton(choice,
                (ImageButton) findViewById(R.id.imageButton), "#00796B");
        ColorButton button2 = new ColorButton(choice,
                (ImageButton) findViewById(R.id.imageButton2), "#512DA8");
        ColorButton button3 = new ColorButton(choice,
                (ImageButton) findViewById(R.id.imageButton3), "#E64A19");

    }
}
