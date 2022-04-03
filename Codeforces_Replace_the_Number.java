package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Codeforces_Replace_the_Number {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer> ar = new ArrayList<>();
    static PrintStream ps = new PrintStream(System.out);
    static void solver() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int c = Integer.parseInt(st.nextToken());
        if(c==1){
            int a = Integer.parseInt(st.nextToken());
            ar.add(a);
        }
        if(c==2){
            int b1= Integer.parseInt(st.nextToken());
            int b2 = Integer.parseInt(st.nextToken());
            for(int i=0;i<ar.size();i++)
                if(ar.get(i) ==b1)
                    ar.set(i,b2);
        }
    }
    static void getter(){
        for(int i=0;i<ar.size();i++){
            ps.print(ar.get(i)+" ");
        }
    }
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            solver();
        }
        getter();
    }
}
