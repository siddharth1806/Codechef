public class Main
{
  private static ListNode head;
  public static class ListNode
  {
    private int data;
    private ListNode next;

    public ListNode (int data)
    {
      this.data = data;
    }
  }
  public void display ()
  {
    ListNode var = head;
    while (var != null)
      {
	System.out.print (var.data + "->");
	var = var.next;
      }
    System.out.println ("null");
  }
  public int length ()
  {
    if (head == null)
      {
	return 0;
      }
    int count = 0;
    ListNode cur = head;
    while (cur != null)
      {
	count++;
	cur = cur.next;
      }
    return count;

  }
  public boolean searchvalue(int searchkey){
      ListNode current =head;
      while(current!=null){
          if(current.data==searchkey){
              return true;
          }
          current=current.next;
      }
      return false;
  }
  public void insertFirst (int value)
  {
    ListNode newNode = new ListNode (value);
    newNode.next = head;
    head = newNode;
  }
  public void insertLast (int value)
  {
    ListNode newNode = new ListNode (value);
    if (head == null)
      {
	head = newNode;
	return;
      }
    ListNode current = head;
    while (current.next != null)
      {
	current = current.next;
      }
    current.next = newNode;
  }
  public void delete( int position){
      
      if(position==1){
          head=head.next;
          
      }
      else{
          ListNode previous=head;
          int count=1;
          while(count<position-1){
              previous=previous.next;
              count++;
          }
          ListNode current=previous.next;
          previous.next=current.next;
  }}
  public ListNode deleteFirst()
  {
    if (head == null)
      {
	return null;
      }
    ListNode temp = head;
    head = head.next;
    temp.next = null;
    return temp;
  }
  public ListNode deleteLast(){
      if(head==null|| head.next==null)
      {
          return head;
          
      }
      ListNode current=head;
      ListNode previous=null;
      while(current.next!=null){
          previous=current;
          current=current.next;
      }
      previous.next=null;
      return current;
      
  }
  public void insert(int position, int value){
      ListNode node =new ListNode(value);
      if(position==1){
          node.next=head;
          head=node;
          
      }
      else{
          ListNode previous=head;
          int count=1;
          while(count<position-1){
              previous=previous.next;
              count++;
          }
          ListNode current=previous.next;
          previous.next=node;
          node.next=current;
      }
  }
   public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
            
        }
        return previous;
   }
   
    public ListNode getMid(){
        if(head==null){
            return null;
        }
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null && fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            
        }
        return fastptr;
    }
  public static void main (String[]args)
  {
    Main sll = new Main ();
    sll.insertFirst (10);
    
    sll.insertFirst (9);
    sll.insertFirst (8);
    sll.insertFirst (7);
    sll.insertLast (6);
    sll.insertLast (5);
    sll.insertLast (4);
    sll.insertLast (3);
    sll.insert(1,3);
     sll.insert(2,7);
     sll.insert(1,6);
     sll.insert(2,5);
     sll.insert(8,4);
     if(sll.searchvalue(12)){
    System.out.println("Search key found");
     }else{
         System.out.println("Search key not found");
     }
      if(sll.searchvalue(7)){
    System.out.println("Search key found");
     }else{
         System.out.println("Search key not found");
     }
     ListNode middle=sll.getMid();
    System.out.println(middle.data );
     sll.delete(8);
    //      sll.deleteFirst();
    //ListNode second=new ListNode(1);
    //ListNode third=new ListNode(8);
    //ListNode fourth=new ListNode(11);
    //sll.head.next=second;
    //second.next=third;
    //third.next=fourth;
    sll.display ();
    System.out.println(sll.deleteLast().data);

     System.out.println (sll.deleteFirst ().data);
    System.out.println (sll.length ());
  }
}



