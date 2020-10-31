class Graph:
    def __init__(self, V):
        self.V = V
        self.adj = [[] for i in range(V)]
    
    def addEdge(self, v, w):
        self.adj[v].append(w)
        self.adj[w].append(v)
    
    def connectedComponents(self):
        visited = []
        cc = []
        for i in range(self.V):
            visited.append(False)
        for v in range(self.V):
            if visited[v] == False:
                temp = []
                cc.append(self.DFS(temp, v, visited))
        return cc
    
    def DFS(self, temp, v, visited):
        visited[v] = True
        temp.append(v)
        for i in self.adj[v]:
            if visited[i] == False:
                temp = self.DFS(temp, i, visited)
        return temp
        
if __name__ == '__main__':
    g = Graph(5)
    g.addEdge(1, 0)
    g.addEdge(2, 3)
    g.addEdge(3, 4)
    cc = g.connectedComponents()
    print("The connected componenets are: ")
    print(cc)
