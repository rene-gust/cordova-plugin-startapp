/*global cordova, module*/

module.exports = {
    showInterstitial: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "StartAppSDK", "showInterstitial", []);
    }
};
