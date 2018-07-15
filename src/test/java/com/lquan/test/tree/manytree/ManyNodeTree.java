
package com.lquan.test.tree.manytree;   

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**   

 * Filename:    ManyNodeTree.java   
 * Copyright:   Copyright (c)2010  
 * @author  :   lquan
 * E-mail   :	lquan.liu@outlook.com
 * @version :   1.0   
 * @since   :  	JDK 7
 * Create at:   Jul 15, 2018 4:57:16 PM   
 * Description:  多叉树生成、遍历工具 
 *   

 * Modification History:   
 * Date    Author      Version     Description   
 * ----------------------------------------------------------------- 
 * Jul 15, 2018 lquan      1.0     1.0 Version   

 */

@Data
public class ManyNodeTree {
	
    /** 树根*/  
    private ManyTreeNode root;

    /**
     * 
     * <p>Title: 构造方法<／p>
     * <p>Description: <／p>
    
     * @param root
     */
	public ManyNodeTree() {
		this.root = new ManyTreeNode(new TreeNode("root"));
	}
    
	 public ManyNodeTree createTree(List<TreeNode> treeNodes) {  
	        if(treeNodes == null || treeNodes.size() < 0)  
	            return null;  
	          
	        ManyNodeTree manyNodeTree =  new ManyNodeTree();  
	          
	        //将所有节点添加到多叉树中  
	        for(TreeNode treeNode : treeNodes){  
	            if(treeNode.getParentId().equals("root")){  
	                //向根添加一个节点  
	               // manyNodeTree.getRoot().getChildList().add(new ManyTreeNode(treeNode));  
	                ManyTreeNode root = manyNodeTree.getRoot();
	                List<ManyTreeNode> childList = root.getChildList()==null?new ArrayList<ManyTreeNode>():root.getChildList();
	                childList.add(new ManyTreeNode(treeNode));
	            }else{  
	                addChild(manyNodeTree.getRoot(), treeNode);  
	            }  
	        }  
	          
	        return manyNodeTree;  
	    }  
	 
	 
	 /** 
	     * 向指定多叉树节点添加子节点 
	     *  
	     * @param manyTreeNode 多叉树节点 
	     * @param child 节点 
	     */  
	    public void addChild(ManyTreeNode manyTreeNode, TreeNode child){ 
	    	if(manyTreeNode.getChildList()!=null){
	    		 for(ManyTreeNode item : manyTreeNode.getChildList()){  
	 	            if(item.getData().getNodeId().equals(child.getParentId())){  
	 	                //找到对应的父亲  
	 	                item.getChildList().add(new ManyTreeNode(child));  
	 	                break;  
	 	            }else{  
	 	                if(item.getChildList() != null && item.getChildList().size() > 0){  
	 	                    addChild(item, child);  
	 	                }                 
	 	            }  
	 	        }  
	    	}
	       
	    }  
	    
	    /** 
	     * 遍历多叉树  
	     *  
	     * @param manyTreeNode 多叉树节点 
	     * @return  
	     */  
	    public String iteratorTree(ManyTreeNode manyTreeNode)  
	    {  
	        StringBuilder buffer = new StringBuilder();  
	        buffer.append("\n");  
	          
	        if(manyTreeNode != null){ 
	        	if(manyTreeNode.getChildList()!=null){
	        		 for (ManyTreeNode index : manyTreeNode.getChildList()){  
	 	                buffer.append(index.getData().getNodeId()+ ",");  
	 	                  
	 	                if (index.getChildList() != null && index.getChildList().size() > 0 )   
	 	                {     
	 	                    buffer.append(iteratorTree(index));  
	 	                }  
	 	            }  
	        	}
	           
	        }  
	          
	        buffer.append("\n");  
	          
	        return buffer.toString();  
	    }  
    
	    public static void main(String[] args){  
	        List<TreeNode> treeNodes = new ArrayList<TreeNode>();  
	            treeNodes.add(new TreeNode("系统权限管理", "root"));  
	            treeNodes.add(new TreeNode("用户管理", "系统权限管理"));  
	            treeNodes.add(new TreeNode("角色管理", "系统权限管理"));  
	            treeNodes.add(new TreeNode("组管理", "系统权限管理"));  
	            treeNodes.add(new TreeNode("用户菜单管理", "系统权限管理"));  
	            treeNodes.add(new TreeNode("角色菜单管理", "系统权限管理"));  
	            treeNodes.add(new TreeNode("用户权限管理", "系统权限管理"));  
	            treeNodes.add(new TreeNode("站内信", "root"));  
	            treeNodes.add(new TreeNode("写信", "站内信"));  
	            treeNodes.add(new TreeNode("收信", "站内信"));  
	            treeNodes.add(new TreeNode("草稿", "站内信"));  
	              
	            ManyNodeTree tree = new ManyNodeTree();  
	            //创建树
	            ManyNodeTree manyNodeTree = tree.createTree(treeNodes);
	            System.out.println(manyNodeTree);
	              
	           // System.out.println(tree.iteratorTree(tree.createTree(treeNodes).getRoot()));  
	    } 
}
  


