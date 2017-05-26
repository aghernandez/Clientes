package com.example.ghernandez.users;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ghernandez on 23/05/2017.
 */

public class adapter extends RecyclerView.Adapter<adapter.PersonaViewHolder> {
    MainActivity mainActivity;

    public static class PersonaViewHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView correo;

        public PersonaViewHolder(View itemView) {
            super(itemView);
            nombre =(TextView)itemView.findViewById(R.id.name);
            correo =(TextView)itemView.findViewById(R.id.correo);
        }
    }

    @Override
    public PersonaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista = mainActivity.getLayoutInflater().inflate(R.layout.contactos,null);
        return new PersonaViewHolder(vista) ;
    }

    @Override
    public void onBindViewHolder(PersonaViewHolder holder, int position) {
        final persona Persona = Recycler.usuarios.get(position);
        PersonaViewHolder mv = holder;
        mv.nombre.setText(Persona.nombre);
        mv.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),Persona.nombre,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(),Recycler.class);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {

        return Recycler.usuarios.size();
    }

}
