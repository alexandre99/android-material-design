package br.com.materialtheme;

import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by italo.teixeira on 13/11/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView featuredImage;
    public TextView title;
    public TextView desc;
    public AppCompatButton btnLink;

    public ViewHolder(View itemView) {
        super(itemView);
        this.featuredImage = itemView.findViewById(R.id.featuredImage);
        this.title = itemView.findViewById(R.id.title);
        this.desc = itemView.findViewById(R.id.desc);
        this.btnLink = itemView.findViewById(R.id.btnLink);
    }
}
