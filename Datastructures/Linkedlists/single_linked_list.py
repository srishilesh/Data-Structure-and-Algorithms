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

    def delete_position(self,position):
        temp = self.head                # Assign head to temp variable
        c = 0                           # Keep track of the position
        if(position==0):                # If only head is present
            self.head = temp.next       # Remove it
            temp = None
            return
        while(temp.next is not None):   # Traverse till last before
            if(c==position):            # If position is found
                break                   # break
            prev = temp                 # Keep track of the node previous to the to be deleted one
            temp = temp.next
            c+=1                        # Increment position
        prev.next = temp.next           # Delete it
        temp = None

    # def deleteList(self):
    #     temp = self.head
    #     while(temp):
    #         prev = temp.next
    #         del temp.data
    #         temp = prev
        
    def count(self):
        temp = self.head            # Temporary initialization
        c = 0                       # Initial count
        while(temp):                # Traverse until end
            c+=1                    # Increment count
            temp = temp.next        # Move to the next node
        print(c)                    # Print
        return c

    def search(self,key):           # Iterative search 
        temp = self.head            # Initialize 
        while(temp):                # Traverse till the end
            if(temp.data==key):     # Find for the key
                print("True")
                return  
            temp = temp.next
        print("False")

    def search_recur(self,nod,key):     # Recursive search
        if(nod is None):                # If reached the end
            print("False")
            return
        if(nod.data==key):              # If the element is found
            print("True")
            return
        else:
            self.search_recur(nod.next,key)     # Recursive back with next node

    def getNth(self,position):
        temp = self.head             # Initialize
        c = 0
        while(temp):
            if(c==position):         # If position found
                print(temp.data)     # Print the data
                return
            c+=1
            temp = temp.next
        print("Not found")

    def getNthfromEnd(self,position):
        position = self.count() - position + 1
        self.getNth(position)

    def detectLoop(self):
        s = set()
        temp = self.head
        while(temp):
            if(temp in s):
                print("Loop Found")
                return True
            s.add(temp)
            temp = temp.next
        print("No Loop Found")
        return False

    def removeSortedDuplicates(self):
        temp = self.head                    # Point to the head node
        if(temp is None):                   # If only head is present
            return
        while(temp.next!=None):             # Traverse till the last before node
            temp1 = temp.next               # Keep track of the next noe
            if(temp.data == temp1.data):    # If current and the next node is the same
                x = temp1.next              # Delete the next node
                temp.next = None
                temp.next = x               # Point next of the deleted node to the current node
            else:
                temp = temp.next            # Or else move the node by one
        return 
        
    def removeUnsortedDuplicates(self):
        hashset = set()                     # Create an empty set for having unique elements
        temp = self.head                    # Create a starting node
        prev = None                         # Keep track of the previous element
        while(temp!=None):                  # Traverse till the end
            if(temp.data not in hashset):   # If element is unique
                hashset.add(temp.data)      # Add it to the set 
                prev = temp                 # Change the current to prev element 
            else:   
                prev.next = temp.next       # Delete the current node
            temp = temp.next                # Move to the next node

    def checkPalindrome(self):                      # To find if the Linked list consists of a palindrome
        stack = [-1]                                # Initialize the stack with some random value 
        temp = self.head                            # Keep two headers
        temp1 = self.head   
        while(temp1!=None):                         # Temp1 header for adding all the elements into the stack
            stack.append(temp1.data)
            temp1 = temp1.next
        while(temp!=None):                          # After adding all the elements to the stack
            if(stack[len(stack)-1] == temp.data):   # Pop one by one by matching the elements from the start
                stack.pop(len(stack)-1)             # Popping the element
            temp = temp.next
        if(len(stack)==1):                          # If the lenght of the stack is 1
            return True
        else:
            return False
            
            
                
        
        


if __name__=='__main__':
    llist = LinkedList()        # Create a class for LinkedList
    # llist.insertLast(6)
    # llist.insertFirst(7)
    # llist.insertFirst(1)
    # llist.insertLast(4)
    llist.insertLast('R')
    llist.insertLast('A')
    llist.insertLast('D')
    llist.insertLast('A')
    llist.insertLast('R')
    #llist.delete(7)
    #llist.delete_position(0)
    #llist.insertBetween(llist.head.next,8)
    #llist.deleteList()
    #llist.insertFirst(100)
    #llist.printList()
    #llist.count()
    #llist.search(7)
    #llist.search_recur(llist.head,20)
    #llist.getNth(10)
    #llist.getNthfromEnd(0)
    #llist.detectLoop()
    #llist.removeUnsortedDuplicates()
    print(llist.checkPalindrome())

