class Node:
    def __init__(self,key):
        self.left = None
        self.right = None
        self.val = key

def inorder(root):
    if root:
        inorder(root.left)
        print(root.val)
        inorder(root.right)

def insert(root,node):
    if root is None:
        root = node
    else:
        if root.val<node.val:
            if root.right is None:
                root.right = node
            else:
                insert(root.right,node)
        else:
            if root.left is None:
                root.left = node
            else:
                insert(root.left,node)

def maxDepth(node): 
    if node is None: 
        return 0 
    else : 
        lDepth = maxDepth(node.left) 
        rDepth = maxDepth(node.right)  
        if (lDepth > rDepth): 
            return lDepth+1
        else: 
            return rDepth+1

n = int(input())                
x = list(map(int,input().split()))

r = Node(x[0])
for i in range(1,n):
    insert(r,Node(x[i]))
#inorder(r)
print(maxDepth(r))
        
