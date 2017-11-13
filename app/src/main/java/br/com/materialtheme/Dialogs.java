package br.com.materialtheme;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class Dialogs extends AppCompatActivity {

    private AppCompatButton btnAlert;
    private AppCompatButton btnItems;
    private AlertDialog alertDialog;
    private AlertDialog dialogItems;
    private String [] items = {"Item 1", "Item 2", "Item 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);


        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialog);
        builder.setMessage("Deseja excluir?");
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Dialogs.this, "Sim", Toast.LENGTH_LONG).show();
            }
        });

        builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Dialogs.this, "Não", Toast.LENGTH_LONG).show();
            }
        });


        AlertDialog.Builder builderDialogItems = new AlertDialog.Builder(this);
        builderDialogItems.setTitle("Selecione a opção desejada");
//        builderDialogItems.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(Dialogs.this, items[i], Toast.LENGTH_LONG).show();
//            }
//        });

        builderDialogItems.setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                Toast.makeText(Dialogs.this, items[i] + ":" + b, Toast.LENGTH_LONG).show();
            }
        });
        builderDialogItems.setPositiveButton("OK", null);
        builderDialogItems.setNegativeButton("CANCELAR", null);


        alertDialog = builder.create();
        dialogItems = builderDialogItems.create();

        btnAlert = (AppCompatButton) findViewById(R.id.btnAlert);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.show();
            }
        });

        btnItems = (AppCompatButton) findViewById(R.id.btnDialogsItems);
        btnItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogItems.show();
            }
        });

    }
}
