package br.com.materialtheme;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SelectionControls extends AppCompatActivity {

    private SwitchCompat switchCompat;
    private AppCompatCheckBox checkBox;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_controls);

        switchCompat = (SwitchCompat) findViewById(R.id.switchButton);

        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(SelectionControls.this, "Ligado", Toast.LENGTH_LONG).show();
                }  else {
                    Toast.makeText(SelectionControls.this, "Desligado", Toast.LENGTH_LONG).show();
                }
            }
        });

        checkBox = (AppCompatCheckBox) findViewById(R.id.checkboxButton);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(SelectionControls.this, "Selecionado", Toast.LENGTH_LONG).show();
                }  else {
                    Toast.makeText(SelectionControls.this, "Não selecionado", Toast.LENGTH_LONG).show();
                }
            }
        });

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.option1:
                        System.out.println(Toast.makeText(SelectionControls.this, "Opção 1", Toast.LENGTH_SHORT));
                        break;

                    case R.id.option2:
                        System.out.println(Toast.makeText(SelectionControls.this, "Opção 2", Toast.LENGTH_SHORT));
                        break;

                    case R.id.option3:
                        System.out.println(Toast.makeText(SelectionControls.this, "Opção 3", Toast.LENGTH_SHORT));
                        break;
                }
            }
        });
    }
}
