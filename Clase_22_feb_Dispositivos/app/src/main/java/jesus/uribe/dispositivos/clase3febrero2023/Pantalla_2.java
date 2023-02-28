package jesus.uribe.dispositivos.clase3febrero2023;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pantalla_2 extends AppCompatActivity {

TextView lado1Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        lado1Text = findViewById(R.id.lado1);
        //obtengo de lo recibido el dato (un string que se envio)
        String lado1 = getIntent().getStringExtra("lado1");
        publicarDatos(lado1);

    }


    public void publicarDatos(String lado1){
        lado1Text.setText(lado1);
    }
}