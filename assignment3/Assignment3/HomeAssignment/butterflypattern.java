public class butterflypattern {
    public static void main(String[] args) {
        for (int i=0; i<10;i++) {
            for (int j=0; j<10;j++) {
                if(i==j)
                {
                    System.out.print("* ");
                }
                else if((i + j) == (10 - 1)){
  System.out.print("* ");
                }else if(j==0 || j==9){
  System.out.print("* ");
                }
                
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // Second 
                for (int i=0; i<10;i++) {
            for (int j=0; j<10;j++) {
                if(i==j)
                {
                    System.out.print("🦋 ");
                }
                else if((i + j) == (10 - 1)){
  System.out.print("🦋 ");
                }else if(j==0 || j==9){
  System.out.print("🦋 ");
                }
                // Left side
                else if( i == 4 && j ==3 ||  i == 5 && j ==3 ||  i == 6 && j ==3 ||  i == 5 && j ==2 ||  i == 4 && j ==2 || i == 4 && j ==1 || i == 2 && j ==1 || i == 3 && j ==1 ||  i == 3 && j ==2 ||  i == 7 && j ==2 ||  i == 6 && j ==1 ||  i == 5 && j ==1 ||  i == 7 && j ==1 || i==6 && j==2){
                        System.out.print("🦋 ");
               }
              // Rigjt side
              else if(i== 4 && j== 6 || i== 5 && j== 6 || j== 7 && i==4 || j== 7 && i==3 ||  j== 7 && i==5 ||  j== 7 && i==6 ||  j== 8 && i== 2 ||  j== 8 && i==3  ||  j== 8 && i==4 || j== 8 && i==5 ||  j== 8 && i==6 ||  j== 8 && i== 7 ){
                     System.out.print("🦋 ");
              }
               
        
              
         
                else{
                    System.out.print("☠️  ");
                }
            }
            System.out.println();
        }
    }
}
