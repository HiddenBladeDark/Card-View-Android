package com.dataproduct.dataproduct;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//creamos el adaptador de la clase de recycleview adapter
public class RecicleViewAdapter extends RecyclerView.Adapter<RecicleViewAdapter.ViewHolder> {

//los adaptadores para el recycle debe contener una clase interna que extienda de la clase ViewHolder

    public static class ViewHolder extends RecyclerView.ViewHolder{
        //creo las variables
        private TextView NombreProduct, valor,cantidad, total;

        //creo el metodo constructor de la clase interna y vinculo cada una de las variables
        // creadas con los controles respectivos del layout


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            NombreProduct = itemView.findViewById(R.id.txtnompro);
            valor = itemView.findViewById(R.id.txtvalpro);
            cantidad= itemView.findViewById(R.id.txtcantpro);
            total= itemView.findViewById(R.id.txttolprod);

        }
    }

    //creo una variable tipo array para que nos muestre los datos almacenados en cada item

    public List<ModelProductos> Productoslista;


    //luego creo el metodo construcot del adaptador de la lista creada
    public RecicleViewAdapter(List<ModelProductos> productos) {
        Productoslista = productos;
    }


    //oncreateviewholder se encarga par inflar(es el procedimiento para ser uso de un layout dentro de un layout)
    // un nuevo item para la lista


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //en este caso nuestro layout item producto tiene como destino ser parte de nuestro layout activity main
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_producto,parent,false);
        //instanciamos el viewholder
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    //metodo onBindViewHolder es el metodo para realizar las modifcaciones del contenido apra cada item


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.NombreProduct.setText(Productoslista.get(position).getProduct());
        holder.valor.setText(""+Productoslista.get(position).getValor());
        holder.cantidad.setText(""+Productoslista.get(position).getCantidad());
        holder.total.setText(""+Productoslista.get(position).getTol1());

    }

    //metodo nos sirve para definir la cantidad de elementos que se procesara

    @Override
    public int getItemCount() {
        return Productoslista.size();
    }
}
