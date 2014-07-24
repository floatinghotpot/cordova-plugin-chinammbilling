package com.rjfun.cordova.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class MMBiling extends CordovaPlugin {
	
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
            int count = args.getString(1);
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
            this.unsubscribe(paycode, callbackContext);
            return true;
            
        } else {
        	
        }
        return false;
    }

    private void mmInit(CallbackContext callbackContext) {
    	String appId, appKey;
    	try {
    	    ApplicationInfo ai = getPackageManager().getApplicationInfo(cordova.getActivity().getPackageName(), PackageManager.GET_META_DATA);
    	    Bundle bundle = ai.metaData;
    	    appId = bundle.getString("my_api_id");
    	    appKey = bundle.getString("my_api_key");
    	} catch (NameNotFoundException e) {
    	    Log.e(TAG, "Failed to load meta-data, NameNotFound: " + e.getMessage());
    	} catch (NullPointerException e) {
    	    Log.e(TAG, "Failed to load meta-data, NullPointer: " + e.getMessage());         
    	}
    	
    	// setAppInfo( appId, appKey );
    	
    	// init(context, new listener());
    	
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
    
}
