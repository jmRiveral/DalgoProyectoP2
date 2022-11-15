/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dalgoparte2proyecto;

// Java program to print DFS traversal from a given graph
/**
 *
 * @author LDSCD
 */
import java.io.*;
import java.util.*;
class Graph {
    private int V; // Number of vertices
    
    //This class represents a directed graph using adjacency list representation
    
    // Array of lists for Ajacency List Representation
    private LinkedList<Integer> adj[];
    
    //Constructor
    @SuppressWarnings("unchecked") Graph(int v)
    {
      V=v;
      adj = new LinkedList[v];
      for(int i=0; i<v; ++i)
          adj[i]=new LinkedList();
    }
      
      //Function to add edge into the graph
      void addEdge(int v, int w){
        adj[v].add(w);// add W to v's list.
      }
      // A function used by DFS 
      void DFSUtil(int v, boolean visited[]){
          //Mark the current node as visited and print it
          visited[v]=true;
          System.out.println(v + " ");
          // Recursion for all the vertices adjacent to this vertex
          Iterator<Integer> i= adj[v].listIterator();
          while (i.hasNext()){
              int n= i.next();
              if(!visited[n])
                  DFSUtil(n, visited);
              
          }
      }
          
         //the function to do DFS traversal. It usues recursive DFSUtil()
         void DFS(int v){
          //Mark all the vertices as not visited (set as false by default in Java)
          boolean visited[]=new boolean[V];
          //call the recursive helper function to print DFS traversal
          DFSUtil(v, visited);
          
          
          
      }
    public static void main(String args[]){
        Graph g =new Graph(4);
        
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        System.out.println("Following is Depth First Traversal" + "(starting from vertex2)");
        
        //Function call
        g.DFS(2);
    }
}
//This code is contributed by Aakasj Hasija
    
    
    
    

