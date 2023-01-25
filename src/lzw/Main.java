package lzw;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
class main {
    public static void main(String[] args)
    {
        //ABAABABBAABAABAAAABABBBBBBBB
        List<String> list=new ArrayList<String>();
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        for(int i=0;i<=127;i++){
            String result = Character.toString(i) ;
            list.add(result);
        }
        //System.out.println(list);
        Scanner sc= new Scanner(System.in);

        List<Integer> decoded=new ArrayList<Integer>();
        while(sc.hasNextInt()){
            int a= sc.nextInt();
            decoded.add(a);
        }
        //System.out.println(decoded);
        List<String> result=new ArrayList<String>();
        for (int i=0;i<decoded.size();i++){
            if(i==0){
                result.add(list.get(decoded.get(i)));
            }
            else{
                if(decoded.get(i)>=list.size()){
                    String l = result.get(i-1);
                    l+=l.charAt(0);
                    list.add(l);
                    result.add(list.get(decoded.get(i)));
                }
                else{
                    result.add(list.get(decoded.get(i)));
                    String r = result.get(i);
                    list.add(result.get(i-1)+r.charAt(0));
                }
            }
        }
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i));
        }
    }

}
//65, 66, 65, 128, 128, 129, 131, 134, 130, 129, 66, 138, 139, 138