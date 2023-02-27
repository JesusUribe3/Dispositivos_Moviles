package jesus.uribe.dispositivos.clase3febrero2023;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
 String TAG = "Depuracion";
 EditText ladouno, ladodos;
 TextView resultado;
 Button calcular;

    @Override
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Estoy en onCreate");
        ladouno =  findViewById(R.id.lado1);
        ladodos = findViewById(R.id.lado2);
        resultado = findViewById(R.id.resultado);
        calcular = findViewById(R.id.calcular);

    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Estoy en OnStart");
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ladoone = Float.parseFloat(ladouno.getText().toString());
                float ladotwo = Float.parseFloat(ladodos.getText().toString());
                float result =ladoone*ladotwo;
                resultado.setText(String.valueOf(result));

            }
        });

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