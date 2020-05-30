package com.Lemon.Spring3.Proxy;

public class Test {

    public static void main(String[] args) {

        ProxyUtil proxyUtil = new ProxyUtil(new MathImpl());

        Math math = (Math) proxyUtil.getProxy();

        int result = math.div(4, 1);

        System.out.println(result);

    }

}
