package com.rjfun.cordova.plugin;

import java.util.HashMap;

import mm.purchasesdk.OnPurchaseListener;
import mm.purchasesdk.Purchase;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;

/**
 * This class echoes a string called from JavaScript.
 */
public class MMBiling extends CordovaPlugin implements OnPurchaseListener {
	private static final String TAG = "MMBillingPlugin";
	
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("init")) {
            String message = args.getString(0);
            this.mmInit(callbackContext);
            return true;
            
        } else if(action.equals("query")) {
            String paycode = args.getString(0);
            String tradeid = args.getString(1);
            this.mmQuery(paycode, tradeid, callbackContext);
            return true;
            
        } else if(action.equals("order")) {
            String paycode = args.getString(0);
            int count = args.getInt(1);
            this.mmOrder(paycode, count, callbackContext);
            return true;
            
        } else if(action.equals("subscribe")) {
            String paycode = args.getString(0);
            int count = args.getInt(1);
            boolean nextcycle = args.getBoolean(2);
            String data = args.getString(3);
            this.mmSubscribe(paycode, count, nextcycle, data, callbackContext);
            return true;
            
        } else if(action.equals("unsubscribe")) {
            String paycode = args.getString(0);
            this.mmUnsubscribe(paycode, callbackContext);
            return true;
            
        } else {
        	
        }
        return false;
    }

    private void mmInit(CallbackContext callbackContext) {
    	String appId = null, appKey = null;
    	try {
    		PackageManager pm = cordova.getActivity().getPackageManager();
    	    ApplicationInfo ai = pm.getApplicationInfo(cordova.getActivity().getPackageName(), PackageManager.GET_META_DATA);
    	    Bundle bundle = ai.metaData;
    	    appId = bundle.getString("my_api_id");
    	    appKey = bundle.getString("my_api_key");
    	} catch (NameNotFoundException e) {
    	    Log.e(TAG, "Failed to load meta-data, NameNotFound: " + e.getMessage());
    	} catch (NullPointerException e) {
    	    Log.e(TAG, "Failed to load meta-data, NullPointer: " + e.getMessage());         
    	}
    	
    	Purchase pur = Purchase.getInstance();
    	pur.setAppInfo( appId, appKey );
    	pur.init(cordova.getActivity(), this);
    	
    	if( true ) {
            callbackContext.success("ok");
        } else {
            callbackContext.error("error msg.");
        }
    }
    
    private void mmQuery(String paycode, String tradeid, CallbackContext callbackContext) {
    	// init(context, new listener());
    	if( true ) {
            callbackContext.success("ok");
        } else {
            callbackContext.error("error msg.");
        }
    }    
    
    private void mmOrder(String paycode, int count, CallbackContext callbackContext) {
    	// init(context, new listener());
    	if( true ) {
            callbackContext.success("ok");
        } else {
            callbackContext.error("error msg.");
        }
    }    
    
    private void mmSubscribe(String paycode, int count, boolean nextcycle, String data, CallbackContext callbackContext) {
    	// init(context, new listener());
    	if( true ) {
            callbackContext.success("ok");
        } else {
            callbackContext.error("error msg.");
        }
    }   
    
    private void mmUnsubscribe(String paycode, CallbackContext callbackContext) {
    	// init(context, new listener());
    	if( true ) {
            callbackContext.success("ok");
        } else {
            callbackContext.error("error msg.");
        }
    }

	@Override
	public void onAfterApply() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAfterDownload() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBeforeApply() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBeforeDownload() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBillingFinish(int arg0, HashMap arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onInitFinish(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onQueryFinish(int arg0, HashMap arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUnsubscribeFinish(int arg0) {
		// TODO Auto-generated method stub
		
	}    
    
}
