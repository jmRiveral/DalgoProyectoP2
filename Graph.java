package com.mycompany.dalgoparte2proyecto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.InputStreamReader;

class Graph{
    
   
    private Map<String, List<String>> adjVertices;
    
    public ArrayList<String> V;// un arreglo de vertices
    public String elem;
    Graph(ArrayList<String> v, String paramElem){
        V=v; // un arreglo de vertices
        elem=paramElem; //un elemento de ese arreglo
        for(int i=0;i< v.size()-1;i++){
            if(!(v.get(i).equals(v.get(i+1)))){
                
                adjVertices.put(v.get(i), v);
            }
        }
        
        
    }
    
    
    void addVertex(String label){
        adjVertices.putIfAbsent(label, new ArrayList<>());
    }
    void addEdge(String label1, String label2){
        adjVertices.get(label1).add(label2);
        }
    public void topologicalSortUtil(String vertice,HashMap<String,Boolean> visited,Stack<String> stack){
        visited.put(vertice, true);
        String i;
        Iterator<String> it = adjVertices.get(vertice).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited.get(i))
                topologicalSortUtil(i, visited, stack);
        }
        
        stack.push(new String(vertice));
        
        
    }
    public List<String> topologicalSort(){
        Stack<String> stack= new Stack<String>();
        HashMap<String, Boolean> visited= new HashMap <String, Boolean>();
        ArrayList<String> vertex= new ArrayList<String>();
        for(Map.Entry<String, List<String>> set: adjVertices.entrySet()){
          visited.put(set.getKey(), false);
          vertex.add(set.getKey());
        }
        for( int i=0;i<vertex.size(); i++){
            String vertice = vertex.get(i);
            if(visited.get(vertice)==false){
                topologicalSortUtil(vertice, visited, stack);
            }
            
        }
        ArrayList<String> tp= new ArrayList<String>();
        while (stack.empty() == false)
            tp.add(stack.pop());
        
        return tp;
    }


public class Graph{
    public static void main(String[]args) throws Exception{
        Graph instancia = new Graph();
        try(InputStreamReader is = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(is);){
            String line = br.readLine();
            int casos = Integer.parseInt(line);
            line = br.readLine();
            final ArrayList palabras = new ArrayList();
            for (int i =0; i<casos && line != null && line.length()>0;i++){
                palabras.clear();
                String enteros = br.readLine();
                int n = Integer.parseInt(enteros.substring(0,0));
                int m = Integer.parseInt(enteros.substring(1,1));
                line = br.readLine();
                for (int j =0; j<n && line != null && line.length()>0;j++){
                    line= line.substring(1);
                    final ArrayList listalinea = new ArrayList();
                    line = br.readLine();
            }


        }
    }
}
    
    
    
}
