package jesus.uribe.dispositivos.clase3febrero2023;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ed

public class MainActivity extends AppCompatActivity {
 String TAG = "Depuracion";
 EditText lado1, ladodo2;
 TextView resultado;
 Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Estoy en onCreate");
        lado1 =  findViewById(R.id.lado1);
        ladodo2 = findViewById(R.id.lado2);
        resultado = findViewById(R.id.resultado);
        calcular = findViewById(R.id.calcular);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Estoy en OnStart");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Estoy en onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Estoy en onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Estoy en onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Estoy en OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Estoy en onDestroy");
    }
}