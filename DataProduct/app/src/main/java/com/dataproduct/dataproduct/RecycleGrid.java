package com.dataproduct.dataproduct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecycleGrid extends AppCompatActivity {

    private RecyclerView recyclerViewProductos;
    private RecicleViewAdapter recicleViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_grid);

        //instanciamos nuestro recycleview con el del layout activity recycle
        recyclerViewProductos = findViewById(R.id.recycleproduts);
        //definos la forma de la lista vertical en forma de un listview
        recyclerViewProductos.setLayoutManager(new LinearLayoutManager(this));

        //enviamos toda la informacion agregada nuestra
        // lista a nuestro adaptador mediante la siguiente
        // linea de codigo asignamos toda esta informacion en el recycleview de nuestro layout
        recicleViewAdapter = new RecicleViewAdapter(ObtenerProductos());
        recyclerViewProductos.setAdapter(recicleViewAdapter);



    }

    //creo una funcion tipo lista contendra los datos con los que se trabajaran

    public List<ModelProductos> ObtenerProductos() {

        //traer mis intenciones del main activity
        Bundle datos = getIntent().getExtras();

        String nombproduct1 = datos.getString("Nombre Producto 1").toString();
        String nombproduct2 = datos.getString("Nombre Producto 2").toString();
        String nombproduct3 = datos.getString("Nombre Producto 3").toString();

        Integer valproduct1 = datos.getInt("Valor 1");
        Integer valproduct2 = datos.getInt("Valor 2");
        Integer valproduct3 = datos.getInt("Valor 3");

        Integer sum = (valproduct1 + valproduct2 + valproduct3);

        Integer cantidad1 = datos.getInt("Cantidad 1");
        Integer cantidad2 = datos.getInt("Cantidad 2");
        Integer cantidad3 = datos.getInt("Cantidad 3");

        Integer sum1 = (cantidad1 + cantidad2 + cantidad3);

        Integer tol1 = (valproduct1 * cantidad1);
        Integer tol2 = (valproduct2 * cantidad2);
        Integer tol3 = (valproduct3 * cantidad3);

        Integer sum2 = (tol1 + tol2 + tol3);

        //listamos los datos
        List<ModelProductos> productos = new ArrayList<>();
        //SI HAY UNA IMAGEN SE LE PUEDE AGREGAR AL FINAL UN 2.R.drawable.enrique
        productos.add(new ModelProductos(nombproduct1, valproduct1, cantidad1, tol1));
        productos.add(new ModelProductos(nombproduct2, valproduct2, cantidad2, tol2));
        productos.add(new ModelProductos(nombproduct3, valproduct3, cantidad3, tol3));
        productos.add(new ModelProductos(null,sum,sum1,sum2));
        return productos;

    }
}
