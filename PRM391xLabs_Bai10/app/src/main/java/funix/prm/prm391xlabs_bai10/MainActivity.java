package funix.prm.prm391xlabs_bai10;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnImplicitIntent = (Button) findViewById(R.id.implicit_intent);
        btnImplicitIntent.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, ImplicitIntentActivity.class);
            startActivity(intent);
        });

        Button btnExplicitIntent = (Button) findViewById(R.id.explicit_intent);
        btnExplicitIntent.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, ExplicitIntentActivity.class);
            startActivity(intent);
        });

        Button btnIntentFilter = (Button) findViewById(R.id.intent_filter);
        btnIntentFilter.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, IntentFilterActivity.class);
            startActivity(intent);
        });
    }
}