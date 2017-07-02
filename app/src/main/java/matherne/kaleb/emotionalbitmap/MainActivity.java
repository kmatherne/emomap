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
        ColorButton button1 = new ColorButton(getApplicationContext(), choice,
                (ImageButton) findViewById(R.id.imageButton), R.color.testBlue);
        ColorButton button2 = new ColorButton(getApplicationContext(), choice,
                (ImageButton) findViewById(R.id.imageButton2), R.color.testGreen);
        ColorButton button3 = new ColorButton(getApplicationContext(), choice,
                (ImageButton) findViewById(R.id.imageButton3), R.color.testRed);

    }
}
