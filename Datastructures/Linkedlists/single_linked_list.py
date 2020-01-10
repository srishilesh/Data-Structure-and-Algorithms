# Creating a class to create new nodes with data and next fields
class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None    # Creation of head pointer

    def printList(self):
        temp = self.head        # Assigning the head to temp
        while(temp!=None):      # Traversing till the last
            print(temp.data)    # Printing
            temp = temp.next    # Moving to the next node

    def insertFirst(self,new_data):
        new_node = Node(new_data)   # Create a new node
        new_node.next = self.head   # Assign the next pointer of new_node to head
        self.head = new_node        # Make it as head

    def insertLast(self,new_data):
        new_node = Node(new_data)   # Create a new node
        if(self.head == None):      # If there are no nodes
            self.head = new_node    # Make it as first node
            return
        last = self.head            # Temporary assignment of head 
        while(last.next!=None):     # Traversing till last before
            last = last.next        # Moving to the next node
        last.next = new_node        # Assigning the last node as new_node

    def insertBetween(self,prev_node,new_data):
        new_node = Node(new_data)       # Create new node
        new_node.next = prev_node.next  # Assign the next of new_node to next of prev_node
        prev_node.next = new_node       # Assign the next of prev_node to new_node

    def delete(self,del_key):
        temp = self.head                # Assign temp as temporary head
        if(temp is not None):           # If head has del_key
            if(temp.data == del_key):
                self.head = temp.next   # Make the next node as head
                temp = None             # Make the current node to None
                return
        while(temp is not None):        # Traverse till the end of the list
            if(temp.data == del_key):   # If matches
                break                   # break
            prev = temp                 # Keep track of the previous node
            temp = temp.next            # Move to the next node
        prev.next = temp.next           # Assign the previous node to the next to next node
        temp = None                     # Make the current node to None

            
if __name__=='__main__':
    llist = LinkedList()        # Create a class for LinkedList
    llist.insertLast(6)
    llist.insertFirst(7)
    llist.insertFirst(1)
    llist.insertLast(4)
    llist.delete(7)
    llist.insertBetween(llist.head.next,8)
    llist.printList()