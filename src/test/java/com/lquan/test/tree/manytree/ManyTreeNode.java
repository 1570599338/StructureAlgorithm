
package com.lquan.test.tree.manytree;   

import java.util.List;

import lombok.Data;

/**   

 * Filename:    ManyTreeNode.java   
 * Copyright:   Copyright (c)2010  
 * @author  :   lquan
 * E-mail   :	lquan.liu@outlook.com
 * @version :   1.0   
 * @since   :  	JDK 7
 * Create at:   Jul 15, 2018 4:39:37 PM   
 * Description:  多叉树的节点
 *   
 
 * Modification History:   
 * Date    Author      Version     Description   
 * ----------------------------------------------------------------- 
 * Jul 15, 2018 lquan      1.0     1.0 Version   

 */

@Data
public class ManyTreeNode {
	
	/** 树节点*/  
    private TreeNode data;  
    /** 子树集合*/  
    private List<ManyTreeNode> childList;
    
    /**
     * 
    
     * <p>Title:构造函数 <／p>
    
     * <p>Description: <／p>
    
     * @param data
     */
	public ManyTreeNode(TreeNode data) {
		super();
		this.data = data;
	}

	/**
	 * 
	
	 * <p>Title:构造函数 <／p>
	
	 * <p>Description: <／p>
	
	 * @param data
	 * @param childList
	 */
	public ManyTreeNode(TreeNode data, List<ManyTreeNode> childList) {
		super();
		this.data = data;
		this.childList = childList;
	}  
    
    

}
  


