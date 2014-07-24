var exec = require('cordova/exec');

var mmbilling_exports = {
	init : function(success, error) {
		exec(success, error, "MMBiling", "init", []);
	},	
	query : function(paycode, tradeid, success, error) {
		exec(success, error, "MMBiling", "query", [paycode, tradeid]);
	},	
	order : function(paycode, count, success, error) {
		exec(success, error, "MMBiling", "order", [paycode, count]);
	},	
	subscribe : function(paycode, count, nextcycle, data, success, error) {
		exec(success, error, "MMBiling", "subscribe", [paycode, count, nextcycle, data]);
	},	
	unsubscribe : function(paycode, success, error) {
		exec(success, error, "MMBiling", "unsubscribe", [paycode]);
	},	
};

exports = mmbilling_exports;
