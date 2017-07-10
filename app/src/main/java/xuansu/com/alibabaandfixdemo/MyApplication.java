package xuansu.com.alibabaandfixdemo;

import android.app.Application;
import android.util.Log;

import com.alipay.euler.andfix.patch.PatchManager;

/**
 * Created by xuansu on 2017/7/9.
 */

public class MyApplication extends Application {
   static PatchManager  mPatchManager;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("andfix","c初始化");
        mPatchManager=new PatchManager(this);
        mPatchManager.init("1.0");//current version
        mPatchManager.removeAllPatch();
        mPatchManager.loadPatch();
    }


}
