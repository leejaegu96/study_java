package com.web.EWord.test1;

class ListNode{
    private String data;    // 데이터 저장 변수
    public ListNode link;    // 다른 노드를 참조할 링크 노드
    
    public ListNode() {
        this.data = null;
        this.link = null;
    }
    
    public ListNode(String data) {
        this.data = data;
        this.link = null;
    }
    
    public ListNode(String data, ListNode link) {
        this.data = data;
        this.link = link;
    }
    
    public String getData() {
        return this.data;
    }
}

public class LinkedList {
	
	private ListNode head;
    
    public LinkedList() {
        head = null; 
    }
    
    public void insertNode(ListNode preNode, String data) {       
        ListNode newNode = new ListNode(data); 
        
        newNode.link = preNode.link;
        
        preNode.link = newNode;
    }
    
    public void insertNode(String data) {
        ListNode newNode = new ListNode(data); 
        if(head == null) {
            this.head = newNode;
        } else {
            ListNode tempNode = head;
            
            while(tempNode.link != null) {
                tempNode = tempNode.link; 
            }
            tempNode.link = newNode;
        }
    }
    
    public void deleteNode(String data) {
        ListNode preNode = head;
        ListNode tempNode = head.link; 
        
        if(data.equals( preNode.getData() )) {
            head = preNode.link;
            preNode.link = null;
        } else {
            while(tempNode != null) {
                if(data.equals( tempNode.getData() )) {
                    if(tempNode.link == null) {
                        preNode.link = null;
                    } else {
                        preNode.link = tempNode.link;
                        tempNode.link = null;
                    }
                    break;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.link;
                }
            }
        }
    }
    
    public void deleteNode() {
        ListNode preNode;
        ListNode tempNode;
        
        if(head == null) {
            return;
        }
        
        if(head.link == null) {
            head = null;
        } else {
            preNode = head;
            tempNode = head.link;     
            
            while(tempNode.link != null) {
                preNode = tempNode;
                tempNode = tempNode.link;
            }
            
            preNode.link = null;
        }
    }
    
    public ListNode searchNode(String data) {
        ListNode tempNode = this.head; 
        
        while(tempNode != null) {
            if(data.equals(tempNode.getData())) {
                return tempNode;
            } else {
                tempNode = tempNode.link;
            }
        }
        
        return tempNode;
    }
    
    public void reverseList() {
        ListNode nextNode = head; 
        ListNode currentNode = null;
        ListNode preNode = null;
        
        while(nextNode != null) {
            preNode = currentNode; 
            currentNode = nextNode; 
            nextNode = nextNode.link; 
            currentNode.link = preNode; 
        }
        
        head = currentNode; 
    }
    
    public void printList() {
        ListNode tempNode = this.head; 
        
        while(tempNode != null) {
            System.out.print(tempNode.getData() + " ");
            tempNode = tempNode.link; 
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();    // 연결 리스트 생성
        String str = "wed";
        
        linkedList.insertNode("sun");
        linkedList.insertNode("mon");
        linkedList.insertNode("tue");
        linkedList.insertNode("wed");
        linkedList.insertNode("thu");
        linkedList.insertNode("fri");
        linkedList.insertNode("sat");
        linkedList.printList();
        
        System.out.println(linkedList.searchNode(str).getData());
        
        linkedList.deleteNode(linkedList.searchNode(str).getData());
        linkedList.printList();
        
        str = "sun";
        
        linkedList.deleteNode(linkedList.searchNode(str).getData());
        linkedList.printList();
        
        linkedList.reverseList();
        linkedList.printList();

	}

}
