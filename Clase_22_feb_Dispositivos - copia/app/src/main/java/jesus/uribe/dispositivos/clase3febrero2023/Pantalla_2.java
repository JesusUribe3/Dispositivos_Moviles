package jesus.uribe.dispositivos.clase3febrero2023;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Pantalla_2 extends AppCompatActivity {

    String TAG = "Depuracion";
    EditText lado1Text, lado2Text;
    TextView resultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);


        lado1Text = findViewById(R.id.result_lado1);
        lado2Text = findViewById(R.id.result_lado2);
        resultadoFinal = findViewById(R.id.reso);
        //obtengo de lo recibido el dato (un string que se envio)
        String result = getIntent().getStringExtra("Elresultado");
        String result1 = getIntent().getStringExtra("Llamarlado1");
        String result2 = getIntent().getStringExtra("Llamarlado2");
        publicarDatos(result, result1, result2);

    }


    public void publicarDatos(String result, String Llamarlado1, String Llamarlado2){
        resultadoFinal.setText(result);
        lado1Text.setText(Llamarlado1);
        lado2Text.setText(Llamarlado2);
    }
}