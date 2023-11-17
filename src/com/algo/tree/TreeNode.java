package com.algo.tree;

import lombok.Data;

/**
 * 树
 *
 * @author: Feng YuJie
 * @create: 2023/11/17 13:56
 */
@Data
public class TreeNode<T> {

    private T value;

    private TreeNode<T> left;

    private TreeNode<T> right;

}
