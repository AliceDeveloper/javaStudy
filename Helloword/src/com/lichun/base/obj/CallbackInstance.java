package com.lichun.base.obj;

public class CallbackInstance {
    // 安卓回调样例
    private Callback cb;
    private String cbString;

    public CallbackInstance(Callback cb) {
        this.cb = cb;
    }

    public void setCbString(String cbString) {
        this.cbString = cbString;
        if (cb != null) {
            cb.callback("我是回调数据：" + cbString);
        }
    }
}
