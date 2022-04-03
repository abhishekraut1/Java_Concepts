package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Problem {
//FastReader
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
    public FastReader()
    {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next()
    {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
    String nextLine()
    {
        String str = "";
        try {
            str = br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
// code
    static ArrayList<Integer> ar = new ArrayList<>();
    static PrintStream ps = new PrintStream(System.out);
    static FastReader fs = new FastReader();
    static void solver() {
        int c = fs.nextInt();
        if(c==1){
            int a = fs.nextInt();
            ar.add(a);
        }
        if(c==2){
            int b1= fs.nextInt();
            int b2 = fs.nextInt();
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
        int t = fs.nextInt();
        while(t-- >0){
            solver();
        }
        getter();
    }
}
