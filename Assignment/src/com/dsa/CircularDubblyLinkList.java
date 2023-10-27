package com.dsa;

import java.util.Scanner;

class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

public class CircularDubblyLinkList {

	 Node root,last;
	 
	 void createList()
	    {
	        root=last=null;
	    }
	 
	 void insertLeft(int e)
	 {
		 Node n=new Node(e);
		 if(root==null)
			 {
			 root=last=n;
			 last.right=root;
			 root.left=last;
			 }
		 else
		 {
			 n.right=root;
			 root=n;
			 last.right=root;
			 root.left=last;
		 }
	 }
	 
	 void deleteLeft()
	 {
		 if(root==null)//no root
				System.out.println("Empty List");
			else
			{
				Node t=root;//1
				if(root==last)
					root=last=null;
				else
				{
					root=root.right;
					last.right=root;
					root.left=last;
				}
			System.out.println("Deleted: "+t.data);
			}
		 
	 }
	 
	 void insertRight(int e)
	    {
	       Node n=new Node(e);//node created 
	       if(root==null)//no root
	           root=last=n;
	       else
	       {
	        Node t=root;//1
	        last.right=n;
			last=n;
			last.right=root;
			root.left=last;
	       
	       }
	    }
	 
	 void deleteRight()
	    {
	       if(root==null)//no root
	           System.out.println("Empty List");
	       else
	       {
	        Node t=root;//1
	        Node t2=t;
	        while(t!=last) {
				t2=t;
				t=t.right;
			}
			if(t==root) {
				root=last=null;
			}
			else {
				last=t2;
				last.right=root;
				root.left=last;
			}
			System.out.println("Deleted: "+t.data);
		}
	    }
	 
	 
	 void printList()
	    {
	       if(root==null)//no root
	           System.out.println("Empty List");
	       else
	       {
	           Node t=root;
	           do {
					System.out.print("|"+t.data+"|-->");
					t=t.right;
				}while(t!=root);
	       }
	    }
	 
	 
	 
	 
	 public static void main(String[] args) {
		 CircularDubblyLinkList obj = new CircularDubblyLinkList();
			Scanner sc = new Scanner(System.in);
			int choice;
			obj.createList();
			do {
				int e;
				System.out.println("\n1. Insert Left\n2. Insert Right\n3. Delete Left\n4. Delete Right\n5. Print\n0. Exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
						System.out.println("Enter Element");
						e = sc.nextInt();
						obj.insertLeft(e);
					break;
				case 2:
					System.out.println("Enter Element");
					e = sc.nextInt();
					obj.insertRight(e);
				break;
				case 3:
					obj.deleteLeft();
					break;
				case 4:
					obj.deleteRight();
				break;
				case 5:
					obj.printList();
					break;
				case 0:
					System.out.println("Coded by Tejas!");
					break;
				default:
					System.out.println("Wrong Choice");
					break;
				}
			}while(choice!=0);
		}
	 
	 
	 
	 
	 
	 
	 
}
