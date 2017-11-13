package br.com.materialtheme;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ProgressBar extends AppCompatActivity {

    private android.widget.ProgressBar circularBar;
    private android.widget.ProgressBar linearBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        circularBar = (android.widget.ProgressBar) findViewById(R.id.circularBar);
        circularBar.setVisibility(View.GONE);

        linearBar = (android.widget.ProgressBar) findViewById(R.id.linearBar);
        linearBar.setProgress(0);
        linearBar.setSecondaryProgress(0);
        linearBar.setMax(100);

        new AssyncCircular().execute();

    }

    public class AssyncCircular extends AsyncTask<Void, Integer, Void> {

        @Override
        protected void onPreExecute() {
            circularBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            for (int i = 0; i < 100; i++) {
                try {
                    publishProgress(i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            linearBar.setProgress(values[0]);
            linearBar.setSecondaryProgress(values[0] + 15);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            circularBar.setVisibility(View.GONE);
        }
    }
}
