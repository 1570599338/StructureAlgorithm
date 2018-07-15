
package com.lquan.test.tree.manytree;   

import lombok.Data;

/**   
 * Filename:    TreeNode.java   
 * Copyright:   Copyright (c)2010  
 * @author  :   lquan
 * E-mail   :	lquan.liu@outlook.com
 * @version :   1.0   
 * @since   :  	JDK 7
 * Create at:   Jul 15, 2018 4:28:40 PM   
 * Description:  树节点
 *   

 * Modification History:   
 * Date    Author      Version     Description   
 * ----------------------------------------------------------------- 
 * Jul 15, 2018 lquan      1.0     1.0 Version   

 */

@Data
public class TreeNode {
	/**节点ID**/
	private String nodeId;
	/**父节点ID**/
	private String parentId;
	/**文本内容**/
	private String text;
	
	/**
	 * 
	
	 * <p>Title: 构造函数 <／p>
	
	 * <p>Description: <／p>
	
	 * @param nodeId
	 */
	public TreeNode(String nodeId){
		this.nodeId=nodeId;
	}
	
	
    /** 
     * 构造函数 
     *  
     * @param nodeId 节点Id 
     * @param parentId 父节点Id 
     */  
    public TreeNode(String nodeId, String parentId){  
        this.nodeId = nodeId;  
        this.parentId = parentId;  
    }


}
  


