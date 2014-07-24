# Cordova Plugin for China Mobile Billing #

This plugin adds support to receive payment via China Mobile Billing in cordova apps or games

# How to Use #

	cordova plugin add https://github.com/floatinghotpot/cordova-plugin-chinammbilling.git \
	--variable APP_ID=<your appId> --variable APP_KEY=<your appkey> \
	--variable APP_PACKAGE_ID=<your app package id>
	
Note: 
- You need register and apply the appID and appKey from http://dev.10086.cn/.
- You need register a pay code for each payment point.
	
# Javascript APIs #

- init();
- query( paycode, tradeId );
- order( paycode, orderCount );
- subscribe( payCode, orderCount, nextCycle, data );
- unsubscribe( paycode );

# Events #

- onInitFinish, event data = { returnCode:int }
- onQueryFinish, event data = { returnCode:int, returnObject:{key:value} }
- onBillingFinish, event data = { returnCode:int, returnObject:{key:value} } 
- onUnsubscribeFinish, event data = { returnCode:int }

# Example Code #

```javascript


```

# Credit #



# License #

