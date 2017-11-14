package br.com.materialtheme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Slide slide = new Slide();
        getWindow().setEnterTransition(slide);

    }
}
