package jesus.uribe.dispositivos.clase3febrero2023;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
 String TAG = "Depuracion";
 EditText lado1Text, lado2Text;
 TextView resultado;
 Button calcular;

 //Button Abrir_llamada;

// Button AbrirGoogle; //declaracion del boton
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i(TAG, "Estoy en onCreate");
        lado1Text = findViewById(R.id.lado1);
        lado2Text = findViewById(R.id.lado2);
        resultado = findViewById(R.id.resultado);
        calcular = findViewById(R.id.calcular);
        //Abrir_llamada= findViewById(R.id.llamar);
       // AbrirGoogle= findViewById(R.id.abrir_google); // se asocia el boton con el id

    }
        //public void irgotoActiviti2(View View) {
        //Intent irAGoogle= new Intent(Intent.ACTION_VIEW); //El intent es para una nueva vista
        //irAGoogle.setData(Uri.parse("https://www.google.com"));

        //}



        @Override
        protected void onStart () {
            super.onStart();
            Log.i(TAG, "Estoy en OnStart");
            calcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //float ladoone = Float.parseFloat(ladouno.getText().toString());
                   // float ladotwo = Float.parseFloat(ladodos.getText().toString());
                  //  float result = ladoone * ladotwo;
                   // resultado.setText(String.valueOf(result));
                   gotoActivity2(view);

                }
            });

        }

        @Override
        protected void onRestart () {
            super.onRestart();
            Log.i(TAG, "Estoy en onRestart");
        }

        @Override
        protected void onResume () {
            super.onResume();
            Log.i(TAG, "Estoy en onResume");
        }

        @Override
        protected void onPause () {
            super.onPause();
            Log.i(TAG, "Estoy en onPause");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.i(TAG, "Estoy en OnStop");
        }

        @Override
        protected void onDestroy () {
            super.onDestroy();
            Log.i(TAG, "Estoy en onDestroy");
        }
//clase del 27/02/2023

    //creo una función, con nombre goactivity2, es publica y no espera nada de respuesta
    //View es el tipo de dato(en este caso, un objeto que es la vista , por eso view)
    //view es el nombre de ese objeto que recibe la funcion
    public void gotoActivity2(View View){
        float result = Float.parseFloat(lado1Text.getText().toString()) * Float.parseFloat(lado2Text.getText().toString());
        String l1 = lado1Text.getText().toString();
        String l2 = lado2Text.getText().toString();
        String res = resultado.getText().toString();
        Intent pasarDato = new Intent(this,Pantalla_2.class);
        pasarDato.putExtra("Elresultado", String.valueOf(result));
        pasarDato.putExtra("Llamarlado1",l1);
        pasarDato.putExtra("Llamarlado2",l2);
        startActivity(pasarDato);
    }
}

