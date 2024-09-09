package com.example.projetolistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {

    private ListView listaItens;
    private String[] itens = {
            "ANGRA DOS REIS", "CALDAS NOVAS",
            "CAMPOS DO JORDÃO", "COSTA DO SAUÍPE",
            "ILHÉUS","PORTO SEGURO", "RIO DE JANEIRO",
            "TIRADENTES", "PRAGA", "SANTIAGO", "ZURIQUE",
            "CARIBE", "BUENOS AIRES", "BUDAPEST", "CANCUN",
            "ARUBA", "MANAUS", "CAÇADOR", "BREMEN"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItens = findViewById(R.id.listViewId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaItens.setAdapter(adaptador);

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int posicao = i;
                String valor = listaItens.getItemAtPosition(posicao).toString();
                Toast.makeText(getApplicationContext(), valor, Toast.LENGTH_SHORT).show();
            }
        });
    }
}