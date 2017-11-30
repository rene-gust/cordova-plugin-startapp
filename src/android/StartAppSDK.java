package com.renegust.startappsdk;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import de.renegust.android.startapp.ActivityBridge;
import android.app.Activity;
import com.startapp.android.publish.adsCommon.StartAppAd;

public class StartAppSDK extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("showInterstitial")) {
            StartAppAd.showAd(ActivityBridge.getMainActivity());
            return true;
        } else {
            return false;
        }
    }
}
