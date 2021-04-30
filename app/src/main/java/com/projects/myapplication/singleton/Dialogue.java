package com.projects.myapplication.singleton;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.github.andreilisun.swipedismissdialog.SwipeDismissDialog;
import com.projects.myapplication.R;

import java.net.URL;

public class Dialogue {
    SwipeDismissDialog showdialog;
    Button btnscs;
    public TextView title;
    ImageView image;
    private Context context;

    public Dialogue(Context context){
        this.context = context;
    }
    public void showDialogBox(String head, String image_link, String link){
        View dialog = LayoutInflater.from(context).inflate(R.layout.dialog_box, null);
        showdialog = new SwipeDismissDialog.Builder(context)
                .setView(dialog)
                .build()
                .show();
        title = dialog.findViewById(R.id.titletv);
        title.setText(head);

        image = dialog.findViewById(R.id.imagev);
        Glide.with(dialog).load(image_link).into(image);

        btnscs = dialog.findViewById(R.id.btn_success);
        btnscs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(link);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
            }
        });
    }
}
