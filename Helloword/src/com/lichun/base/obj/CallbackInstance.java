package com.lichun.base.obj;

public class CallbackInstance {

    // 安卓回调样例
    private Callback cb;
    private String cbString;

    public CallbackInstance(Callback cb) {
        this.cb = cb;
    }

    private String getCbString() {
        return cbString;
    }

    public void setCbString(String cbString) {
        this.cbString = cbString;
        if (this.cb != null) {
            this.cb.callback("我是回调数据：" + this.getCbString());
        }
    }
}
