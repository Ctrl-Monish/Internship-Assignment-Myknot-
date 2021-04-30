package com.projects.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.projects.myapplication.singleton.Dialogue;



import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Dialogue dialogue;
    String link, image, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialogue = new Dialogue(this);

        //network call
        myRequest request = new myRequest();
        Call<myResponse> responseCall = ApiClient.getLinkDetails().saveDetail(request);
        responseCall.enqueue(new Callback<myResponse>() {
            @Override
            public void onResponse(Call<myResponse> call, Response<myResponse> response) {
                if(response.isSuccessful()){
                    title = response.body().getTitle();
                    Log.e("MainActivity", "Got Response " + title);
                    image = response.body().getImageURL();
                    Log.e("MainActivity", "image link is: " + image);
                    link = response.body().getSuccess_url();
                    Log.e("MainActivity", "link is: " + link);
                    dialogue.showDialogBox(title, image, link);
                }else{
                    Log.e("MainActivity", "NO Response");
                }
            }

            @Override
            public void onFailure(Call<myResponse> call, Throwable t) {
                Log.e("MainActivity", "NO Response");
            }
        });

    }
}