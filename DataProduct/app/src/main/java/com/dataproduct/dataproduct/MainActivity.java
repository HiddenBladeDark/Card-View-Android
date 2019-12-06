package com.dataproduct.dataproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnoms1,txtnoms2,txtnoms3;
    EditText txtvals1,txtvals2,txtvals3;
    EditText txtcants1,txtcants2,txtcants3;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtnoms1 = findViewById(R.id.txtnom);
        txtnoms2 = findViewById(R.id.txtnom1);
        txtnoms3 = findViewById(R.id.txtnom2);

        txtvals1 = findViewById(R.id.txtval);
        txtvals2 = findViewById(R.id.txtval1);
        txtvals3 = findViewById(R.id.txtval2);

        txtcants1 = findViewById(R.id.txtcant);
        txtcants2 = findViewById(R.id.txtcant1);
        txtcants3 = findViewById(R.id.txtcant2);


    }

    public void guardar(View view) {

        String nom1 = txtnoms1.getText().toString();
        String nom2 = txtnoms2.getText().toString();
        String nom3 = txtnoms3.getText().toString();

        Integer val1 = Integer.parseInt(txtvals1.getText().toString());
        Integer val2 = Integer.parseInt(txtvals2.getText().toString());
        Integer val3 = Integer.parseInt(txtvals3.getText().toString());

        Integer cant1 = Integer.parseInt(txtcants1.getText().toString());
        Integer cant2 = Integer.parseInt(txtcants2.getText().toString());
        Integer cant3 = Integer.parseInt(txtcants3.getText().toString());

        //Agregamos una condicion para saber si los datos no esten vacios y me los dirija directamente a la otra pestaña

        if(!nom1.isEmpty() && !nom2.isEmpty() && !nom3.isEmpty())
        {
            Intent intent = new Intent(MainActivity.this, RecycleGrid.class);
            intent.putExtra("Nombre Producto 1",nom1);
            intent.putExtra("Nombre Producto 2",nom2);
            intent.putExtra("Nombre Producto 3",nom3);
            intent.putExtra("Valor 1",val1);
            intent.putExtra("Valor 2",val2);
            intent.putExtra("Valor 3",val3);
            intent.putExtra("Cantidad 1",cant1);
            intent.putExtra("Cantidad 2",cant2);
            intent.putExtra("Cantidad 3",cant3);

            startActivity(intent);
            finish();
        }else{
            Toast.makeText(this, "Deje de ser tarado, y                                                                                                                                          usted sabe cual es el error...", Toast.LENGTH_SHORT).show();
        }


    }
}
