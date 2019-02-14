/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package UnionFind;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/2/14
 */
public class UnionFindTestHelper {

    public static void testUF1(int n){
        UnionFind1 uf=new UnionFind1(n);

        long startTime=System.currentTimeMillis();

        for (int i=0;i<n;i++){
            int a=(int)(Math.random()*n);
            int b=(int)(Math.random()*n);
            uf.unionElements(a,b);
        }

        for (int i=0;i<n;i++){
            int a=(int)(Math.random()*n);
            int b=(int)(Math.random()*n);
            uf.isConnected(a,b);
        }
        long endTime=System.currentTimeMillis();

        System.out.println("UF1 ,"+2*n+"ops,"+(endTime-startTime)+"ms");
    }

    public static void testUF2(int n){
        UnionFind2 uf=new UnionFind2(n);

        long startTime=System.currentTimeMillis();

        for (int i=0;i<n;i++){
            int a=(int)(Math.random()*n);
            int b=(int)(Math.random()*n);
            uf.unionElements(a,b);
        }

        for (int i=0;i<n;i++){
            int a=(int)(Math.random()*n);
            int b=(int)(Math.random()*n);
            uf.isConnected(a,b);
        }
        long endTime=System.currentTimeMillis();

        System.out.println("UF1 ,"+2*n+"ops,"+(endTime-startTime)+"ms");
    }


    public static void testUF3(int n){
        UnionFind3 uf=new UnionFind3(n);

        long startTime=System.currentTimeMillis();

        for (int i=0;i<n;i++){
            int a=(int)(Math.random()*n);
            int b=(int)(Math.random()*n);
            uf.unionElements(a,b);
        }

        for (int i=0;i<n;i++){
            int a=(int)(Math.random()*n);
            int b=(int)(Math.random()*n);
            uf.isConnected(a,b);
        }
        long endTime=System.currentTimeMillis();

        System.out.println("UF1 ,"+2*n+"ops,"+(endTime-startTime)+"ms");
    }
    public static void testUF4(int n){
        UnionFind4 uf=new UnionFind4(n);

        long startTime=System.currentTimeMillis();

        for (int i=0;i<n;i++){
            int a=(int)(Math.random()*n);
            int b=(int)(Math.random()*n);
            uf.unionElements(a,b);
        }

        for (int i=0;i<n;i++){
            int a=(int)(Math.random()*n);
            int b=(int)(Math.random()*n);
            uf.isConnected(a,b);
        }
        long endTime=System.currentTimeMillis();

        System.out.println("UF1 ,"+2*n+"ops,"+(endTime-startTime)+"ms");
    }
    public static void testUF5(int n){
        UnionFind5 uf=new UnionFind5(n);

        long startTime=System.currentTimeMillis();

        for (int i=0;i<n;i++){
            int a=(int)(Math.random()*n);
            int b=(int)(Math.random()*n);
            uf.unionElements(a,b);
        }

        for (int i=0;i<n;i++){
            int a=(int)(Math.random()*n);
            int b=(int)(Math.random()*n);
            uf.isConnected(a,b);
        }
        long endTime=System.currentTimeMillis();

        System.out.println("UF1 ,"+2*n+"ops,"+(endTime-startTime)+"ms");
    }
}