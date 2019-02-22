/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package GraphBasics;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/2/15
 */
public class Main {

    public static void main(String[] args) {
        // 使用两种图的存储方式读取testG1.txt文件
        String filename = "/Users/wangkai/IdeaProjects/Algorithm/src/GraphBasics/testG1.txt";
        SparseGraph g1 = new SparseGraph(13, false);
        ReadGraph readGraph1 = new ReadGraph(g1, filename);
        System.out.println("test G1 in Sparse Graph:");
        g1.show();

        System.out.println();

        DenseGraph g2 = new DenseGraph(13, false);
        ReadGraph readGraph2 = new ReadGraph(g2 , filename );
        System.out.println("test G1 in Dense Graph:");
        g2.show();
    }
}