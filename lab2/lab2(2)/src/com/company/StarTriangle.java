package com.company;

public class StarTriangle {
    int width;

    StarTriangle(int width){
        this.width = width;
    }

   public  String toString(){
        String res = "";
        for(int i = 0; i <= this.width; i++){
            for (int j = 0; j < i; j++){
                //System.out.print("[*]");
                res += "[*]";
            }
            //System.out.print("\n");
            res+= "\n";
        }

        return res;
   }
}
