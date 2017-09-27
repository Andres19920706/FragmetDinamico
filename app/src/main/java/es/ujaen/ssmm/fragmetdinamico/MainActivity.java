package es.ujaen.ssmm.fragmetdinamico;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class MainActivity extends Activity {
    private Button add_fragment ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obteniendo la instancia del botón add_fragment
        add_fragment = (Button) findViewById(R.id.add_fragment);

        //Seteando la escucha del botón
        add_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Paso 1: Obtener la instancia del administrador de fragmentos
                FragmentManager fragmentManager = getFragmentManager();

                //Paso 2: Crear una nueva transacción
                FragmentTransaction transaction = fragmentManager.beginTransaction();

                //Paso 3: Crear un nuevo fragmento y añadirlo
                CountFragment fragment = new CountFragment();
                transaction.add(R.id.fragment2, fragment);

                //Paso 4: Confirmar el cambio
                transaction.commit();


            }
        });
    }
}
