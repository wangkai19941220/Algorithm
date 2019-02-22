/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package MinimunSpanTrees;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/2/20
 */
public class Edge <Weight extends Number & Comparable> implements Comparable<Edge>{

    private int a,b;
    private Weight weight;

    public Edge(int a,int b,Weight weight){
        this.a=a;
        this.b=b;
        this.weight=weight;
    }

    public int v(){
        return a;
    }

    public int w(){
        return b;
    }

    public Weight wt(){
        return weight;
    }

    public int other(int x){
        assert x==a|| x==b;
        return x==a ? b : a;
    }

    public String toString(){
        return ""+a+"-"+b+":"+weight;
    }

    @Override
    public int compareTo(Edge o) {
        if (weight.compareTo(o.weight)>0){
            return +1;
        }else if(weight.compareTo(o.weight)<0) {
            return -1;
        }else {
            return 0;
        }

    }
}