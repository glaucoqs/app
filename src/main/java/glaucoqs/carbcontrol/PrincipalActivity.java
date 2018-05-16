package glaucoqs.carbcontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;

import java.nio.file.Files;

public class PrincipalActivity extends AppCompatActivity {

    EditText razaoIC;                                                   //Componentes do sistema.
    Spinner categoria , alimento , medida , quantidade;
    GridView lista;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        razaoIC=(EditText) findViewById(R.id.razaoIC);
        categoria = (Spinner) findViewById(R.id.novo_categoria);
        alimento = (Spinner) findViewById(R.id.alimento);           //Determinando o ID dos Componentes.
        medida = (Spinner) findViewById(R.id.medida);
        quantidade = (Spinner) findViewById(R.id.quantidade);


        findViewById(R.id.button_novo).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivityForResult(new Intent(PrincipalActivity.this, AdicionarActivity.class),0);
                    }
                }
        );


    }
}
