package com.gl.services;

import com.gl.model.Node;

public class BstServices {
	Node skewedTreeNode = null;
    Node tempPrevNode = null;

    public void inOrder(Node root) {
        if (root == null) return;
        else {
            inOrder(root.left);
            System.out.print(root.getData() + " ");
            inOrder(root.right);
        }
    }
    public Node convertBSTIntoRightSkewedBST(Node root) {

        if (root == null) {
            return skewedTreeNode;
        }

        convertBSTIntoRightSkewedBST(root.left);

        if (skewedTreeNode == null) {
            skewedTreeNode = root;
        } else {
            tempPrevNode.right = root;
        }
        tempPrevNode = root;
        root.left = null;

        convertBSTIntoRightSkewedBST(root.right);

        return skewedTreeNode;
    }
}
