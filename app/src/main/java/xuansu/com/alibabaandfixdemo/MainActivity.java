package xuansu.com.alibabaandfixdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,4/2 +"",Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPath();
            }
        });
    }

    private  void  addPath(){
        String  name= Environment.getExternalStorageDirectory()+ "/out.apatch";
        Log.i("andfix",name+"   "+new File(name).exists());
        if(new File(name).exists()){
            Log.i("andfix","开始加载");
            try {
                MyApplication.mPatchManager.addPatch(name);
                Log.i("andfix","加载完成");
            } catch (IOException e) {
                e.printStackTrace();
                Log.i("andfix","加载失败"+e.getMessage()+   "          "+e.getLocalizedMessage());
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
