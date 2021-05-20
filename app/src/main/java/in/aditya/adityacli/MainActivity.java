package in.aditya.adityacli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_version_name, tv_version_number;
    Button btn_toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_version_name = findViewById(R.id.tv_version_name);
        tv_version_number = findViewById(R.id.version_code);
        btn_toast = findViewById(R.id.btn_toast);

        tv_version_name.setText(BuildConfig.VERSION_CODE + ".");
        tv_version_number.setText(BuildConfig.VERSION_NAME);

        btn_toast.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_SHORT).show());

    }
}