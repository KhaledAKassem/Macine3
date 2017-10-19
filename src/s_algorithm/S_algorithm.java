
package s_algorithm;


public class S_algorithm {

    public static void main(String[] args) {
        //Traing of Data
        String data [][]={{"sunny","warm","normal","strong","warm","same","yes"},
                          {"sunny","warm","high","strong","warm","same","yes"},
                          {"rainy","cold","high","strong","warm","change","no"}
                         ,{"sunny","warm","high","strong","cool","change","yes" }
        };
        
        System.out.println(""+"\t-------Find S Algorithm -----");
        System.out.println("\t-------All Hyprothesis------");
        String specific_data[]=new String[6];
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                  if(i==0 && j!=6){
                if(data[i][6].equals("yes")){
                   specific_data[j]=data[i][j];
                    System.out.print(specific_data[j]+"\t");
                }
                  }
                  else if(j!=6){
                      if(data[i][6].equals("yes")){
                          if(specific_data[j]==data[i][j]){
                              
                          }
                          else{
                              specific_data[j]="?";
                          }
                      }
                      System.out.print(specific_data[j]+"\t");
                  }

        }
            System.out.println(" ");
    }
    
}
}
